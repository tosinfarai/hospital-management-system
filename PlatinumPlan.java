/*
 * A subclass of class HealthInsurancePlan with coverage of 0.9
 */


public class PlatinumPlan extends HealthInsurancePlan {
    
    PlatinumPlan () {
        coverage = 0.9;
    }
    
    @Override
    public double computeMonthlyPremium (double salary){
       double monthlyPremium = 0.08 * salary;
       return monthlyPremium;
    }
        
}
