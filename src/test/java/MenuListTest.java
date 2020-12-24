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
        itemsTest.add(new Movie(1,"The Moon",1990,"Al lee",4.3));
    }

    @Test
    public void shouldPrintAnErrorMessageIfInvalid() throws Exception {
        Assert.assertEquals(menu.allMenuOptions(8),"Please select a valid option!");
    }

    @Test
    public void shouldPrintMovie() {
       Assert.assertEquals(itemsTest.get(1).toString(),"Available:true Name:The Moon Year:1990 Director:Al lee Rating:4.3 Category:Movie");
    }

    @Test
    public void shouldPrintBook() {
        Assert.assertEquals(itemsTest.get(0).toString(),"Available:true Name:The Rosie Result Year:2019 Author:Graeme Simsion Category:Book");
    }
}
