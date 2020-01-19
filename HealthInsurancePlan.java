/*
 * Superclass encompassing all insurance plans a patient can use
 * Variable coverage is declared with default which will be initialized in the different subclass of this class
 */


public class HealthInsurancePlan {
    
    double coverage; 
    
    public double getCoverage () {
        return coverage;
    }
    public void setCoverage (double coverage) {
        this.coverage = coverage;
    }
    
}

