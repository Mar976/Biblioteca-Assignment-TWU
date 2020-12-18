import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class MenuListTest {
    Menu menu;
    public ArrayList<Item> itemsTest;
    public ListOfItems listOfItemsTest;

    @BeforeEach
    public void setUp() {
        menu = new Menu();
        itemsTest = new ArrayList<>();
        listOfItemsTest = new ListOfItems();
        itemsTest.add(new Book(1,"The Rosie Result","Graeme Simsion",2019));
        itemsTest.add(new Book(2,"The Rosie Effect","Graeme Simsion",2014));
        itemsTest.add(new Book(3,"The Rosie Project","Graeme Simsion",2013));
    }

    @Test
    public void shouldPrintAnErrorMessageIfInvalid() throws Exception {
        Assert.assertEquals(menu.switchCasesForMenuSelection(8),"Please select a valid option!");
    }

    @Test
    public void shouldPrintListOfBooksIfValidInput() throws Exception {
        Assert.assertEquals(menu.switchCasesForMenuSelection(1), listOfItemsTest.printItems(itemsTest));
    }
}
