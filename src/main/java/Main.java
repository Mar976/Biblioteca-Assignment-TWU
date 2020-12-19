import java.io.PrintStream;

public class Main {
    public static void main(String[] args) throws Exception {

        PrintStream printStream = new PrintStream(System.out);
        Menu menu = new Menu();

        printStream.println(Resources.WELCOME_MESSAGE);

        menu.menuFunction();

    }
}
