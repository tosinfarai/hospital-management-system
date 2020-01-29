/*
 * A subclass of class HealthInsurancePlan with coverage of 0.7
 */


public class SilverPlan extends HealthInsurancePlan {
    
    SilverPlan () {
        coverage = 0.7;
    }
    
    @Override
    public double computeMonthlyPremium (double salary){
       double monthlyPremium = 0.06 * salary;
       return monthlyPremium;
    }
}
