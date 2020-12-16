import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class MenuOptionsTest {
    public ArrayList<Item> itemsTest = new ArrayList<>();
    public ListOfBooks listOfBooksTest = new ListOfBooks();

    @Before
    public void setUp() {
        itemsTest.add(new Item("The Rosie Result","Graeme Simsion",2019));
        itemsTest.add(new Item("The Rosie Effect","Graeme Simsion",2014));
        itemsTest.add(new Item("The Rosie Project","Graeme Simsion",2013));
    }

    @Test
    public void shouldVerifTheListOfBooksAreCorrect() {
        Assert.assertTrue(listOfBooksTest.compareItemLists(itemsTest));
    }



}
