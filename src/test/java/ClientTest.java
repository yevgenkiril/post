import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

public class ClientTest {
    @Test
    public void parcelTest() throws InterruptedException, Exception {
        Clients clients = new Clients("X", "Y", LocalDate.now());
        Clients recipient = new Clients("D", "B", LocalDate.now());
        Parcel parcel = new Parcel(clients, recipient, "My first parcel");

        Assert.assertEquals(parcel.getStatus(), Status.CREATED);

        PostOffice postOffice = new PostOffice("1st", null);
        postOffice.addParcel(clients, parcel);

        Parcel p = postOffice.getParcels().stream().findFirst().get();

        Assert.assertEquals(parcel, p);

        p = clients.getParcels().stream().findFirst().get();
        Assert.assertEquals(parcel, p);

        Assert.assertEquals(parcel.getStatus(), Status.IN_POST);

        LocalDateTime t = parcel.getReceiptDate();
        Thread.sleep(50);
        p.setStatus(Status.CREATED, "test");

        Assert.assertNotEquals(p.getReceiptDate(), t);

    }

    @Test
    public void parcelSetSameTest() {
        Parcel parcel = new Parcel(null, null, "My 2nd parcel");
        try {
            parcel.setStatus(Status.CREATED, "test");
        } catch (Exception e) {
            System.out.println(e);
        }
        Assert.assertEquals(parcel.getStatus(), Status.CREATED);
        try {
            parcel.setStatus(Status.IN_POST, "to post");
        } catch (Exception e) {
            e.printStackTrace();
        }
        Assert.assertNotEquals(parcel.getStatus(), Status.CREATED);
    }

    @Test
    public void parcelHistoryTest() throws Exception {
        Parcel parcel = new Parcel(null, null, "My 3rd parcel");
        parcel.setStatus(Status.IN_POST, "Посылка прибыла на почту");
        /*parcel.setStatus(Status.ON_THE_WAY, "Посылка в пути");
        parcel.setStatus(Status.DELIVERED, "Посылка доставлена");*/

        System.out.println(parcel.getHistory());

        List<ParcelHistory> histories = new ArrayList<>();
        histories.add(new ParcelHistory(Status.CREATED, Status.IN_POST, "Посылка прибыла на почту"));

        Assert.assertEquals(parcel.getHistory(), histories);

    }
}
