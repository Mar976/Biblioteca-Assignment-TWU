import java.io.PrintStream;
import java.util.Scanner;

public class Menu {
    private String userAnswerString;
    private int userAnswerInt;
    PrintStream printStream;
    ListOfItems listOfItems;
    Scanner input;

    public Menu() {
        userAnswerInt=-1;
        printStream = new PrintStream(System.out);
        listOfItems = new ListOfItems();
        input = new Scanner(System.in);
    }

    public void showMenu() {
        printStream.println(Resources.SELECT_FROM_MENU);
        printStream.println(Resources.MENU_ITEMS_LIST);
        printStream.println(Resources.MENU_CHECKOUT);
        printStream.println(Resources.MENU_CHECKIN);
    }

    public String switchCasesForMenuSelection(int userAnswer) throws Exception{
        switch (userAnswer) {
            case 1:
                return listOfItems.printItems();
            case 2:
                return checkOutOption();
            case 3:
                return checkInOption();
            default:
                userAnswer= -1;
                return Resources.MENU_RESELECTION;
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
        if(!getLogin()) {return Resources.INVALID_CREDENTIALS;}
        System.out.println(Resources.ENTER_ITEM_TITLE);
        inputName = getString();
        if(checkIn.checkInItem(input.nextLine(), Resources.checkOutItems) != null) {
            listOfItems.updateAvailability(inputName,true);
            return Resources.VALID_CHECKIN;
        }
        return Resources.INVALID_CHECKIN;
    }

    public String checkOutOption() throws Exception {
        if(!getLogin()) {return Resources.INVALID_CREDENTIALS;}

        String inputName;
        CheckOut checkout = new CheckOut();
        System.out.println(Resources.ENTER_ITEM_TITLE);
        inputName = getString();
        if(checkout.checkOutItem(listOfItems.returnItem(inputName))) {
            listOfItems.updateAvailability(inputName,false);
            return Resources.VALID_CHECKOUT;
        }
        return Resources.INVALID_CHECKOUT;
    }

    public void menuFunction() throws Exception {
        do {
            showMenu();
            userAnswerInt= getNumber();
            System.out.println(switchCasesForMenuSelection(userAnswerInt));
        } while(userAnswerInt != -1);
    }

    public Boolean getLogin() {
        System.out.println(Resources.USERNAME);
        String libraryNumber = input.nextLine();
        /*if(libraryNumber.matches("\\w{3}-\\w{4}")) {                                //Need to fix
            System.out.println("Invalid format!");
            return false;
        }*/

        System.out.println(Resources.PASSWORD);
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
                System.out.println(customer.createCustomer());
                return customer;
            }
        }
        return null;
    }

}
