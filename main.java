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
public class main {
    
    public static void main(String[]args) {
        HealthInsurancePlan insurancePlan = new PlatinumPlan();
        Patient patient = new Patient();
        patient.setInsurancePlan(insurancePlan);
        
        double[] payments = Billing.computePaymentAmount(patient, 950.0);
        
        System.out.println(payments[0] + " " + payments[1]);
        
    }
    
}
