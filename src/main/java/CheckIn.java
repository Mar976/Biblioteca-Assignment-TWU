import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Scanner;

public class CheckIn {

    ListOfBooks listOfBooks = new ListOfBooks();

    public int checkInBook(String bookName, ArrayList<Item> items) {
        int foundindex = listOfBooks.returnIndex(bookName);
        if(foundindex != -1) {
            return foundindex;
        }
        return -1;
    }

    public String getItemTitle() throws Exception{
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }
}
