import java.util.ArrayList;

public class ListOfItems {
    public ArrayList<Item> items;

    public ListOfItems() {
        items = new ArrayList<>();
        addItems();
    }

    public void addItems() {
        items.add(new Book("The Rosie Result","Graeme Simsion",2019));
        items.add(new Book("The Rosie Effect","Graeme Simsion",2014));
        items.add(new Book("The Rosie Project","Graeme Simsion",2013));
        items.add(new Movie("Attack on Titan",2013,"Itashi",4.5));
        items.add(new Movie("Tokyo",2014,"Itashi",3));
        items.add(new Movie("Away from Moon",1999,"Itashi",2.5));
    }

    public String printItems() {
        StringBuilder bookList = new StringBuilder("\n");
        for(Item item:items) {
            bookList.append(item.toString()).append("\n");
        }
        return bookList.toString();
    }
    public void updateAvailability(String name,boolean availability) {
        for (Item item : items) {
            if (item.name.equals(name)) {
                item.availability = availability;
            }
        }
    }

    public Item returnItem(String name) {
        for (Item item : items) {
            if (item.name.equals(name)) {
                return item;
            }
        }
        return null;
    }
}
