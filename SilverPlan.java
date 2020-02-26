/*
 * A subclass of class HealthInsurancePlan with coverage of 0.7
 * Premium to be deducted is calculated with 0.06 of salary and monthly premium based on the insurance brand BlueCrossBlueShield
 */


public class SilverPlan extends HealthInsurancePlan {
    
    SilverPlan () {
    	setCoverage(0.7);
    }
    
    @Override
    public double computeMonthlyPremium (double salary, int age, boolean smoking){
       return 0.06 * salary + getOfferedBy().computeMonthlyPremium(this,age,smoking);
       
    }
    
}

