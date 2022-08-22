import java.util.ArrayList;
import java.util.Date;

public class PostOffice {
    public static int id;
    public String name;
    public ArrayList<Employees> employees;
    public ArrayList<Parcel> parcels;

    Date currentDate = new Date();


    public PostOffice(String name, ArrayList<Employees> employees, ArrayList<Parcel> parcels) {
        this.name = name;
        this.employees = employees;
        this.parcels = parcels;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
