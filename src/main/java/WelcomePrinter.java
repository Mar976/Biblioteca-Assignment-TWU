import java.io.PrintStream;

public class WelcomePrinter {
    private PrintStream printStream;

    public WelcomePrinter(PrintStream printStream) {
        this.printStream = printStream;
    }

    public void printWelcome(){
        printStream.println("Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!");
    }
}
