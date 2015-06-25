
package ws6;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for mealtime_insulin_dose complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mealtime_insulin_dose">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="carbsMeal" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="carbsUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="actualBloodSugar" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="targetBloodSugar" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="individualSensivity" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mealtime_insulin_dose", propOrder = {
    "carbsMeal",
    "carbsUnit",
    "actualBloodSugar",
    "targetBloodSugar",
    "individualSensivity"
})
public class MealtimeInsulinDose {

    protected int carbsMeal;
    protected int carbsUnit;
    protected int actualBloodSugar;
    protected int targetBloodSugar;
    protected int individualSensivity;

    /**
     * Gets the value of the carbsMeal property.
     * 
     */
    public int getCarbsMeal() {
        return carbsMeal;
    }

    /**
     * Sets the value of the carbsMeal property.
     * 
     */
    public void setCarbsMeal(int value) {
        this.carbsMeal = value;
    }

    /**
     * Gets the value of the carbsUnit property.
     * 
     */
    public int getCarbsUnit() {
        return carbsUnit;
    }

    /**
     * Sets the value of the carbsUnit property.
     * 
     */
    public void setCarbsUnit(int value) {
        this.carbsUnit = value;
    }

    /**
     * Gets the value of the actualBloodSugar property.
     * 
     */
    public int getActualBloodSugar() {
        return actualBloodSugar;
    }

    /**
     * Sets the value of the actualBloodSugar property.
     * 
     */
    public void setActualBloodSugar(int value) {
        this.actualBloodSugar = value;
    }

    /**
     * Gets the value of the targetBloodSugar property.
     * 
     */
    public int getTargetBloodSugar() {
        return targetBloodSugar;
    }

    /**
     * Sets the value of the targetBloodSugar property.
     * 
     */
    public void setTargetBloodSugar(int value) {
        this.targetBloodSugar = value;
    }

    /**
     * Gets the value of the individualSensivity property.
     * 
     */
    public int getIndividualSensivity() {
        return individualSensivity;
    }

    /**
     * Sets the value of the individualSensivity property.
     * 
     */
    public void setIndividualSensivity(int value) {
        this.individualSensivity = value;
    }

}
