/*
 * A subclass of class HealthInsurancePlan with coverage of 0.8
 premium to be deducted is calculated with 0.07 of salary and monthly premium based on the insurance brand BlueCrossBlueShield
 */


public class GoldPlan extends HealthInsurancePlan {
    
    GoldPlan () {
        coverage = 0.8;
    }
    
    @Override
    public double computeMonthlyPremium (double salary, int age, boolean smoking){
       return 0.07 * salary + getOfferedBy().computeMonthlyPremium(this,age,smoking);
       
    }
    
}
