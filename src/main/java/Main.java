import java.io.PrintStream;

public class Main {
    public static final String WELCOME_MESSAGE = "Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!";
    public static void main(String[] args) {


        PrintStream printStream = new PrintStream(System.out);
        Menu menu = new Menu();

        printStream.println(WELCOME_MESSAGE);

        menu.menuProcess();

    }
}
