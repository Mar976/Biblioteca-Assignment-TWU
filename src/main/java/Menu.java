import java.io.PrintStream;
import java.util.Scanner;

import static java.lang.System.exit;

public class Menu {
    private int userAnswer;
    PrintStream printStream;
    ListOfBooks listOfBooks;

    public Menu() {
        userAnswer=-1;
        printStream = new PrintStream(System.out);
        listOfBooks= new ListOfBooks();
    }

    public void getUserAnswerForMenu() throws Exception {
        Scanner in = new Scanner(System.in);
        userAnswer = in.nextInt();
    }

    public int returnUserAnswer() {
        return userAnswer;
    }

    public void showMenu() {
        printStream.println(Resources.MenuQuide);
        printStream.println(Resources.MenuOption_itemList);
        printStream.println(Resources.MenuOption_checkOut);
        printStream.println(Resources.MenuOption_checkIn);
    }

    public String switchCasesForMenuSelection(int userAnswer) throws Exception{
        CheckOut checkout = new CheckOut();
        CheckIn checkIn = new CheckIn();
        int bookID=0;
        Item foundBook;
        switch (userAnswer) {
            case 1:
                return listOfBooks.printItems();
            case 2:
                bookID = checkout.getItemCode();
                if(checkout.checkOutBook(listOfBooks.returnItem(bookID))) {
                    listOfBooks.updateAvaibality(bookID,false);
                    return "Thank you! Enjoy the book";
                }
                return "Sorry, that book is not available";
            case 3:
                bookID = checkout.getItemCode();
                if(checkIn.checkInBook(bookID, listOfBooks.items) != null) {
                    listOfBooks.updateAvaibality(bookID,true);
                    return "Thank you for returning the book!";
                }
                return "That is not a valid book to return!";
            default:
                userAnswer=-1;
                return "Please select a valid option! Please write a valid Book ID!";
        }
    }

    public void menuFunction() throws Exception {
        do {
            showMenu();
            getUserAnswerForMenu();
            System.out.println(switchCasesForMenuSelection(userAnswer));
        } while(userAnswer!=-1);
    }

}
