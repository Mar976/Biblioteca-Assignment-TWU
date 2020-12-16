import java.io.PrintStream;

public class main {
    public static void main(String[] args){

        ListOfBooks listOfBooks = new ListOfBooks();
        PrintStream printStream = new PrintStream(System.out);

        printStream.println(Resources.welcomeMessage);

        listOfBooks.addBooks();
        listOfBooks.printItems();




    }
}
