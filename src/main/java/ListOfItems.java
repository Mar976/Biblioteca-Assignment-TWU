import java.util.ArrayList;

public class ListOfItems {
    public ArrayList<Item> items;

    public ListOfItems() {
        items = new ArrayList<>();
        addItems();
    }

    public void addItems() {
        items.add(new Book(1,"The Rosie Result","Graeme Simsion",2019));
        items.add(new Book(2,"The Rosie Effect","Graeme Simsion",2014));
        items.add(new Book(3,"The Rosie Project","Graeme Simsion",2013));
        items.add(new Movie(4,"Attack on Titan",2013,"Itashi",4.5));
        items.add(new Movie(5,"Tokyo",2014,"Itashi",3));
        items.add(new Movie(6,"Away from Moon",1999,"Itashi",2.5));
    }

    public String printItems() {
        String bookList = "\n";
        for(Item item:items) {
            bookList += item.toString() + "\n";
        }
        return bookList;
    }
    public void updateAvailability(String name,boolean availability) {
        for(int i=0; i<items.size(); i++) {
            if(items.get(i).name == name) {
                items.get(i).availability= availability;
            }
        }
    }

    public Item returnItem(String name) {
        for(int i=0; i<items.size(); i++) {
            if(items.get(i).name == name) {
                return items.get(i);
            }
        }
        return null;
    }
}
