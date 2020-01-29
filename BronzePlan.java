/*
 * A subclass of class HealthInsurancePlan with coverage of 0.6
 */

public class BronzePlan extends HealthInsurancePlan {
    
    BronzePlan () {
        coverage = 0.6;
    }
    
    @Override
    public double computeMonthlyPremium (double salary){
       double monthlyPremium = 0.05 * salary;
       return monthlyPremium;
    }
    
}
