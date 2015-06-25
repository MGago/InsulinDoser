package controller;

import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionSupport;
import java.util.ArrayList;
import model.Value;
import model.Voter;


public class MealtimeInsulinAction extends ActionSupport  {
    private Voter voter;
    private String dose;
    private ArrayList<Value> values;
    private String url;
    private int value;
    
    private int carbsMeal = -1;
    private int carbsUnit = -1;
    private int actualBloodSugar = -1;
    private int targetBloodSugar = -1;
    private int individualSensitivity = -1;
    
    @Override
    public String execute() {
        if(!verifyData())
            return ERROR;
        
        voter = new Voter(carbsMeal, carbsUnit, actualBloodSugar, targetBloodSugar, individualSensitivity);
        
        values = voter.calculate();
        
        dose = Integer.toString(values.get(0).getValue());
        
        if (values.get(0).getValue() < 0){
            addActionError("Service not available.");
            return ERROR;
        }
        else{
            return SUCCESS;
        }
        
    }
    
    public Boolean verifyData(){
        if(carbsMeal < 60 || carbsMeal > 120){
            addActionError("Invalid input: total grams of carbohydrates in the meal");
        }else if(carbsUnit < 10 || carbsUnit > 15){
            addActionError("Invalid input: total grams of carbohydrates processed by 1 unit");
        }else if(actualBloodSugar < 120 || actualBloodSugar > 250){
            addActionError("Invalid input: actual blood sugar level");
        }else if(targetBloodSugar < 80 || targetBloodSugar > 120){
            addActionError("Invalid input: target blood sugar level");
        }else if(individualSensitivity < 15 || individualSensitivity > 100){
            addActionError("Invalid input: individual sensitivity");
        }else{
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

    public int getIndividualSensitivity() {
        return individualSensitivity;
    }

    public void setIndividualSensitivity(int individualSensitivity) {
        this.individualSensitivity = individualSensitivity;
    }

    public ArrayList<Value> getValues() {
        return values;
    }

    public void setValues(ArrayList<Value> values) {
        this.values = values;
    }
    
    public String getUrl() {
        return url;
    }

    public int getValue() {
        return value;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setValue(int value) {
        this.value = value;
    }

}
