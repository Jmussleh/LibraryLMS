//Attributes
public class Patron {
    private String ID;
    private String Name;
    private String Address;
    private double Fines;

    //Constructor
    public Patron(String ID, String Name, String Address, double Fines) {
        this.ID = ID;
        this.Name = Name;
        this.Address = Address;
        this.Fines = Fines;
    }

    //Getter for getID. Allows outside classes access to this value that is in a private field.
    public String getID() {
        return ID;
    }
    //Getter for getFines. Allows outside classes access to this value that is in a private field.
    public double getFines() {
        return Fines;
    }

    //Overrides the toString to format the patron data as requested. Overwrites hashcode.
    @Override
    public String toString() {
        return "ID: " + ID + ", Name: " + Name + ", Address: " + Address + ", Fines: $" + Fines;
    }

}
