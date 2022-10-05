import java.time.LocalDate;
import java.util.Objects;

public class Employees extends Human{
    private DateIntervalLocalDateTime dateInterval;

    public Employees(String firstName, String lastName, LocalDate birthday, DateIntervalLocalDateTime dateInterval) {
        super(firstName, lastName, birthday);
        this.dateInterval = dateInterval;
    }

    public DateIntervalLocalDateTime getDateInterval() {
        return dateInterval;
    }

    public void setDateInterval(DateIntervalLocalDateTime dateInterval) {
        this.dateInterval = dateInterval;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Employees employees = (Employees) o;
        return Objects.equals(dateInterval, employees.dateInterval);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), dateInterval);
    }
}
