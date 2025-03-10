package BradescoJavaCloudNative.OOP.EnumsExamples;

public enum BrazilianStates {
    SAO_PAULO ("SP", "São Paulo"),
    RIO_DE_JANEIRO ("RJ", "Rio de Janeiro"),
    PIAUI ("PI", "Piauí"),
    MARANHAO ("MA", "Maranhão"),
    CEARA ("CE", "Ceará");

    private String name;
    private String stateCode;

    BrazilianStates(String stateCode, String name) {
        this.stateCode = stateCode;
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getStateCode() {
        return stateCode;
    }
    public void setStateCode(String stateCode) {
        this.stateCode = stateCode;
    }

    public String getUpperCaseName() {
        return name.toUpperCase();
    }
}
