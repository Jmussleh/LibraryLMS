import java.util.Scanner;

public class MainMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Librarian librarian = new Librarian();
        //Sets run to true until the program is exited by the user
        boolean run = true;
        //While the program is running, give the user these options.
        while (run) {
            System.out.println("*+*+*+* Library Management System *+*+*+*");
            //Option to load patrons from a file
            System.out.println("1. Load patrons from a file");
            //Option to load a patron manually
            System.out.println("2. Add a patron manually");
            //Option to remove a patron by ID
            System.out.println("3.Remove a patron");
            //Option to display all current patrons in the system
            System.out.println("4. Display all patrons");
            //Option for user to set run to false and exit the application
            System.out.println("5. Exit");
            //Prompts the user to enter the number for which action they would like to perform
            System.out.println("Which action would you like to perform?  ");
        }
    }
}
