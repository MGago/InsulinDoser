package model;

import java.util.List;

public class WebService1 extends WebService {

    private final String url = "http://qcs01.dei.uc.pt:8080/InsulinDoseCalculator?wsdl";

    ws1.InsulinDoseCalculatorService service = new ws1.InsulinDoseCalculatorService();
    ws1.InsulinDoseCalculator port = service.getInsulinDoseCalculatorPort();

    public WebService1() {
    }

    @Override
    public int mealtimeInsulinDose(int m1, int m2, int m3, int m4, int m5) {
        int dose = port.mealtimeInsulinDose(m1, m2, m3, m4, m5);
        return dose;
    }

    @Override
    public int personalInsulinSensitivity(int m1, int m2, int m3, int m4, int m5, List m6, List m7) {
        int dose = port.personalSensitivityToInsulin(m5, m6, m7);
        dose = port.mealtimeInsulinDose(m1, m2, m3, m4, dose);
         System.out.println("WS1: personalInsulinSensitivity: dose = "+dose);
        return dose;
    }


    @Override
    public int backgroundInsulinDose(int m1) {
//        return 999;
        return port.backgroundInsulinDose(m1);
    }

    @Override
    public String getUrl() {
        return url;
    }

}
