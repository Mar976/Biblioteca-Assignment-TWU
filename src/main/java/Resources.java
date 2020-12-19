import java.util.ArrayList;

public class Resources {
    public static final String WELCOME_MESSAGE = "Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!";
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

    static ArrayList<Item> checkOutItems = new ArrayList<>();
}
