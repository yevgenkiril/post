import java.time.DayOfWeek;
import java.time.Period;
import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;

public class PostOffice {
    private static int id;
    private String name;
    private ArrayList<Employees> employees;
    private ArrayList<Parcel> parcels;
    private DateIntervalForPost dateInterval;
    private final int identifier;


    public PostOffice(String name, ArrayList<Employees> employees, ArrayList<Parcel> parcels, DateIntervalForPost dateInterval) {
        this.name = name;
        this.employees = employees;
        this.parcels = parcels;
        this.dateInterval = dateInterval;
        id+=id;
        identifier=id;
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

    public DateIntervalForPost getDateInterval() {
        return dateInterval;
    }

    public void setDateInterval(DateIntervalForPost dateInterval) {
        this.dateInterval = dateInterval;
    }

    public ArrayList<Employees> getEmployees() {
        return employees;
    }

    public ArrayList<Parcel> getParcels() {
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
