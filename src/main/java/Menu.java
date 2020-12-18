import java.io.PrintStream;
import java.util.Scanner;

public class Menu {
    private int userAnswer;
    PrintStream printStream;
    ListOfItems listOfItems;

    public Menu() {
        userAnswer=-1;
        printStream = new PrintStream(System.out);
        listOfItems = new ListOfItems();
    }

    public void getUserAnswerForMenu() throws Exception {
        Scanner in = new Scanner(System.in);
        userAnswer = in.nextInt();
    }

    public int returnUserAnswer() {
        return userAnswer;
    }

    public void showMenu() {
        printStream.println(Resources.MenuGuide);
        printStream.println(Resources.MenuOption_itemList);
        printStream.println(Resources.MenuOption_checkOut);
        printStream.println(Resources.MenuOption_checkIn);
    }

    public int getUserInput() throws Exception{
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }

    public String switchCasesForMenuSelection(int userAnswer) throws Exception{
        CheckOut checkout = new CheckOut();
        CheckIn checkIn = new CheckIn();
        int inputID=0;
        Book foundBook;
        switch (userAnswer) {
            case 1:
                return listOfItems.printItems();

            case 2:
                inputID = getUserInput();
                if(checkout.checkOutItem(listOfItems.returnItem(inputID))) {
                    listOfItems.updateAvailability(inputID,false);
                    return "Thank you! Enjoy the book";
                }
                return "Sorry, that book is not available";

            case 3:
                inputID = getUserInput();
                if(checkIn.checkInItem(inputID, listOfItems.items) != null) {
                    listOfItems.updateAvailability(inputID,true);
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
