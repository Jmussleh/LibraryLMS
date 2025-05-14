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

    //Getter methods
    public String getID() {
        return ID;
    }
    public String getName() {
        return Name;
    }
    public String getAddress() {
        return Address;
    }
    public double getFines() {
        return Fines;
    }

    //Setter methods
    public void setID(String ID) {
        this.ID = ID;
    }
    public void setName(String Name) {
        this.Name = Name;
    }
    public void setAddress(String Address) {
        this.Address = Address;
    }
    public void setFines(double Fines) {
        this.Fines = Fines;
    }

    @Override
    public String toString() {
        return ID + "-" + Name + "-" + Address + "-" + Fines;
    }

}
