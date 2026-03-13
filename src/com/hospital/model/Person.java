package com.hospital.model;

/**
 * Abstract base class for all persons in the hospital system.
 * Contains common attributes and behaviors for doctors and patients.
 */
public abstract class Person {
    private String id;
    private String name;
    
    /**
     * Constructor for Person class
     * @param id Unique identifier for the person
     * @param name Full name of the person
     */
    public Person(String id, String name) {
        this.id = id;
        this.name = name;
    }
    
    /**
     * Gets the person's ID
     * @return String representing the person's ID
     */
    public String getId() {
        return id;
    }
    
    /**
     * Gets the person's name
     * @return String representing the person's name
     */
    public String getName() {
        return name;
    }
    
    /**
     * Abstract method to display person-specific information
     * Must be implemented by all concrete subclasses
     */
    public abstract void displayInfo();
}
