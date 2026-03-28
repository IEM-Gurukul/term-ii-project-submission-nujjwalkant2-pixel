package com.hospital;

import com.hospital.model.Doctor;
import com.hospital.model.Patient;
import com.hospital.model.Appointment;
import com.hospital.service.HospitalManager;
import com.hospital.exception.InvalidIDException;
import java.util.Scanner;
import java.io.IOException;

/**
 * Main class - Entry point for the Hospital Appointment & Record Management System (HARMS)
 * Provides a console-based user interface with menu-driven functionality
 */
public class Main {
    private static HospitalManager manager = new HospitalManager();
    private static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        // Load existing patients from file at startup
        try {
            manager.loadPatientsFromFile();
        } catch (IOException e) {
            System.out.println("Note: Could not load patient data from file.");
        }
        
        // Main application loop
        while (true) {
            displayMenu();
            int choice = getMenuChoice();
            
            switch (choice) {
                case 1:
                    addPatient();
                    break;
                case 2:
                    addDoctor();
                    break;
                case 3:
                    bookAppointment();
                    break;
                case 4:
                    viewAllRecords();
                    break;
                case 5:
                    saveAndExit();
                    return; // Exit the program
                default:
                    System.out.println("Invalid choice! Please enter a number between 1 and 5.");
            }
            
            System.out.println(); // Add blank line for readability
        }
    }
    
    /**
     * Displays the main menu options to the user
     */
    private static void displayMenu() {
        System.out.println("=== HOSPITAL APPOINTMENT & RECORD MANAGEMENT SYSTEM ===");
        System.out.println("1. Add Patient");
        System.out.println("2. Add Doctor");
        System.out.println("3. Book Appointment");
        System.out.println("4. View All Records");
        System.out.println("5. Save and Exit");
        System.out.println("======================================================");
        System.out.print("Enter your choice (1-5): ");
    }
    
    /**
     * Gets and validates user menu choice
     * @return validated integer choice
     */
    private static int getMenuChoice() {
        try {
            int choice = Integer.parseInt(scanner.nextLine());
            return choice;
        } catch (NumberFormatException e) {
            return -1; // Invalid choice
        }
    }
    
    /**
     * Handles adding a new patient
     */
    private static void addPatient() {
        System.out.println("\n=== ADD NEW PATIENT ===");
        
        System.out.print("Enter Patient ID: ");
        String id = scanner.nextLine();
        
        System.out.print("Enter Patient Name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter Patient Ailment: ");
        String ailment = scanner.nextLine();
        
        Patient patient = new Patient(id, name, ailment);
        manager.addPatient(patient);
    }
    
    /**
     * Handles adding a new doctor
     */
    private static void addDoctor() {
        System.out.println("\n=== ADD NEW DOCTOR ===");
        
        System.out.print("Enter Doctor ID: ");
        String id = scanner.nextLine();
        
        System.out.print("Enter Doctor Name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter Doctor Specialization: ");
        String specialization = scanner.nextLine();
        
        Doctor doctor = new Doctor(id, name, specialization);
        manager.addDoctor(doctor);
    }
    
    /**
     * Handles booking a new appointment
     */
    private static void bookAppointment() {
        System.out.println("\n=== BOOK APPOINTMENT ===");
        
        // Get patient
        System.out.print("Enter Patient ID: ");
        String patientId = scanner.nextLine();
        
        try {
            Patient patient = manager.findPatientById(patientId);
            
            // Get doctor
            System.out.print("Enter Doctor ID: ");
            String doctorId = scanner.nextLine();
            
            // For simplicity, we'll create a dummy doctor search
            // In a real system, you'd implement findDoctorById
            System.out.print("Enter Doctor Name (for this demo): ");
            String doctorName = scanner.nextLine();
            System.out.print("Enter Doctor Specialization: ");
            String doctorSpec = scanner.nextLine();
            Doctor doctor = new Doctor(doctorId, doctorName, doctorSpec);
            
            // Get date
            System.out.print("Enter Appointment Date (e.g., 2024-03-25): ");
            String date = scanner.nextLine();
            
            Appointment appointment = new Appointment(patient, doctor, date);
            System.out.println("Appointment booked successfully!");
            appointment.showAppointmentDetails();
            
        } catch (InvalidIDException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    /**
     * Displays all records in the system
     */
    private static void viewAllRecords() {
        System.out.println("\n=== VIEW ALL RECORDS ===");
        
        manager.displayAllPatients();
        System.out.println();
        
        manager.displayAllDoctors();
        System.out.println();
        
        manager.displayAllAppointments();
    }
    
    /**
     * Saves data and exits the application
     */
    private static void saveAndExit() {
        System.out.println("\n=== SAVING DATA ===");
        
        try {
            manager.savePatientsToFile();
            System.out.println("Patient data saved successfully!");
        } catch (IOException e) {
            System.out.println("Error saving patient data: " + e.getMessage());
        }
        
        System.out.println("Thank you for using HARMS!");
        scanner.close();
    }
}
