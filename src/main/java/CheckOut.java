import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CheckOut {
    public boolean checkOutBook(Item item) {
        if(item.getAvaiblity()) {
            Resources.checkOutBook.add(item);
            return true;
        }
        return false;
    }

    public int getItemCode() throws Exception{
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }
}
