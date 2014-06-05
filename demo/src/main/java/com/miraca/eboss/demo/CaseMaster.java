package com.miraca.eboss.demo;

/**
 * This class was automatically generated by the data modeler tool.
 * $HASH(246734186b811397e089f231ccc23889)
 */
public class CaseMaster extends java.lang.Object implements java.io.Serializable {

    static final long serialVersionUID = 1L;
    
    @org.kie.api.definition.type.Position(value = 2)
    private com.miraca.eboss.demo.Demographic caseDemographic;
    
    @org.kie.api.definition.type.Position(value = 1)
    private com.miraca.eboss.demo.CaseSource caseSource;
    
    @org.kie.api.definition.type.Position(value = 3)
    private java.util.List<com.miraca.eboss.demo.ChargeLine> chargeLine;
    
    @org.kie.api.definition.type.Position(value = 4)
    private java.lang.String found;
    
    @org.kie.api.definition.type.Position(value = 0)
    private com.miraca.eboss.demo.WeatherInfo weatherInfo;

    public CaseMaster() {
    }

    public CaseMaster(com.miraca.eboss.demo.WeatherInfo weatherInfo, com.miraca.eboss.demo.CaseSource caseSource, com.miraca.eboss.demo.Demographic caseDemographic, java.util.List<com.miraca.eboss.demo.ChargeLine> chargeLine, java.lang.String found) {
        this.weatherInfo = weatherInfo;
        this.caseSource = caseSource;
        this.caseDemographic = caseDemographic;
        this.chargeLine = chargeLine;
        this.found = found;
    }


    
    public com.miraca.eboss.demo.Demographic getCaseDemographic() {
        return this.caseDemographic;
    }

    public void setCaseDemographic(com.miraca.eboss.demo.Demographic caseDemographic) {
        this.caseDemographic = caseDemographic;
    }
    
    public com.miraca.eboss.demo.CaseSource getCaseSource() {
        return this.caseSource;
    }

    public void setCaseSource(com.miraca.eboss.demo.CaseSource caseSource) {
        this.caseSource = caseSource;
    }
    
    public java.util.List<com.miraca.eboss.demo.ChargeLine> getChargeLine() {
        return this.chargeLine;
    }

    public void setChargeLine(java.util.List<com.miraca.eboss.demo.ChargeLine> chargeLine) {
        this.chargeLine = chargeLine;
    }
    
    public java.lang.String getFound() {
        return this.found;
    }

    public void setFound(java.lang.String found) {
        this.found = found;
    }
    
    public com.miraca.eboss.demo.WeatherInfo getWeatherInfo() {
        return this.weatherInfo;
    }

    public void setWeatherInfo(com.miraca.eboss.demo.WeatherInfo weatherInfo) {
        this.weatherInfo = weatherInfo;
    }
}