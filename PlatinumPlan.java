/*
 * A subclass of class HealthInsurancePlan with coverage of 0.9
 * Premium to be deducted is calculated with 0.08 of salary and monthly premium based on the insurance brand BlueCrossBlueShield
 */

public class PlatinumPlan extends HealthInsurancePlan {
    
    PlatinumPlan () {
        setCoverage(0.9);
    }
    
    @Override
    public double computeMonthlyPremium (double salary, int age, boolean smoking){
       return 0.08 * salary + getOfferedBy().computeMonthlyPremium(this,age,smoking);
       
    }
        
}
