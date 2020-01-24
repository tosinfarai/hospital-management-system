/*
 * This class evaluates the total bill a patient is to pay. 
 * It has one method that takes a patient method and initial amount before insurance is applied.
 * It returns a string of type double with the first element as what the insurance company pays and the second element as what the patient pays after discounts are applied. 
 */


public class Billing {
     public static double[] computePaymentAmount(Patient patient, double amount) {
        
        double[] payments = new double[2];
        
        HealthInsurancePlan patientInsurancePlan = patient.getInsurancePlan();
        double insurancePay = 0.0;
        
        if (patientInsurancePlan != null) {
            insurancePay = amount * patientInsurancePlan.getCoverage();
            payments[0] = insurancePay;
        }

        if (patientInsurancePlan instanceof PlatinumPlan) {
            payments[1] = amount - insurancePay - 50.0;    
        } else if (patientInsurancePlan instanceof GoldPlan) {
            payments[1] = amount - insurancePay - 40.0;
        } else if (patientInsurancePlan instanceof SilverPlan) {
            payments[1] = amount - insurancePay - 30.0;
        } else if (patientInsurancePlan instanceof BronzePlan) {
            payments[1] = amount - insurancePay - 25.0;
        } else {
            payments[1] = amount - insurancePay - 20.0;
        }
       
        System.out.println("Insurance Company: " + payments[0]);
        System.out.println("Patient: " + payments[1]);

        return payments;
    }
}
