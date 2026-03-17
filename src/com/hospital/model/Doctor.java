package com.hospital.model;

/**
 * Doctor class representing a medical professional in the hospital system.
 * Extends Person class and adds specialization information.
 * Implements MedicalService interface to provide medical checkup functionality.
 */
public class Doctor extends Person implements MedicalService {
    private String specialization;
    
    /**
     * Constructor for Doctor class
     * @param id Unique identifier for the doctor
     * @param name Full name of the doctor
     * @param specialization Doctor's medical specialization
     */
    public Doctor(String id, String name, String specialization) {
        super(id, name);
        this.specialization = specialization;
    }
    
    /**
     * Gets the doctor's specialization
     * @return String representing the doctor's specialization
     */
    public String getSpecialization() {
        return specialization;
    }
    
    /**
     * Sets the doctor's specialization
     * @param specialization New specialization for the doctor
     */
    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
    
    /**
     * Performs a medical checkup as required by MedicalService interface.
     * Prints a message indicating the doctor is performing a checkup.
     */
    @Override
    public void performCheckup() {
        System.out.println("Doctor " + getName() + " is performing a checkup on specialization " + specialization);
    }
    
    /**
     * Displays doctor's information in a formatted record
     */
    @Override
    public void displayInfo() {
        System.out.println("=== DOCTOR RECORD ===");
        System.out.println("ID: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("Specialization: " + specialization);
        System.out.println("====================");
    }
}
