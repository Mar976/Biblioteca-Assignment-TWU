import java.io.PrintStream;
import java.util.Scanner;

public class Menu {

    public static final String SELECT_FROM_MENU = "Select from menu: ";
    public static final String MENU_ITEMS_LIST = "1. List of Items";
    public static final String MENU_CHECKOUT = "2. Check out a Items";
    public static final String MENU_CHECKIN = "3. Check in a Items";
    public static final String MENU_EXIT = "0. Exit the system";
    public static final String ENTER_ITEM_TITLE = "Enter Item title: ";
    public static final String INVALID_CREDENTIALS = "Invalid LibraryNumber or Password!";
    public static final String VALID_CHECKOUT = "Thank you! Enjoy the book";
    public static final String INVALID_CHECKOUT = "Sorry, that book is not available";
    public static final String VALID_CHECKIN = "Thank you for returning the book!";
    public static final String INVALID_CHECKIN = "That is not a valid book to return!";
    public static final String MENU_RESELECTION = "Please select a valid option! Please write a valid Book ID!";
    public static final String USERNAME = "Username: ";
    public static final String PASSWORD = "Password: ";
    public static final String INVALID = "INVALID";

    
    private String userAnswerString;
    private int userAnswer;
    PrintStream printStream;
    ListOfItems listOfItems;
    Scanner input;

    public Menu() {
        userAnswer =-1;
        printStream = new PrintStream(System.out);
        listOfItems = new ListOfItems();
        input = new Scanner(System.in);
    }

    public void showMenu() {
        printStream.println( SELECT_FROM_MENU);
        printStream.println( MENU_ITEMS_LIST);
        printStream.println( MENU_CHECKOUT);
        printStream.println( MENU_CHECKIN);
    }

    public String allMenuOptions(int userAnswer) throws Exception{
        switch (userAnswer) {
            case 1:
                return listOfItems.printItems();
            case 2:
                return checkOutOption();
            case 3:
                return checkInOption();
            default:
                userAnswer= -1;
                return  MENU_RESELECTION;
        }
    }

    public String getString() throws Exception{
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }
    public int getNumber() throws Exception{
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }

    public String checkInOption() throws Exception {
        String inputName;
        CheckIn checkIn = new CheckIn();
        if(!getLogin()) {return  INVALID_CREDENTIALS;}
        System.out.println( ENTER_ITEM_TITLE);
        inputName = getString();
        if(checkIn.checkInItem(input.nextLine(),  Resources.checkOutItems) != null) {
            listOfItems.updateAvailability(inputName,true);
            return  VALID_CHECKIN;
        }
        return  INVALID_CHECKIN;
    }

    public String checkOutOption() throws Exception {
        if(!getLogin()) {return  INVALID_CREDENTIALS;}

        String inputName;
        CheckOut checkout = new CheckOut();
        System.out.println( ENTER_ITEM_TITLE);
        inputName = getString();
        if(checkout.checkOutItem(listOfItems.returnItem(inputName))) {
            listOfItems.updateAvailability(inputName,false);
            return  VALID_CHECKOUT;
        }
        return  INVALID_CHECKOUT;
    }

    public void menuProcess() throws Exception {
        do {
            showMenu();
            userAnswer = getNumber();
            System.out.println(allMenuOptions(userAnswer));
        } while(userAnswer != -1);
    }

    public Boolean getLogin() {
        System.out.println( USERNAME);
        String libraryNumber = input.nextLine();
        /*if(libraryNumber.matches("\\w{3}-\\w{4}")) {                                //Need to fix
            System.out.println("Invalid format!");
            return false;
        }*/

        System.out.println( PASSWORD);
        String password = input.nextLine();

        Customer foundCustomer= verify(libraryNumber, password);
        if(foundCustomer!=null) {
            return true;
        }
        return false;
    }

    public Customer verify(String libraryNumber, String password) {
        ListOfCustomer listOfCustomer = new ListOfCustomer();
        for(Customer customer:listOfCustomer.customers) {
            if(libraryNumber.equals(customer.libraryNumber) && password.equals(customer.password)) {
                System.out.println(customer.toString());
                return customer;
            }
        }
        return null;
    }

}
