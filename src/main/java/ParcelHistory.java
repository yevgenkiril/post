import java.util.Objects;

public class ParcelHistory {
    private static int id;
    private Status statusBefore;
    private Status statusAfter;
    private String causeOfChange;
    private final int identifier;

    public ParcelHistory(Status statusBefore, Status statusAfter, String causeOfChange) {
        this.statusBefore = statusBefore;
        this.statusAfter = statusAfter;
        this.causeOfChange = causeOfChange;
        id+=id;
        this.identifier = id;
    }

    public Status getStatusBefore() {
        return statusBefore;
    }

    @Override
    public String toString() {
        return "ParcelHistory{" +
                "statusBefore=" + statusBefore +
                ", statusAfter=" + statusAfter +
                ", causeOfChange='" + causeOfChange + '\'' +
                ", identifier=" + identifier +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ParcelHistory that = (ParcelHistory) o;
        return statusBefore == that.statusBefore && statusAfter == that.statusAfter && Objects.equals(causeOfChange, that.causeOfChange);
    }

    @Override
    public int hashCode() {
        return Objects.hash(statusBefore, statusAfter, causeOfChange);
    }

    public void setStatusBefore(Status statusBefore) {
        this.statusBefore = statusBefore;
    }

    public Status getStatusAfter() {
        return statusAfter;
    }

    public void setStatusAfter(Status statusAfter) {
        this.statusAfter = statusAfter;
    }

    public String getCauseOfChange() {
        return causeOfChange;
    }

    public void setCauseOfChange(String causeOfChange) {
        this.causeOfChange = causeOfChange;
    }
}
