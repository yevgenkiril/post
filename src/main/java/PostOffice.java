import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class PostOffice {
    private static int id;
    private String name;
    private Set<Employees> employees;
    private Set<Parcel> parcels;
    private DateIntervalDayOfWeek dateInterval;
    private final int identifier;


    public PostOffice(String name,  DateIntervalDayOfWeek dateInterval) {
        this.name = name;
        this.employees = new HashSet<>();
        this.parcels = new HashSet<>();
        this.dateInterval = dateInterval;
        id=id+1;
        identifier=id;
    }

    public void addParcel(Clients clients, Parcel parcel) throws Exception {
        clients.addParcel(parcel);
        parcels.add(parcel);
        parcel.setStatus(Status.IN_POST, "Moving parcel to post");
    }

    public int getIdentifier() {
        return identifier;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DateIntervalDayOfWeek getDateInterval() {
        return dateInterval;
    }

    public void setDateInterval(DateIntervalDayOfWeek dateInterval) {
        this.dateInterval = dateInterval;
    }

    public Set<Employees> getEmployees() {
        return employees;
    }

    public Set<Parcel> getParcels() {
        return parcels;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PostOffice that = (PostOffice) o;
        return identifier == that.identifier && Objects.equals(name, that.name) && Objects.equals(employees, that.employees) && Objects.equals(parcels, that.parcels) && Objects.equals(dateInterval, that.dateInterval);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, employees, parcels, dateInterval, identifier);
    }
}
