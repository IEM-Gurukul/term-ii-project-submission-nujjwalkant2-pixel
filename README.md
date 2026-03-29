# PCCCS495 – Term II Project

## Project Title

**Hospital Appointment & Record Management System (HARMS)**

---

## Problem Statement (max 150 words)

HARMS is a comprehensive Java console application designed to streamline hospital operations by managing patient records, doctor information, and appointment scheduling. The system addresses the need for efficient healthcare data management by providing a centralized platform for storing patient medical histories, maintaining doctor specializations, and booking appointments. Built following Object-Oriented Programming principles, HARMS offers robust data persistence through file storage, exception handling for error management, and an intuitive menu-driven interface. The system ensures data integrity, supports search functionality, and provides a complete solution for small to medium-sized healthcare facilities seeking digital transformation of their record-keeping processes.

---

## Target User

**Healthcare Facilities and Medical Staff:**
- Hospital administrators
- Doctors and medical practitioners  
- Receptionists and scheduling staff
- Small clinics and medical centers

---

## Core Features

- **Patient Management:** Add, store, and retrieve patient records with ID, name, and medical ailment information
- **Doctor Management:** Maintain doctor profiles with ID, name, and specialization details
- **Appointment Booking:** Schedule appointments between patients and doctors with date tracking
- **Data Persistence:** Save and load patient data to/from text files using CSV format
- **Search Functionality:** Find patients by ID with custom exception handling for invalid searches
- **Comprehensive Reporting:** View all patients, doctors, and appointments in formatted displays
- **Interactive Console UI:** Menu-driven interface with input validation and error handling

---

## OOP Concepts Used

- **Abstraction:** Abstract Person class and MedicalService interface defining common behaviors
- **Inheritance:** Doctor and Patient classes extending Person base class with super() constructor usage
- **Polymorphism:** Method overriding in displayInfo() and interface implementation in Doctor class
- **Exception Handling:** Custom InvalidIDException for robust error management and user feedback
- **Collections:** ArrayList implementation for dynamic data storage and management of multiple record types

---

## Proposed Architecture Description

HARMS follows a layered architecture with clear separation of concerns:

**Model Layer (com.hospital.model):**
- Person (abstract base class)
- Doctor, Patient (concrete implementations)
- MedicalService (interface)
- Appointment (composition class)

**Service Layer (com.hospital.service):**
- HospitalManager (central data management)
- Handles all CRUD operations and business logic

**Exception Layer (com.hospital.exception):**
- InvalidIDException (custom checked exception)

**Presentation Layer (com.hospital):**
- Main class with interactive console menu system

The system uses composition for Appointment-Doctor-Patient relationships and implements proper encapsulation with private fields and public accessors.

---

## How to Run

### Prerequisites
- Java Development Kit (JDK) 8 or higher
- Command line terminal or IDE with Java support

### Compilation and Execution

**Using Command Line:**
```bash
cd src
javac com/hospital/Main.java com/hospital/model/*.java com/hospital/service/*.java com/hospital/exception/*.java
java com.hospital.Main
```

**Using VS Code:**
1. Open project folder in VS Code
2. Open terminal (Ctrl + `)
3. Navigate to src directory: `cd src`
4. Compile: `javac com/hospital/Main.java com/hospital/model/*.java com/hospital/service/*.java com/hospital/exception/*.java`
5. Run: `java com.hospital.Main`

**Menu Options:**
1. Add Patient
2. Add Doctor
3. Book Appointment
4. View All Records
5. Load Data from File
6. Save and Exit

---

## Git Discipline Notes
Minimum 10 meaningful commits required.

### Commit History:
1. feat: Add abstract Person base class with package structure
2. feat: Add Doctor and Patient inheritance classes
3. feat: Add MedicalService interface and implementation
4. feat: Add custom exception handling with InvalidIDException
5. feat: Add Appointment class with composition
6. feat: Add HospitalManager service with ArrayList collections
7. feat: Add patient search with exception handling
8. feat: Add file writing for patient persistence
9. feat: Add file reading for data loading
10. feat: Complete HARMS with Main console UI menu system
