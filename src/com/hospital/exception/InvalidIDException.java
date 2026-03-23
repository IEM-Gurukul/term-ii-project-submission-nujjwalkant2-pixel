package com.hospital.exception;

/**
 * Custom checked exception for handling cases where a Patient or Doctor ID
 * is not found in the hospital system.
 * This is a checked exception, meaning it must be caught or declared.
 */
public class InvalidIDException extends Exception {
    
    /**
     * Constructor for InvalidIDException
     * @param message Detailed error message describing the invalid ID issue
     */
    public InvalidIDException(String message) {
        super(message);
    }
    
    /**
     * Constructor with cause for InvalidIDException
     * @param message Detailed error message
     * @param cause The underlying cause of the exception
     */
    public InvalidIDException(String message, Throwable cause) {
        super(message, cause);
    }
}
