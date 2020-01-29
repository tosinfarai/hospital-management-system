/*
 * Superclass encompassing all insurance plans a patient can use
 * Variable coverage is declared with default which will be initialized in the different subclass of this class
 */


public class HealthInsurancePlan {
    
    double coverage; 
    private InsuranceBrand offeredBy;
    
    public double getCoverage () {
        return coverage;
    }
    public void setCoverage (double coverage) {
        this.coverage = coverage;
    }
    
    public abstract double computeMonthlyPremium (double salary);
    
    public InsuranceBrand getOfferedBy() {
	return offeredBy;
    }

    public void setOfferedBy(InsuranceBrand offeredBy) {
	this.offeredBy = offeredBy;
    }
    
}

