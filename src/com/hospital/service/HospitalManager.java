package com.hospital.service;

import com.hospital.model.Doctor;
import com.hospital.model.Patient;
import com.hospital.model.Appointment;
import com.hospital.exception.InvalidIDException;
import java.util.ArrayList;
import java.util.List;

/**
 * HospitalManager class manages all hospital data and operations.
 * Uses ArrayList collections to store doctors, patients, and appointments.
 * Provides methods for adding and managing hospital records.
 */
public class HospitalManager {
    private List<Doctor> doctors;
    private List<Patient> patients;
    private List<Appointment> appointments;
    
    /**
     * Constructor for HospitalManager
     * Initializes empty ArrayList collections for all data types.
     */
    public HospitalManager() {
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
        this.appointments = new ArrayList<>();
    }
    
    /**
     * Adds a new patient to the patient list
     * @param patient Patient object to be added
     */
    public void addPatient(Patient patient) {
        patients.add(patient);
        System.out.println("Patient " + patient.getName() + " added successfully.");
    }
    
    /**
     * Adds a new doctor to the doctor list
     * @param doctor Doctor object to be added
     */
    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
        System.out.println("Doctor " + doctor.getName() + " added successfully.");
    }
    
    /**
     * Finds a patient by their ID
     * @param id The ID of the patient to search for
     * @return Patient object if found
     * @throws InvalidIDException if patient with given ID is not found
     */
    public Patient findPatientById(String id) throws InvalidIDException {
        for (Patient patient : patients) {
            if (patient.getId().equals(id)) {
                return patient;
            }
        }
        throw new InvalidIDException("Patient with ID " + id + " not found.");
    }
    
    /**
     * Gets the list of all doctors
     * @return List of Doctor objects
     */
    public List<Doctor> getDoctors() {
        return doctors;
    }
    
    /**
     * Gets the list of all patients
     * @return List of Patient objects
     */
    public List<Patient> getPatients() {
        return patients;
    }
    
    /**
     * Gets the list of all appointments
     * @return List of Appointment objects
     */
    public List<Appointment> getAppointments() {
        return appointments;
    }
    
    /**
     * Displays all patients in the system
     */
    public void displayAllPatients() {
        System.out.println("=== ALL PATIENTS ===");
        if (patients.isEmpty()) {
            System.out.println("No patients found.");
        } else {
            for (int i = 0; i < patients.size(); i++) {
                System.out.println("Patient #" + (i + 1) + ":");
                patients.get(i).displayInfo();
                System.out.println();
            }
        }
        System.out.println("====================");
    }
    
    /**
     * Displays all doctors in the system
     */
    public void displayAllDoctors() {
        System.out.println("=== ALL DOCTORS ===");
        if (doctors.isEmpty()) {
            System.out.println("No doctors found.");
        } else {
            for (int i = 0; i < doctors.size(); i++) {
                System.out.println("Doctor #" + (i + 1) + ":");
                doctors.get(i).displayInfo();
                System.out.println();
            }
        }
        System.out.println("===================");
    }
    
    /**
     * Displays all appointments in the system
     */
    public void displayAllAppointments() {
        System.out.println("=== ALL APPOINTMENTS ===");
        if (appointments.isEmpty()) {
            System.out.println("No appointments found.");
        } else {
            for (int i = 0; i < appointments.size(); i++) {
                System.out.println("Appointment #" + (i + 1) + ":");
                appointments.get(i).showAppointmentDetails();
                System.out.println();
            }
        }
        System.out.println("========================");
    }
    
    /**
     * Test method to demonstrate findPatientById with exception handling
     * This method shows how the exception handling works as required by the task
     */
    public static void testFindPatientById() {
        HospitalManager manager = new HospitalManager();
        
        // Add some test patients
        manager.addPatient(new Patient("P001", "John Doe", "Fever"));
        manager.addPatient(new Patient("P002", "Jane Smith", "Headache"));
        
        // Test successful search
        try {
            Patient foundPatient = manager.findPatientById("P001");
            System.out.println("Found patient: " + foundPatient.getName());
            foundPatient.displayInfo();
        } catch (InvalidIDException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        // Test unsuccessful search (should throw exception)
        try {
            Patient notFoundPatient = manager.findPatientById("P999");
            System.out.println("Found patient: " + notFoundPatient.getName());
        } catch (InvalidIDException e) {
            System.out.println("Error: " + e.getMessage());
            System.out.println("Exception handling working correctly!");
        }
    }
}
