/*
 * A subclass of class HealthInsurancePlan with coverage of 0.6
 premium to be deducted is calculated with 0.05 of salary and monthly premium based on the insurance brand BlueCrossBlueShield
 */

public class BronzePlan extends HealthInsurancePlan {
    
    BronzePlan () {
        coverage = 0.6;
    }
    
    @Override
    public double computeMonthlyPremium (double salary, int age, boolean smoking){
       return 0.05 * salary + getOfferedBy().computeMonthlyPremium(this,age,smoking);
       
    }
    
}
