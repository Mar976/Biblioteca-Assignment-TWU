import java.util.ArrayList;

public class CheckIn {

    public Item checkInItem(int bookId, ArrayList<Item> items) {
        Item foundItem = returnItem(bookId);
        if(foundItem != null) {
            return foundItem;
        }
        return null;
    }

    public Item returnItem(int id) {
        for(int i=0; i<Resources.checkOutItems.size(); i++) {
            if(Resources.checkOutItems.get(i).id == id) {
                return Resources.checkOutItems.get(i);
            }
        }
        return null;
    }
}
