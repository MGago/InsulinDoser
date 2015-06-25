package model;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class WebService6 extends WebService {

    private final String url = "http://qcs16.dei.uc.pt:8080/InsulinDoseCalculator";

    ws6.InsulinDoseCalculatorService service = new ws6.InsulinDoseCalculatorService();
    ws6.InsulinDoseCalculator port = service.getInsulinDoseCalculatorPort();

    public WebService6() {
    }

    @Override
    public int mealtimeInsulinDose(int m1, int m2, int m3, int m4, int m5) {
        int dose = port.mealtimeInsulinDose(m1, m2, m3, m4, m5);
        return dose;
    }

    @Override
    public int personalInsulinSensitivity(int m1, int m2, int m3, int m4, int m5, List m6, List m7) {
        System.out.println("WS6: personalInsulinSensitivity");

//        for (int i = 0; i < m6.size(); i++) {
//            System.out.println("m6(" + i + "):" + m6.get(i) + " | m7(" + i + ")" + m7.get(i));
//        }
        int dose = port.personalInsulinSensitivity(m5, m6, m7);
        dose = port.mealtimeInsulinDose(m1, m2, m3, m4, dose);
        System.out.println("WS6: personalInsulinSensitivity: dose = " + dose);
        return dose;
    }

    @Override
    public int backgroundInsulinDose(int m1) {

//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException ex) {
//            Logger.getLogger(WebService6.class.getName()).log(Level.SEVERE, null, ex);
//        }

        return port.backgroundInsulinDose(m1);
    }

    @Override
    public String getUrl() {
        return url;
    }

}
