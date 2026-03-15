package com.hospital.model;

/**
 * Patient class representing a patient in the hospital system.
 * Extends Person class and adds ailment information.
 */
public class Patient extends Person {
    private String ailment;
    
    /**
     * Constructor for Patient class
     * @param id Unique identifier for the patient
     * @param name Full name of the patient
     * @param ailment Patient's current medical condition/ailment
     */
    public Patient(String id, String name, String ailment) {
        super(id, name);
        this.ailment = ailment;
    }
    
    /**
     * Gets the patient's ailment
     * @return String representing the patient's ailment
     */
    public String getAilment() {
        return ailment;
    }
    
    /**
     * Sets the patient's ailment
     * @param ailment New ailment for the patient
     */
    public void setAilment(String ailment) {
        this.ailment = ailment;
    }
    
    /**
     * Displays patient's information in a formatted record
     */
    @Override
    public void displayInfo() {
        System.out.println("=== PATIENT RECORD ===");
        System.out.println("ID: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("Ailment: " + ailment);
        System.out.println("=====================");
    }
}
