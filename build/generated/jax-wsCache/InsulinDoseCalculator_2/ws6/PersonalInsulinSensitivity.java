
package ws6;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for personal_insulin_sensitivity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="personal_insulin_sensitivity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="physicalActivity" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="physicalSamples" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="bloodSamples" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "personal_insulin_sensitivity", propOrder = {
    "physicalActivity",
    "physicalSamples",
    "bloodSamples"
})
public class PersonalInsulinSensitivity {

    protected int physicalActivity;
    @XmlElement(type = Integer.class)
    protected List<Integer> physicalSamples;
    @XmlElement(type = Integer.class)
    protected List<Integer> bloodSamples;

    /**
     * Gets the value of the physicalActivity property.
     * 
     */
    public int getPhysicalActivity() {
        return physicalActivity;
    }

    /**
     * Sets the value of the physicalActivity property.
     * 
     */
    public void setPhysicalActivity(int value) {
        this.physicalActivity = value;
    }

    /**
     * Gets the value of the physicalSamples property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the physicalSamples property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPhysicalSamples().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getPhysicalSamples() {
        if (physicalSamples == null) {
            physicalSamples = new ArrayList<Integer>();
        }
        return this.physicalSamples;
    }

    /**
     * Gets the value of the bloodSamples property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bloodSamples property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBloodSamples().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getBloodSamples() {
        if (bloodSamples == null) {
            bloodSamples = new ArrayList<Integer>();
        }
        return this.bloodSamples;
    }

}
