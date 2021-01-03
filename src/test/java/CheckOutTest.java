import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CheckOutTest {
    private CheckOut checkOut;
    private Item testBook;
    private Item testMovie;

    @BeforeEach
    public void setUp() {
        checkOut = new CheckOut();
        testBook = new Book("The Rosie Result","Graeme Simsion",2019);
        testMovie = new Movie("The Moon",1990,"Al lee",4.3);
    }

    @Test
    public void shouldPassIfBookIsAvailable() {
        Assertions.assertTrue(checkOut.checkOutItem(testBook)); }

    @Test
    public void shouldFailIfBookIsNotAvailable() {
        testBook.availability = false;
        Assertions.assertFalse(checkOut.checkOutItem(testBook)); }

    @Test
    public void shouldPassIfMovieIsAvailable() {

        Assertions.assertTrue(checkOut.checkOutItem(testMovie));
    }

    @Test
    public void shouldFailIfMovieIsNotAvailable() {
        testMovie.availability = true;
        Assertions.assertTrue(checkOut.checkOutItem(testMovie)); }
}
