import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ItemTestOptionsTest {
    private final ListOfItems listOfItemsTest = new ListOfItems();

    @Test
    public void shouldGetBookTitle() {
        Assertions.assertEquals(listOfItemsTest.items.get(0).name, "The Rosie Result"); }

    @Test
    public void shouldGetBookAuthor() {
        Book testBook = (Book)listOfItemsTest.items.get(0);
        Assertions.assertEquals(testBook.author, "Graeme Simsion"); }

    @Test
    public void shouldGetBookYear() {
        Assertions.assertEquals(listOfItemsTest.items.get(0).year, 2019); }

}
