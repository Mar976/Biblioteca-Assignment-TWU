import java.util.ArrayList;

public class ListOfBooks {

    protected static final String TITLE = "Title";
    protected static final String AUTHOR = "Author";
    protected static final String YEAR = "Year";

    private ArrayList<Item> items = new ArrayList<>();

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

    public void printItems() {
        for(Item item:items) {
            item.printItem();
        }
    }
}
