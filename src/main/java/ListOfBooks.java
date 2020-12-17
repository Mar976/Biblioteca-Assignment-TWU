import java.util.ArrayList;
import java.util.List;

public class ListOfBooks {
    public ArrayList<Item> items;

    public ListOfBooks() {
        items = new ArrayList<>();
        addBooks();
    }

    public void addBooks() {
        items.add(new Item("The Rosie Result","Graeme Simsion",2019));
        items.add(new Item("The Rosie Effect","Graeme Simsion",2014));
        items.add(new Item("The Rosie Project","Graeme Simsion",2013));
    }

    public ArrayList<Item> listItems() {
        return items;
    }

    public boolean compareItemLists(ArrayList<Item> items) {
        for(int i=0; i<items.size(); i++) {
            if(!this.items.get(i).ItemIsEqualTo(items.get(i))) {
               return false;
            }
        }
        return true;
    }

    public String printItems(ArrayList<Item> items) {
        String bookList = "\n";
        for(Item item:items) {
            bookList += item.printItem() + "\n";
        }
        return bookList;
    }
    public String printItems() {
        String bookList = "\n";
        for(Item item:items) {
            bookList += item.printItem() + "\n";
        }
        return bookList;
    }

    public int returnIndex(String title) {
        for(int i=0; i<items.size(); i++) {
            if(items.get(i).getTitle() == title) {
                return i;
            }
        }
        return -1;
    }

}
