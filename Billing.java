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
public class Billing {
     public static double[] computePaymentAmount(Patient patient, double amount) {
        
        double[] payments = new double[2];
        
        HealthInsurancePlan patientInsurancePlan = patient.getInsurancePlan();
        double insuranceCoverage = patientInsurancePlan.getCoverage();
        
        double insurancePay = amount * insuranceCoverage;
        double patientPay = amount - insurancePay;
        
        
        if (insuranceCoverage == 0.9) {
            patientPay = patientPay - 50.0;    
        } else if (insuranceCoverage == 0.8) {
            patientPay = patientPay - 40.0;
        } else if (insuranceCoverage == 0.7) {
            patientPay = patientPay - 30.0;
        } else if (insuranceCoverage == 0.6) {
            patientPay = patientPay - 25.0;
        } else {
            patientPay = patientPay - 20.0;
        }
        
        payments[0] = insurancePay;
        payments[1] = patientPay;

        return payments;
    }
}
