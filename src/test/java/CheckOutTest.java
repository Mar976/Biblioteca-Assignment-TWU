import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CheckOutTest {

    public ArrayList<Book> itemsTest;
    public CheckOut checkOut;

    @BeforeEach
    public void setUp() {
        itemsTest = new ArrayList<>();
        checkOut = new CheckOut();
        itemsTest.add(new Book(1,"The Rosie Result","Graeme Simsion",2019));
    }

    @Test
    public void shouldFailIfBookIdIsNotAvailable() {
        Assert.assertTrue(checkOut.checkOutItem(itemsTest.get(5)));
    }

    @Test
    public void shouldPassIfBookIsAvailable() {
        Assert.assertTrue(checkOut.checkOutItem(itemsTest.get(0)));
    }
}
