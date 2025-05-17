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

    //Getters
    public String getID() {
        return ID;
    }

    public double getFines() {
        return Fines;
    }

    //Overrides the toString to format the patron data as requested. Overwrites hashcode.
    @Override
    public String toString() {
        return ID + "-" + Name + "-" + Address + "-" + Fines;
    }

}
