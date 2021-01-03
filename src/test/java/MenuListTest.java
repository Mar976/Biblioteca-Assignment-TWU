import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class MenuListTest {
    private Menu menu;
    private ArrayList<Item> itemsTest;

    @BeforeEach
    public void setUp() {
        menu = new Menu();
        itemsTest = new ArrayList<>();
        itemsTest.add(new Book("The Rosie Result","Graeme Simsion",2019));
        itemsTest.add(new Movie("The Moon",1990,"Al lee",4.3));
    }

    @Test
    public void shouldPrintAnErrorMessageIfInvalid() {
        Assertions.assertEquals(menu.allMenuOptions(8),"Please select a valid option! Please write a valid Book ID!");
    }

    @Test
    public void shouldPrintMovie() {
       Assertions.assertEquals(itemsTest.get(1).toString(),"Available:true Name:The Moon Year:1990 Director:Al lee Rating:4.3 Category:Movie");
    }

    @Test
    public void shouldPrintBook() {
        Assertions.assertEquals(itemsTest.get(0).toString(),"Available:true Name:The Rosie Result Year:2019 Author:Graeme Simsion Category:Book");
    }
}
