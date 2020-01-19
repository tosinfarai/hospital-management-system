/*
 * This class evaluates the total bill a patient is to pay. 
 * It has one method that takes a patient method and initial amount before insurance is applied.
 * It returns a string of type double with the first element as what the insurance company pays and the second element as what the patient pays after discounts are applied. 
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
