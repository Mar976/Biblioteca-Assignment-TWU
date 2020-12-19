import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CheckOutTest {
    public CheckOut checkOut;
    Item testBook;
    Item testMovie;

    @BeforeEach
    public void setUp() {
        checkOut = new CheckOut();
        testBook = new Book(1,"The Rosie Result","Graeme Simsion",2019);
        testMovie = new Movie(1,"The Moon",1990,"Al lee",4.3);
    }

    public void shouldPassIfBookIsAvailable() {
        Assert.assertTrue(checkOut.checkOutItem(testBook)); }

    @Test
    public void shouldFailIfBookIsNotAvailable() {
        testBook.availability = false;
        Assert.assertTrue(checkOut.checkOutItem(testBook)); }

    @Test
    public void shouldPassIfMovieIsAvailable() {

        Assert.assertTrue(checkOut.checkOutItem(testMovie));
    }

    @Test
    public void shouldFailIfMovieIsNotAvailable() {
        testMovie.availability = true;
        Assert.assertTrue(checkOut.checkOutItem(testMovie)); }
}
