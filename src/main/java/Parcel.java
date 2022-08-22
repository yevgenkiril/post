import java.util.Date;

public class Parcel {
    public static int id;
    public Status status;
    public Date receiptDate;
    public String sender;
    public String recipient;
    public String name;

    public Parcel(Status status, Date receiptDate, String sender, String recipient, String name) {
        this.status = status;
        this.receiptDate = receiptDate;
        this.sender = sender;
        this.recipient = recipient;
        this.name = name;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Parcel.id = id;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Date getReceiptDate() {
        return receiptDate;
    }

    public void setReceiptDate(Date receiptDate) {
        this.receiptDate = receiptDate;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
