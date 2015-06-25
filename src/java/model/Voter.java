package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;

public class Voter {

    public static final int MEALTIME_INSULINE = 0;
    public static final int PERSONAL_INSULINE = 1;
    public static final int BACKGROUND_INSULINE = 2;
    public static final int TIMEOUT = -9;
    public static final int NOT_USED = -8;

    private LinkedBlockingQueue<Value> queue = new LinkedBlockingQueue<Value>();

    private int type;
    private int carbsMeal;
    private int carbsUnit;
    private int actualBloodSugar;
    private int targetBloodSugar;
    private int individualSensitivity;
    private int weight;
    private int physicalActivity;
    private List physicalSamples;
    private List bloodSamples;

    public Voter(int carbsMeal, int carbsUnit, int actualBloodSugar,
            int targetBloodSugar, int individualSensitivity) {

        this.type = MEALTIME_INSULINE;
        this.carbsMeal = carbsMeal;
        this.carbsUnit = carbsUnit;
        this.actualBloodSugar = actualBloodSugar;
        this.targetBloodSugar = targetBloodSugar;
        this.individualSensitivity = individualSensitivity;
    }

    public Voter(int carbsMeal, int carbsUnit, int actualBloodSugar,
            int targetBloodSugar, int physicalActivity,
            List physicalSamples, List bloodSamples) {

        this.type = PERSONAL_INSULINE;
        this.carbsMeal = carbsMeal;
        this.carbsUnit = carbsUnit;
        this.actualBloodSugar = actualBloodSugar;
        this.targetBloodSugar = targetBloodSugar;
        this.physicalActivity = physicalActivity;
        this.physicalSamples = physicalSamples;
        this.bloodSamples = bloodSamples;
    }

    public Voter(int weight) {
        this.type = BACKGROUND_INSULINE;
        this.weight = weight;
    }

    private ArrayList<Value> wsCalls = new ArrayList<Value>();
    private int lastWSPos = 0;

    public void callWSs(int amount) {

        for (int i = lastWSPos;
                (i < listener.ListWebServices.availableWS.size())
                && (i < lastWSPos + amount);
                i++) {
            WebService ws = listener.ListWebServices.availableWS.get(i);

            Value value = new Value(ws.getUrl(), NOT_USED);
            wsCalls.add(value);
            Thread t = connect(ws);
            listener.ListWebServices.timeController.regist(t, this, value);
        }
        lastWSPos += amount;
    }

    public ArrayList<Value> calculate() {
        ArrayList<Value> insulinDoses = new ArrayList<Value>(); // Insulin doses values

        boolean success = false, timeout = false;
        Value dequeueDoses; // Received dose values from Webservices
        Thread threadTimeOut = timeOut(); // Thread that counts timeout

        callWSs(3); //Call 3 webservices

        while (!success && !timeout) {
            System.out.println("AAAAAAAAAAAQQQQQQQQQQQUUUUUUUUUUIIIIIIIIII");

            try {
                dequeueDoses = queue.take();
                if (dequeueDoses.getValue() < 0) {
                    if (dequeueDoses.getValue() == TIMEOUT) {
                        System.out.println("TIMEOUT GERAL");
                        timeout = true;
                        break;
                    }
                } else {
                    remove(wsCalls, dequeueDoses.getUrl());
                    insulinDoses.add(dequeueDoses);

                    if (insulinDoses.size() >= 3) {
                        int dose = verifyMajority(insulinDoses);
                        if (dose >= 0) {
                            success = true;
                            threadTimeOut.stop();
                            insulinDoses.addAll(wsCalls);
                            insulinDoses.add(0, new Value(dose));
                            return insulinDoses;
                        } else {
                            callWSs(1); //call 1 more ws
                        }
                    }
                }
            } catch (InterruptedException ex) {
                System.out.println("DEBUG: " + ex);
                break;
            }
        }

        insulinDoses.addAll(wsCalls);
        insulinDoses.add(0, new Value(-1));
        return insulinDoses;
    }

    public Thread connect(final WebService ws) {
        Runnable r = new Runnable() {

            @Override
            public void run() {
                switch (type) {
                    case MEALTIME_INSULINE:
                        System.out.println("case MEALTIME_INSULINE");
                        queue.add(new Value(ws.getUrl(), ws.mealtimeInsulinDose(carbsMeal,
                                carbsUnit, actualBloodSugar, targetBloodSugar, individualSensitivity)));
                        break;
                    case PERSONAL_INSULINE:
                        System.out.println("case PERSONAL_INSULINE");
                        queue.add(new Value(ws.getUrl(), ws.personalInsulinSensitivity(carbsMeal,
                                carbsUnit, actualBloodSugar, targetBloodSugar, physicalActivity,
                                physicalSamples, bloodSamples)));
                        break;
                    case BACKGROUND_INSULINE:
                        System.out.println("case BACKGROUND_INSULINE");
                        queue.add(new Value(ws.getUrl(), ws.backgroundInsulinDose(weight)));
                        break;
                    default:
                        break;
                }
            }
        };
        Thread t = new Thread(r);
        t.start();

        return t;
    }

    public Thread timeOut() {
        Runnable r = new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(3500);
                    queue.add(new Value("Time Out", TIMEOUT));
                } catch (InterruptedException ex) {
                    System.out.println("DEBUD thread timeOut: " + ex);
                }
            }
        };

        Thread threadTimeOut = new Thread(r);
        threadTimeOut.start();

        return threadTimeOut;
    }

    public int verifyMajority(ArrayList<Value> insulinDoses) {

        if (insulinDoses.size() < 3) {
            return -1;
        }

        System.out.println("VERIFY MAJORITY");
        int listSize = insulinDoses.size();

        Collections.sort(insulinDoses, new Comparator<Value>() {

            @Override
            public int compare(Value o1, Value o2) {
                if (o1.getValue() < o2.getValue()) {
                    return -1;
                } else {
                    return 1;
                }
            }
        });

        int maxIndex = 0;
        int maxAgreeableWS = 1;
        int maxCurrent = 1;

        double dose = 0;

        for (Value insulinDose : insulinDoses) {
            System.out.println("*insulinDose = " + insulinDose.getValue());
        }

        for (int i = 0; i < listSize; i++) {
            for (int j = i + 1; j < listSize; j++) {

                if (insulinDoses.get(j).getValue() - insulinDoses.get(i).getValue() <= 1) {
                    maxCurrent++;
                }

                if (maxCurrent > maxAgreeableWS) {
                    maxAgreeableWS = maxCurrent;
                    maxIndex = i;
                }
            }
            maxCurrent = 1;
        }

        if (maxAgreeableWS >= (listSize / 2) + 1) {
            for (int i = maxIndex; i < maxIndex + maxAgreeableWS; i++) {
                insulinDoses.get(i).setState("Used by Voter");
                dose += insulinDoses.get(i).getValue();
            }
            dose /= maxAgreeableWS;
            return (int) Math.round(dose);
        } else {
            return -1;
        }

    }

    private void remove(ArrayList<Value> wsErrors, String url) {
        Value temp = null;
        for (Value wsError : wsErrors) {
            if (wsError.getUrl().equals(url)) {
                temp = wsError;
                break;
            }
        }
        if (temp != null) {
            wsErrors.remove(temp);
        }
    }

}
