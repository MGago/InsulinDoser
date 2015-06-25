package model;

import java.util.List;

public abstract class WebService {

    abstract public int mealtimeInsulinDose(int m1, int m2, int m3, int m4, int m5);

    abstract public int personalInsulinSensitivity(int m1, int m2, int m3, int m4, int m5, List m6, List m7);

    abstract public int backgroundInsulinDose(int m1);

    abstract public String getUrl();
}
