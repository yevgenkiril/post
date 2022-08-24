import java.time.LocalDateTime;
import java.time.Period;
import java.util.Objects;

public class DateIntervalForEmployees extends DateParent{

    private LocalDateTime localDateTime;

    public DateIntervalForEmployees(Period period, LocalDateTime localDateTime) {
        super(period);
        this.localDateTime = localDateTime;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        DateIntervalForEmployees that = (DateIntervalForEmployees) o;
        return Objects.equals(localDateTime, that.localDateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), localDateTime);
    }
}
