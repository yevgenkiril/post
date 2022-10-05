import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Parcel {
    private static int id;

    private Status status;
    private LocalDateTime receiptDate = LocalDateTime.now();
    private Clients sender;
    private Clients recipient;
    private String name;
    private final int identifier;

    public Parcel(Clients sender, Clients recipient, String name) {
        this.status = Status.CREATED;
        this.sender = sender;
        this.recipient = recipient;
        this.name = name;
        id += id;
        identifier = id;
    }

    public int getIdentifier() {
        return identifier;
    }

    public Status getStatus() {
        return status;
    }


    public List<ParcelHistory> getHistory() {
        return list;
    }

    List<ParcelHistory> list = new ArrayList<>();

    public void setStatus(Status status, String cause) throws Exception {
        if (this.status.equals(status)) {
            throw new Exception("Посылка уже емеет статус " + status);
        } else{
            list.add(new ParcelHistory(this.status, status, cause));
            this.status = status;
        receiptDate = LocalDateTime.now();}
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
        return identifier == parcel.identifier && status == parcel.status && Objects.equals(receiptDate, parcel.receiptDate) && Objects.equals(name, parcel.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, receiptDate, name, identifier);
    }
}
