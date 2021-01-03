import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WelcomeTest {

    @Test
    public void TestWelcomeMessage() {
        String testWelcome = "Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!";
        Assertions.assertEquals(Main.WELCOME_MESSAGE, testWelcome);
    }
}
