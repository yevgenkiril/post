import java.util.Calendar;
import java.util.Date;
import java.time.DayOfWeek;
import java.time.Period;
import java.util.Objects;

public class Employees extends Human{
    private DateIntervalForEmployees dateInterval;

    public Employees(String firstName, String lastName, Calendar birthday, DateIntervalForEmployees dateInterval) {
        super(firstName, lastName, birthday);
        this.dateInterval = dateInterval;
    }

    public DateIntervalForEmployees getDateInterval() {
        return dateInterval;
    }

    public void setDateInterval(DateIntervalForEmployees dateInterval) {
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
