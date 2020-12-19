import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class CheckInTest {
    public CheckIn checkIn;
    Item testBook;
    Item testMovie;
    ArrayList<Item> itemsTest;

    @BeforeEach
    public void setUp() {
        checkIn = new CheckIn();
        itemsTest = new ArrayList<>();
        testBook = new Book(1,"The Rosie Result","Graeme Simsion",2019);
        testBook.availability = false;
        testMovie = new Movie(2,"The Moon",1990,"Al lee",4.3);
        testMovie.availability = false;
        itemsTest.add(testMovie);
        itemsTest.add(testBook);
    }

    @Test
    public void shouldReturnNullIfBookIsNotCheckOutBefore() {
        Assert.assertTrue(checkIn.checkInItem("The Rosie Results",itemsTest) == null);
    }

    @Test
    public void shouldPassIfBookIsCheckOutBefore() {
        Assert.assertTrue(checkIn.checkInItem("The Rosie Result",itemsTest) != null);
    }

    @Test
    public void shouldReturnNullIfMovieIsNotCheckOutBefore() {
        Assert.assertTrue(checkIn.checkInItem("The Sun",itemsTest) == null);
    }

    @Test
    public void shouldPassIfMovieIsCheckOutBefore() {
        Assert.assertTrue(checkIn.checkInItem("The Moon",itemsTest) != null);
    }


}
