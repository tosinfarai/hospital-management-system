/*
 * main class provided for testing and printing to console
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
