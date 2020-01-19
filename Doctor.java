/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hms;

/**
 *
 * @author tosin
 */
public class Doctor extends Staff{
    
    private long doctorId;
    private String specialization;
    
    public long getDoctorId() {
        return doctorId;
    }
    public void setDoctorId (long doctorId) {
        this.doctorId = doctorId;
    }
    
    public String getSpecialization () {
        return specialization;
    }
    public void setSpecialization (String specialization) {
        this.specialization = specialization;
    }
    
}
