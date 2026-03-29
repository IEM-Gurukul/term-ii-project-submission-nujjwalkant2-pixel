# Hospital Appointment & Record Management System (HARMS)
## Final Project Report

**Student:** Ujjwal Kant  
**Course:** PCCCS495 - Term II  
**Submission Date:** March 2026  


---

## Executive Summary

This report documents the complete development of the Hospital Appointment & Record Management System (HARMS), a comprehensive Java console application designed to streamline healthcare facility operations through efficient digital record management. The system successfully implements all required Object-Oriented Programming principles and provides a robust solution for patient management, doctor scheduling, and appointment booking with data persistence capabilities.

---

## Project Overview

### System Description
HARMS is a menu-driven console application that enables healthcare facilities to manage patient records, maintain doctor information, and schedule appointments efficiently. The system addresses the critical need for digital transformation in healthcare record-keeping by providing centralized data management with robust error handling and file-based persistence.

### Key Objectives
- Implement comprehensive patient record management
- Enable efficient appointment scheduling between patients and doctors
- Provide robust data persistence through file storage
- Demonstrate mastery of Object-Oriented Programming concepts
- Create user-friendly console interface with input validation

---



### Architecture
The system follows a layered architecture with clear separation of concerns:

```
com.hospital/
├── Main.java              (Presentation Layer)
├── model/                 (Model Layer)
│   ├── Person.java         (Abstract Base Class)
│   ├── Doctor.java         (Inheritance)
│   ├── Patient.java        (Inheritance)
│   ├── MedicalService.java  (Interface)
│   └── Appointment.java    (Composition)
├── service/                (Service Layer)
│   └── HospitalManager.java (Business Logic)
└── exception/              (Exception Layer)
    └── InvalidIDException.java (Custom Exception)
```

### Core Technologies
- **Language:** Java 8+
- **Data Structures:** ArrayList for dynamic storage
- **File I/O:** BufferedReader/BufferedWriter for CSV persistence
- **Design Patterns:** Composition, Inheritance, Interface Implementation
- **Error Handling:** Custom checked exceptions

---

## OOP Concepts Implementation

### 1. Abstraction
- **Person Class:** Abstract base class defining common attributes (id, name) and behaviors (displayInfo())
- **MedicalService Interface:** Defines contract for medical services with performCheckup() method
- **Encapsulation:** Private fields with public getter/setter methods

### 2. Inheritance
- **Doctor Class:** Extends Person, adds specialization field
- **Patient Class:** Extends Person, adds ailment field
- **Constructor Usage:** Proper super() calls to initialize parent class attributes
- **Method Overriding:** displayInfo() implementations specific to each subclass

### 3. Polymorphism
- **Interface Implementation:** Doctor implements MedicalService interface
- **Method Overriding:** Different displayInfo() behaviors for Doctor vs Patient
- **Dynamic Binding:** Runtime method resolution based on object type

### 4. Exception Handling
- **Custom Exception:** InvalidIDException for handling invalid patient/doctor searches
- **Checked Exception:** Forces proper error handling in calling code
- **Graceful Degradation:** User-friendly error messages and recovery

### 5. Collections
- **ArrayList Usage:** Dynamic storage for patients, doctors, and appointments
- **Generic Types:** List<Doctor>, List<Patient>, List<Appointment>
- **Iteration:** Enhanced for loops for data processing

---

## Feature Implementation

### Patient Management
- **Add Patients:** Capture ID, name, and ailment information
- **Store Records:** Persistent storage in ArrayList with validation
- **Search Functionality:** findPatientById() with exception handling
- **Display Options:** Formatted patient record output

### Doctor Management
- **Add Doctors:** Capture ID, name, and specialization
- **Medical Services:** performCheckup() method implementation
- **Profile Management:** Complete doctor information handling
- **Display Records:** Professional formatted output

### Appointment System
- **Booking Process:** Link patients with doctors for specific dates
- **Composition Pattern:** Appointment contains Patient and Doctor objects
- **Date Tracking:** String-based date storage and display
- **Detail Views:** Complete appointment information with participant details

### Data Persistence
- **File Writing:** savePatientsToFile() with CSV format (id,name,ailment)
- **File Reading:** loadPatientsFromFile() with proper parsing and validation
- **Error Handling:** IOException and FileNotFoundException management
- **Data Integrity:** Trim operations and format validation

