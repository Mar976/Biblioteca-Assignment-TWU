import java.util.ArrayList;

public class CheckIn {

    public Item checkInItem(int bookId, ArrayList<Item> items) {
        Item foundItem = returnItem(bookId,items);
        if(foundItem != null) {
            return foundItem;
        }
        return null;
    }

    public Item returnItem(int id, ArrayList<Item> items) {
        for(int i=0; i<items.size(); i++) {
            if(items.get(i).id == id) {
                return items.get(i);
            }
        }
        return null;
    }
}
