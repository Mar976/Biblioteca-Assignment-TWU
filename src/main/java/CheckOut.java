import java.util.Scanner;

public class CheckOut {
    public boolean checkOutItem(Item item) {
        if(item.availability) {
            Resources.checkOutItems.add(item);
            return true;
        }
        return false;
    }
}
