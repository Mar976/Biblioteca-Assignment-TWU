import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CheckInTest {
    private CheckIn checkIn;
    private ArrayList<Item> itemsTest;

    @BeforeEach
    public void setUp() {
        checkIn = new CheckIn();
        itemsTest = new ArrayList<>();
        Item testBook = new Book("The Rosie Result", "Graeme Simsion", 2019);
        testBook.availability = false;
        Item testMovie = new Movie("The Moon", 1990, "Al lee", 4.3);
        testMovie.availability = false;
        itemsTest.add(testMovie);
        itemsTest.add(testBook);
    }

    @Test
    public void shouldReturnNullIfBookIsNotCheckOutBefore() {
        Assertions.assertNull(checkIn.checkInItem("The Rosie Results", itemsTest));
    }

    @Test
    public void shouldPassIfBookIsCheckOutBefore() {
        Assertions.assertNotNull(checkIn.checkInItem("The Rosie Result", itemsTest));
    }

    @Test
    public void shouldReturnNullIfMovieIsNotCheckOutBefore() {
        Assertions.assertNull(checkIn.checkInItem("The Sun", itemsTest));
    }

    @Test
    public void shouldPassIfMovieIsCheckOutBefore() {
        Assertions.assertNotNull(checkIn.checkInItem("The Moon", itemsTest));
    }


}
