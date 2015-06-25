package controller;

import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionSupport;
import java.util.ArrayList;
import model.Value;
import model.Voter;

public class PersonalInsulinAction extends ActionSupport {

    private Voter voter;
    private String dose;
    private ArrayList<Value> values;

    private int carbsMeal = -1;
    private int carbsUnit = -1;
    private int actualBloodSugar = -1;
    private int targetBloodSugar = -1;
    private int physicalActivity = -1;

    private ArrayList<Integer> physicalSamples = new ArrayList<Integer>();
    private ArrayList<Integer> bloodSamples = new ArrayList<Integer>();

    public ArrayList<Value> getValues() {
        return values;
    }

    public void setValues(ArrayList<Value> values) {
        this.values = values;
    }

    @Override
    public String execute() {

        if (!verifyData()) {
            return ERROR;
        }

        voter = new Voter(carbsMeal, carbsUnit, actualBloodSugar, targetBloodSugar,
                physicalActivity, physicalSamples, bloodSamples);

        values = voter.calculate();

        dose = Integer.toString(values.get(0).getValue());

        return SUCCESS;
    }

    public Boolean verifyData() {
        if (carbsMeal < 60 || carbsMeal > 120) {
            addActionError("Invalid input: total grams of carbohydrates in the meal");
        } else if (carbsUnit < 10 || carbsUnit > 15) {
            addActionError("Invalid input: total grams of carbohydrates processed by 1 unit");
        } else if (actualBloodSugar < 120 || actualBloodSugar > 250) {
            addActionError("Invalid input: actual blood sugar level");
        } else if (targetBloodSugar < 80 || targetBloodSugar > 120) {
            addActionError("Invalid input: target blood sugar level");
        } else if (physicalActivity < 0 || physicalActivity > 10) {
            addActionError("Invalid input: today's physical activity");
        } else {
            return true;
        }

        return false;
    }

    public String getDose() {
        return dose;
    }

    public void setDose(String dose) {
        this.dose = dose;
    }

    public int getCarbsMeal() {
        return carbsMeal;
    }

    public void setCarbsMeal(int carbsMeal) {
        this.carbsMeal = carbsMeal;
    }

    public int getCarbsUnit() {
        return carbsUnit;
    }

    public void setCarbsUnit(int carbsUnit) {
        this.carbsUnit = carbsUnit;
    }

    public int getActualBloodSugar() {
        return actualBloodSugar;
    }

    public void setActualBloodSugar(int actualBloodSugar) {
        this.actualBloodSugar = actualBloodSugar;
    }

    public int getTargetBloodSugar() {
        return targetBloodSugar;
    }

    public void setTargetBloodSugar(int targetBloodSugar) {
        this.targetBloodSugar = targetBloodSugar;
    }

    public int getPhysicalActivity() {
        return physicalActivity;
    }

    public void setPhysicalActivity(int physicalActivity) {
        this.physicalActivity = physicalActivity;
    }

    public ArrayList<Integer> getPhysicalSamples() {
        return physicalSamples;
    }

    public void setPhysicalSamples(ArrayList<Integer> physicalSamples) {
        this.physicalSamples = physicalSamples;
    }

    public ArrayList<Integer> getBloodSamples() {
        return bloodSamples;
    }

    public void setBloodSamples(ArrayList<Integer> bloodSamples) {
        this.bloodSamples = bloodSamples;
    }

}
