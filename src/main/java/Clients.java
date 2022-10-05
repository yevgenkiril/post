import java.time.LocalDate;
import java.util.*;

public class Clients extends Human{
    private Set<Parcel> parcels;

    public Clients(String firstName, String lastName, LocalDate birthday) {
        super(firstName, lastName, birthday);
        this.parcels = new HashSet<>();
    }

    public void setParcels(Set<Parcel> parcels) {
        this.parcels = parcels;
    }

    public Set<Parcel> getParcels() {
        return parcels;
    }

    public void addParcel(Parcel parcel){
        parcels.add(parcel);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Clients clients = (Clients) o;
        return Objects.equals(parcels, clients.parcels);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), parcels);
    }
}
