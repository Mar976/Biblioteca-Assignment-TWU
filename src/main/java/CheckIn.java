import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Scanner;

public class CheckIn {

    public Item checkInBook(int bookId, ArrayList<Item> items) {
        Item foundItem = returnItem(bookId);
        if(foundItem != null) {
            return foundItem;
        }
        return null;
    }

    public String getItemTitle() throws Exception{
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }

    public Item returnItem(int id) {
        for(int i=0; i<Resources.checkOutBook.size(); i++) {
            if(Resources.checkOutBook.get(i).getId() == id) {
                return Resources.checkOutBook.get(i);
            }
        }
        return null;
    }
}
