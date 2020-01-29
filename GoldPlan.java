/*
 * A subclass of class HealthInsurancePlan with coverage of 0.8
 */


public class GoldPlan extends HealthInsurancePlan {
    
    GoldPlan () {
        coverage = 0.8;
    }

    @Override
    public double computeMonthlyPremium (double salary){
       double monthlyPremium = 0.07 * salary;
       return monthlyPremium;
    }
    
}
