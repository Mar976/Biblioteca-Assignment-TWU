import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class ItemTestOptionsTest {
    public ListOfItems listOfItemsTest = new ListOfItems();

    @Test
    public void shouldGetBookTitle() {  Assert.assertTrue(listOfItemsTest.items.get(0).name == "The Rosie Result"); }

    @Test
    public void shouldGetBookAuthor() {  Assert.assertTrue(listOfItemsTest.items.get(0).getAuthor() == "Graeme Simsion"); }

    @Test
    public void shouldGetBookYear() {  Assert.assertTrue(listOfItemsTest.items.get(0).year == 2019); }

}
