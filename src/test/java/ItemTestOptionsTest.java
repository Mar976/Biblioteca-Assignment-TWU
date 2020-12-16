import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class ItemTestOptionsTest {
    public ListOfBooks listOfBooksTest = new ListOfBooks();

    @Test
    public void shouldGetBookTitle() {  Assert.assertTrue(listOfBooksTest.items.get(0).getTitle() == "The Rosie Result"); }

    @Test
    public void shouldGetBookAuthor() {  Assert.assertTrue(listOfBooksTest.items.get(0).getAuthor() == "Graeme Simsion"); }

    @Test
    public void shouldGetBookYear() {  Assert.assertTrue(listOfBooksTest.items.get(0).getYear() == 2019); }

}
