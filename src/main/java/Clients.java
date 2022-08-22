import java.util.ArrayList;
import java.util.Date;

public class Clients extends Human{
    public ArrayList<Parcel> parcels;

    public Clients(String firstName, String lastName, Date birthday, ArrayList<Parcel> parcels) {
        super(firstName, lastName, birthday);
        this.parcels = parcels;
    }
}
