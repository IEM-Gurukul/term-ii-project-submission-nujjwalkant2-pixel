package com.hospital.model;

/**
 * Interface defining medical service behaviors that can be performed
 * by medical professionals in the hospital system.
 * Demonstrates abstraction through interface implementation.
 */
public interface MedicalService {
    
    /**
     * Performs a medical checkup on a patient.
     * This method must be implemented by any class that implements this interface.
     */
    void performCheckup();
}
