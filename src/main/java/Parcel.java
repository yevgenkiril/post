import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;

public class Parcel {
    private static int id;

    private Status status;
    private LocalDateTime receiptDate;
    private Clients sender;
    private Clients recipient;
    private String name;
    private final int identifier;

    public Parcel(Status status, LocalDateTime receiptDate, Clients sender, Clients recipient, String name) {
        this.status = status;
        this.receiptDate = receiptDate;
        this.sender = sender;
        this.recipient = recipient;
        this.name = name;
        id+=id;
        identifier = id;
    }

    public int getIdentifier() {
        return identifier;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public LocalDateTime getReceiptDate() {
        return receiptDate;
    }

    public void setReceiptDate(LocalDateTime receiptDate) {
        this.receiptDate = receiptDate;
    }

    public Clients getSender() {
        return sender;
    }

    public void setSender(Clients sender) {
        this.sender = sender;
    }

    public Clients getRecipient() {
        return recipient;
    }

    public void setRecipient(Clients recipient) {
        this.recipient = recipient;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Parcel parcel = (Parcel) o;
        return identifier == parcel.identifier && status == parcel.status && Objects.equals(receiptDate, parcel.receiptDate) && Objects.equals(sender, parcel.sender) && Objects.equals(recipient, parcel.recipient) && Objects.equals(name, parcel.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, receiptDate, sender, recipient, name, identifier);
    }
}
