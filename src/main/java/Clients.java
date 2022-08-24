import java.util.*;

public class Clients extends Human{
    private Set<Parcel> parcels;

    public Clients(String firstName, String lastName, Calendar birthday, Set<Parcel> parcels) {
        super(firstName, lastName, birthday);
        this.parcels = parcels;
    }

    public void setParcels(Set<Parcel> parcels) {
        this.parcels = parcels;
    }

    public Set<Parcel> getParcels() {
        return parcels;
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
