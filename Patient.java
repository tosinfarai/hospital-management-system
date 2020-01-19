/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hms;

/**
 *
 * @author tosin
 */
public class Patient extends User{
    
    private long patientId;
    private boolean insured;
    
    public long getPatientId () {
        return patientId;
    }
    public void setPatientId (long patientId) {
        this.patientId = patientId;
    }
    
    public boolean isInsured () {
        return insured;
    }
    public void setInsured (boolean insured) {
        this.insured = insured;
    }
    
    private HealthInsurancePlan insurancePlan; 
    
    public HealthInsurancePlan getInsurancePlan () {
        return insurancePlan;
    }
    public void setInsurancePlan (HealthInsurancePlan insurancePlan) {
        this.insurancePlan = insurancePlan;
    }
     
}
