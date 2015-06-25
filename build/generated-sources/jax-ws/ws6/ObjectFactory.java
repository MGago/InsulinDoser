
package ws6;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ws6 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _BackgroundInsulinDose_QNAME = new QName("http://service.calculator.server.qcs2015.fla.com/", "background_insulin_dose");
    private final static QName _MealtimeInsulinDoseResponse_QNAME = new QName("http://service.calculator.server.qcs2015.fla.com/", "mealtime_insulin_doseResponse");
    private final static QName _PersonalInsulinSensitivityResponse_QNAME = new QName("http://service.calculator.server.qcs2015.fla.com/", "personal_insulin_sensitivityResponse");
    private final static QName _PersonalInsulinSensitivity_QNAME = new QName("http://service.calculator.server.qcs2015.fla.com/", "personal_insulin_sensitivity");
    private final static QName _MealtimeInsulinDose_QNAME = new QName("http://service.calculator.server.qcs2015.fla.com/", "mealtime_insulin_dose");
    private final static QName _BackgroundInsulinDoseResponse_QNAME = new QName("http://service.calculator.server.qcs2015.fla.com/", "background_insulin_doseResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ws6
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MealtimeInsulinDoseResponse }
     * 
     */
    public MealtimeInsulinDoseResponse createMealtimeInsulinDoseResponse() {
        return new MealtimeInsulinDoseResponse();
    }

    /**
     * Create an instance of {@link BackgroundInsulinDose }
     * 
     */
    public BackgroundInsulinDose createBackgroundInsulinDose() {
        return new BackgroundInsulinDose();
    }

    /**
     * Create an instance of {@link BackgroundInsulinDoseResponse }
     * 
     */
    public BackgroundInsulinDoseResponse createBackgroundInsulinDoseResponse() {
        return new BackgroundInsulinDoseResponse();
    }

    /**
     * Create an instance of {@link PersonalInsulinSensitivity }
     * 
     */
    public PersonalInsulinSensitivity createPersonalInsulinSensitivity() {
        return new PersonalInsulinSensitivity();
    }

    /**
     * Create an instance of {@link PersonalInsulinSensitivityResponse }
     * 
     */
    public PersonalInsulinSensitivityResponse createPersonalInsulinSensitivityResponse() {
        return new PersonalInsulinSensitivityResponse();
    }

    /**
     * Create an instance of {@link MealtimeInsulinDose }
     * 
     */
    public MealtimeInsulinDose createMealtimeInsulinDose() {
        return new MealtimeInsulinDose();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BackgroundInsulinDose }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.calculator.server.qcs2015.fla.com/", name = "background_insulin_dose")
    public JAXBElement<BackgroundInsulinDose> createBackgroundInsulinDose(BackgroundInsulinDose value) {
        return new JAXBElement<BackgroundInsulinDose>(_BackgroundInsulinDose_QNAME, BackgroundInsulinDose.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MealtimeInsulinDoseResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.calculator.server.qcs2015.fla.com/", name = "mealtime_insulin_doseResponse")
    public JAXBElement<MealtimeInsulinDoseResponse> createMealtimeInsulinDoseResponse(MealtimeInsulinDoseResponse value) {
        return new JAXBElement<MealtimeInsulinDoseResponse>(_MealtimeInsulinDoseResponse_QNAME, MealtimeInsulinDoseResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonalInsulinSensitivityResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.calculator.server.qcs2015.fla.com/", name = "personal_insulin_sensitivityResponse")
    public JAXBElement<PersonalInsulinSensitivityResponse> createPersonalInsulinSensitivityResponse(PersonalInsulinSensitivityResponse value) {
        return new JAXBElement<PersonalInsulinSensitivityResponse>(_PersonalInsulinSensitivityResponse_QNAME, PersonalInsulinSensitivityResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonalInsulinSensitivity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.calculator.server.qcs2015.fla.com/", name = "personal_insulin_sensitivity")
    public JAXBElement<PersonalInsulinSensitivity> createPersonalInsulinSensitivity(PersonalInsulinSensitivity value) {
        return new JAXBElement<PersonalInsulinSensitivity>(_PersonalInsulinSensitivity_QNAME, PersonalInsulinSensitivity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MealtimeInsulinDose }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.calculator.server.qcs2015.fla.com/", name = "mealtime_insulin_dose")
    public JAXBElement<MealtimeInsulinDose> createMealtimeInsulinDose(MealtimeInsulinDose value) {
        return new JAXBElement<MealtimeInsulinDose>(_MealtimeInsulinDose_QNAME, MealtimeInsulinDose.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BackgroundInsulinDoseResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.calculator.server.qcs2015.fla.com/", name = "background_insulin_doseResponse")
    public JAXBElement<BackgroundInsulinDoseResponse> createBackgroundInsulinDoseResponse(BackgroundInsulinDoseResponse value) {
        return new JAXBElement<BackgroundInsulinDoseResponse>(_BackgroundInsulinDoseResponse_QNAME, BackgroundInsulinDoseResponse.class, null, value);
    }

}