### User Interface
- **Menu System:** 6-option interactive menu with clear navigation
- **Input Validation:** NumberFormatException handling for menu choices
- **Error Recovery:** Graceful handling of invalid inputs
- **User Feedback:** Success/error messages for all operations

---

## Development Process

### Methodology
1. **Incremental Development:** Task-by-task implementation approach
2. **Test-Driven:** Each component tested before integration
3. **Version Control:** Meaningful commits for each major feature
4. **Documentation:** Comprehensive README and code comments
5. **Quality Assurance:** Input validation and error handling

### Git Commit History
1. **feat:** Add abstract Person base class with package structure
2. **feat:** Add Doctor and Patient inheritance classes
3. **feat:** Add MedicalService interface and implementation
4. **feat:** Add custom exception handling with InvalidIDException
5. **feat:** Add Appointment class with composition
6. **feat:** Add HospitalManager service with ArrayList collections
7. **feat:** Add patient search with exception handling
8. **feat:** Add file writing for patient persistence
9. **feat:** Add file reading for data loading
10. **feat:** Complete HARMS with Main console UI menu system

---

## Testing and Validation

### Test Coverage
- **Unit Testing:** Individual method testing for all classes
- **Integration Testing:** Complete workflow testing with sample data
- **Exception Testing:** Invalid ID searches and error scenarios
- **File Testing:** Save/load operations with various data sets
- **UI Testing:** Menu navigation and input validation

### Test Results
- ✅ All OOP concepts properly implemented
- ✅ Exception handling working correctly
- ✅ File persistence functioning as expected
- ✅ User interface responsive and intuitive
- ✅ Data integrity maintained throughout operations

---

## Challenges and Solutions

### Technical Challenges
1. **File I/O Complexities:** Resolved through proper exception handling and resource management
2. **Input Validation:** Implemented comprehensive validation for all user inputs
3. **Data Consistency:** Ensured proper object relationships and data flow
4. **Menu State Management:** Handled continuous loop with proper exit conditions

### Design Decisions
1. **CSV Format:** Chosen comma-separated values for simplicity and compatibility
2. **ArrayList Selection:** Preferred for dynamic sizing and ease of use
3. **Exception Strategy:** Used checked exceptions to enforce proper error handling
4. **Interface Design:** Simple text-based interface for universal compatibility

---

## Performance Analysis

### System Efficiency
- **Time Complexity:** O(n) for search operations, O(1) for additions
- **Space Complexity:** O(n) where n is number of stored records
- **File Operations:** Buffered I/O for optimal performance
- **Memory Usage:** Efficient object creation and garbage collection

### Scalability Assessment
- **Current Capacity:** Suitable for small to medium healthcare facilities
- **Expansion Potential:** Architecture supports future enhancements
- **Database Migration:** Structure ready for database integration
- **Web Interface:** Foundation prepared for web-based implementation

---

## Future Enhancements

### Recommended Improvements
1. **Database Integration:** Replace file storage with relational database
2. **Web Interface:** Develop browser-based application
3. **Advanced Search:** Implement multiple criteria search capabilities
4. **Reporting System:** Generate statistical reports and analytics
5. **User Authentication:** Add login system and role-based access
6. **Appointment Reminders:** Email/SMS notification system
7. **Medical History:** Track patient visit history over time
8. **Billing Module:** Integrate appointment and treatment billing

### Technical Debt
1. **Error Logging:** Implement comprehensive logging system
2. **Configuration Files:** External configuration management
3. **Unit Testing:** Add JUnit test suite
4. **Code Documentation:** Generate Javadoc documentation

---

## Conclusion

The Hospital Appointment & Record Management System (HARMS) successfully meets all project requirements and demonstrates comprehensive understanding of Object-Oriented Programming principles. The system provides a robust foundation for healthcare facility digitization while maintaining clean code architecture and user-friendly operation.

### Key Achievements
- ✅ Complete implementation of all 10 required tasks
- ✅ Proper OOP concept demonstration
- ✅ Working file persistence system
- ✅ Professional error handling throughout
- ✅ Intuitive user interface design
- ✅ Comprehensive documentation and testing

### Learning Outcomes
- Mastered Java collections and file I/O operations
- Implemented complex inheritance hierarchies
- Developed custom exception handling strategies
- Created comprehensive user interface systems
- Applied software engineering best practices

