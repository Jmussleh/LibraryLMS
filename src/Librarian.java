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
    public void loadFile(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
        }
    }
}
