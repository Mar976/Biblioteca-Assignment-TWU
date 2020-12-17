import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CheckOut {
    public boolean checkOutBook(int bookID, ArrayList<Item> items) {
        if(items.size()>bookID && items.get(bookID).getAvaiblity()) {
            Resources.checkOutBook.add(items.get(bookID));
            items.get(bookID).setAvaibality(false);
            return true;
        }
        return false;
    }
    public String getCheckOutBooks() {
        String bookString = "";
        for(Item item:Resources.checkOutBook) {
            bookString += item.printItem() + "\n";
        }
        return bookString;
    }

    public int getItemCode() throws Exception{
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }
}
