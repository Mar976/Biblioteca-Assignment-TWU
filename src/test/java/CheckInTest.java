import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CheckInTest {

    public ArrayList<Item> itemsTest;
    public CheckIn checkIn;

    @BeforeEach
    public void setUp() {
        itemsTest = new ArrayList<>();
        checkIn = new CheckIn();
        itemsTest.add(new Book(1,"The Rosie Result","Graeme Simsion",2019));
    }

    @Test
    public void shouldFailIfBookIdIsNotAvailable() {
        Assert.assertTrue(checkIn.checkInItem(6,itemsTest) == null);
    }

    @Test
    public void shouldPassIfBookIsAvailable() {
        Assert.assertTrue(checkIn.checkInItem(2,itemsTest) != null);
    }


}
