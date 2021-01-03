import java.util.ArrayList;

public class CheckIn {

    public Item checkInItem(String name, ArrayList<Item> items) {
        return returnItem(name,items);
    }

    public Item returnItem(String name, ArrayList<Item> items) {
        for (Item item : items) {
            if (item.name.equals(name)) {
                return item;
            }
        }
        return null;
    }
}
