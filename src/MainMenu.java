import java.util.Scanner;

public class MainMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Librarian librarian = new Librarian();
        //Sets run to true until the program is exited by the user
        boolean run = true;
        //While the program is running, give the user these options.
        while (run) {
            System.out.println("*+*+*+* || Library Management System || *+*+*+*");
            //Option to load patrons from a file
            System.out.println("1. Load patrons from a file");
            //Option to load a patron manually
            System.out.println("2. Add a patron manually");
            //Option to remove a patron by ID
            System.out.println("3. Remove a patron");
            //Option to display all current patrons in the system
            System.out.println("4. Display all patrons");
            //Option for user to set run to false and exit the application
            System.out.println("5. Exit");
            //Prompts the user to enter the number for which action they would like to perform
            System.out.println("Which action would you like to perform?  ");

            String action = scanner.nextLine();

            switch (action) {
                //Prompts that populate if load patrons from file is chosen
                case "1":
                    System.out.println("Load patrons from a file");
                    System.out.println("Enter file path: ");
                    String path = scanner.nextLine();
                    librarian.loadFile(path);
                    librarian.displayPatrons();
                    break;
                //Prompts that populate if add patron manually is chosen
                case "2":
                    System.out.println("Add a patron manually");
                    //Prompts user to add a unique ID
                    System.out.println("Enter a unique 7 digit ID: ");
                    String id = scanner.nextLine();
                    //Prompts user to enter a name
                    System.out.println("Enter patron name: ");
                    String name = scanner.nextLine();
                    //Prompts user to enter an address
                    System.out.println("Enter patron address: ");
                    String address = scanner.nextLine();
                    //Prompts user to enter amount of fines if any
                    System.out.println("Enter patron fine amount: ");
                    //Converts the String to a double
                    double fines = Double.parseDouble(scanner.nextLine());
                    //Creates a new patron object
                    Patron patron = new Patron(id, name, address, fines);
                    //Calls the addPatron method from my Librarian class
                    librarian.addPatron(patron);
                    librarian.displayPatrons();
                    break;
                //Prompts user to remove a patron by their unique ID
                case "3":
                    System.out.println("Remove a patron");
                    System.out.println("Enter a unique 7 digit ID of patron to remove: ");
                    String removeId = scanner.nextLine();
                    //Calls the method removePatron from the librarian class
                    librarian.removePatron(removeId);
                    librarian.displayPatrons();
                    break;
                //Displays all patrons in the list in the correct format
                case "4":
                    System.out.println("Display all patrons");
                    //Calls the method displayPatrons from the librarian class
                    librarian.displayPatrons();
                    break;
                //Allows the user to exit the program
                case "5":
                    //Sets run to false which stops the program from running
                    run = false;
                    //Lets the user know that the program is ending
                    System.out.println("Exiting program...");
                    break;

            }
        }
        //Closes the scanner object to free up system resources
        scanner.close();
    }
}
