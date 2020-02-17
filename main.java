/*
 * main class provided for testing and printing to console
 */
public class main {
    
    public static void main(String[]args) {
        
        User staff = new User();
        InsuranceBrand insuranceBrand = new BlueCrossBlueShield();
        HealthInsurancePlan insurancePlan = new PlatinumPlan();
        
        insurancePlan.setOfferedBy(insuranceBrand);
        staff.setInsurancePlan(insurancePlan);
        System.out.println(insurancePlan.computeMonthlyPremium(8000, 56, false));
        
        
    }
    
}
