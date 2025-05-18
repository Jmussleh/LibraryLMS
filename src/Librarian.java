import java.io.*;
import java.util.*;

public class Librarian {
    //Declares a map which stores the data in key value pairs. It maps the
    //unique patron ID to the Patron object. The HashMap part allows
    //for quick adding and removing based on ID.
    private Map<String, Patron> patrons = new HashMap<>();

    //Accepts a Sting for the fileName. The file closes automatically after
    //being read. FileReader reads all characters in the file while bufferedReader
    //reads the texts quickly.
    public void loadPatrons(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            //Declares the variable that stores each patron line
            String line;
            //Reads each line until the file is completely read
            while ((line = reader.readLine()) != null) {
                //This splits each line using '-'
                String[] sections = line.split("-");
                //This checks that every line has the proper amount of information
                //Such as ID, Name, Address, and Fines
                if (sections.length == 4) {
                    //This takes the ID, Name, Address, and Fines from the array
                    //that is created.
                    String ID = sections[0];
                    String Name = sections[1];
                    String Address = sections[2];
                    //Converts the number from a String to a double
                    try {
                    double Fines = Double.parseDouble(sections[3]);

                    //Constructs a new patron object with the four attributes.
                    //Then the new patron object is inserted into the map.
                    //If the line does not have exactly four fields then the program skips
                    //the line so that the application doesn't crash.
                    Patron patron = new Patron(ID, Name, Address, Fines);
                    patrons.put(ID, patron);
                } catch (NumberFormatException e) {
                    System.out.println("Invalid fine amount.");
                }
            } else {
                System.out.println("File loaded...");}
            }
            //Gives the user a message telling them how many patrons were loaded into
            //the internal map. Gives an error if the while loop cannot be completed.
            System.out.println("Loaded " + patrons.size() + " patrons.");
        } catch (IOException e) {
            System.out.println("Error reading file." + e.getMessage());
        }
    }
    //Function for adding a patron manually. Must enter a unique ID
    //And all other attributes. Must also only enter a fine from 0-250 dollars.
    public void addPatron(Patron patron) {
        String ID = patron.getID();
        //if the patron ID is found to already exists then return to enter unique
        //7 digit ID.
        if (patrons.containsKey(ID)) {
            System.out.println("Patron ID already exists.");
            return;
        }
        //The if statement for a fine between 0 and 250. If it is not between those
        //numbers an error is thrown.
        if (patron.getFines() < 0 || patron.getFines() > 250) {
            System.out.println("Invalid fine amount.");
            return;
        }
        //Adds the patron to the system. Indicates that the patron was added successfully
        //Patron patron = new Patron(ID, name, Address, Fines);
        patrons.put(ID, patron);
        System.out.println("Patron added.");
    }

    //The function to remove a patron using their unique ID.
    //Uses if/else statement to tell you whether or not the patron
    //with that ID was removed.
    public void removePatron(String ID) {
        if (patrons.remove(ID) != null) {
            System.out.println("Patron removed successfully.");
        } else {
            System.out.println("Patron not found.");
        }
    }
    //Displays all current patrons in the system following the
    //toString format that I overrode in my Patron.java file
    public void listPatrons() {
        if (patrons.isEmpty()) {
            System.out.println("There are no patrons.");
        } else {
            System.out.println("Patrons:");
            for (Patron patron : patrons.values()) {
                System.out.println(patron.toString());
            }
        }
    }

}
