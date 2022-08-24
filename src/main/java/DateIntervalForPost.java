import java.time.DayOfWeek;
import java.time.Period;
import java.util.Objects;

public class DateIntervalForPost extends DateParent{
    private DayOfWeek dayOfWeek;

    public DateIntervalForPost(Period period, DayOfWeek dayOfWeek) {
        super(period);
        this.dayOfWeek = dayOfWeek;
    }

    public DayOfWeek getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(DayOfWeek dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        DateIntervalForPost that = (DateIntervalForPost) o;
        return dayOfWeek == that.dayOfWeek;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), dayOfWeek);
    }
}
