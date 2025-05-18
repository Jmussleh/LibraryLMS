# Jena Mussleh, CEN 3024C-31774, May 14,2025  
# Library LMS  
The Library LMS is a Java-based application run in the console window. This application is meant to make managing patrons a breeze. The application allows you to load a list of patrons from a file, add a new patron manually, remove a patron by ID, and list all patrons currently in memory.  

## Features
- Load patrons from a text file
- Add patrons manually from user input
- Remove patrons by their unique ID
- Display all current patrons
- Validate fine amounts (must be between 0 and 250)
- Prevent duplicate patron IDs

## Technologies Used
- Java
- Java Libraries

##Project Structure
- MainMenu.java # Main program interface and menu handling
- Librarian.java # Manages patron operations (load, add, remove, list)
- Patron.java # Patron class with ID, Name, Address, and Fines

## Required format for Patrons.txt
Each line must contain **4 values**, separated by a hyphen (`-`):  
Ex.  
  1245789-Sarah Jones-1136 Gorden Ave. Orlando, FL 32822-40.54  
  3256897-Mason Arby-6060 Saginaw St. Casselberry, FL 34852-0  
  4567891-Avery Jones-1919 Pine Lance Blvd. Oviedo, FL 32478-1.36  

## Format: `ID-Name-Address-Fine`
- `ID`: a unique 7-digit number
- `Name`: patron's full name
- `Address`: street address
- `Fine`: a number between 0 and 250

## Example of Program
*+*+*+* || Welcome to the Library AMS || *+*+*+*  
Please enter the path to the patrons text file to load:  
patrons.txt  
Loaded 5 patrons.  

===== Library Management Menu =====  
1. Load patrons from a file  
2. Add a patron manually  
3. Remove a patron  
4. Display all patrons  
5. Exit  
Which action would you like to perform?  
