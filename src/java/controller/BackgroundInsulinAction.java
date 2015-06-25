package controller;

import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionSupport;
import java.util.ArrayList;
import model.Value;
import model.Voter;

public class BackgroundInsulinAction extends ActionSupport  {
    private Voter voter;
    private String dose;
    private ArrayList<Value> values;
    
    private int weight = -1;

    public ArrayList<Value> getValues() {
        return values;
    }

    public void setValues(ArrayList<Value> values) {
        this.values = values;
    }
    
    @Override
    public String execute() {
        if(!verifyData())
            return ERROR;
        
        voter = new Voter(weight);
        
        values = voter.calculate();
        
        dose = Integer.toString(values.get(0).getValue());
        
        return SUCCESS;
    }
    
    public Boolean verifyData(){
        if(weight < 40 || weight > 130){
            addActionError("Invalid input: weight");
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

    public double getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    
}
