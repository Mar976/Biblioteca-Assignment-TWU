import org.junit.jupiter.api.Test;

import java.io.PrintStream;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.exit;

public class Biblioteca {
    public static void main(String[] args){
        PrintStream printStream = new PrintStream(System.out);
        Scanner in = new Scanner(System.in);

        //1.1 View a welcome message
        printStream.println("Welcome to Biblioteca! Your one-stop-shop for great book title in Bangalore!");


        //Adding some books
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("Book1Name","Book1Author",2003));
        books.add(new Book("Book2Name","Book2Author",2006));
        Boolean flag=true;
        do {
            //1.4 View a main menu of option
            menu();
            int menuInput = in.nextInt();

            //1.2 View list of all books
            //1.3 View author and publication year on all books
            switch (menuInput)
            {
                case 1:
                    printBooks(books);
                    break;
                case 0:
                    printStream.println("Exiting the system...");
                    exit(0);
                default:
                    printStream.println("Please select a valid option!");
                    flag=false;
                    break;
            }
        } while(!flag);
    }

    public static void menu() {
        System.out.println("Select from the menu:");
        System.out.println("1. List of books");
        System.out.println("0. Exit!");
    }

    public static void printBooks(ArrayList<Book> books) {
        for(Book book:books) {
            book.printBook();
        }
    }

    @Test
    public static void test() {

    }
}
