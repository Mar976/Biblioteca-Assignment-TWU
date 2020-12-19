import java.util.ArrayList;

public class CheckIn {

    public Item checkInItem(String name, ArrayList<Item> items) {
        Item foundItem = returnItem(name,items);
        if(foundItem != null) {
            return foundItem;
        }
        return null;
    }

    public Item returnItem(String name, ArrayList<Item> items) {
        for(int i=0; i<items.size(); i++) {
            if(items.get(i).name == name) {
                return items.get(i);
            }
        }
        return null;
    }
}
