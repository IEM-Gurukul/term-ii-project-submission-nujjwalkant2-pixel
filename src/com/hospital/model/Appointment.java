package com.hospital.model;

/**
 * Appointment class representing a scheduled appointment between a patient and a doctor.
 * Contains references to both participants and the scheduled date.
 */
public class Appointment {
    private Patient patient;
    private Doctor doctor;
    private String date;
    
    /**
     * Constructor for Appointment class
     * @param patient The patient scheduled for the appointment
     * @param doctor The doctor conducting the appointment
     * @param date The scheduled date of the appointment
     */
    public Appointment(Patient patient, Doctor doctor, String date) {
        this.patient = patient;
        this.doctor = doctor;
        this.date = date;
    }
    
    /**
     * Gets the patient for this appointment
     * @return Patient object
     */
    public Patient getPatient() {
        return patient;
    }
    
    /**
     * Sets the patient for this appointment
     * @param patient New patient for the appointment
     */
    public void setPatient(Patient patient) {
        this.patient = patient;
    }
    
    /**
     * Gets the doctor for this appointment
     * @return Doctor object
     */
    public Doctor getDoctor() {
        return doctor;
    }
    
    /**
     * Sets the doctor for this appointment
     * @param doctor New doctor for the appointment
     */
    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }
    
    /**
     * Gets the appointment date
     * @return String representing the appointment date
     */
    public String getDate() {
        return date;
    }
    
    /**
     * Sets the appointment date
     * @param date New date for the appointment
     */
    public void setDate(String date) {
        this.date = date;
    }
    
    /**
     * Displays complete appointment details by calling displayInfo() methods
     * of both patient and doctor, along with appointment date.
     */
    public void showAppointmentDetails() {
        System.out.println("=== APPOINTMENT DETAILS ===");
        System.out.println("Appointment Date: " + date);
        System.out.println();
        System.out.println("Patient Information:");
        patient.displayInfo();
        System.out.println();
        System.out.println("Doctor Information:");
        doctor.displayInfo();
        System.out.println("============================");
    }
}
