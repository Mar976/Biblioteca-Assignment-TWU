import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class WelcomeTest {

    public String testWelcome = "Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!";

    @Test
    public void TestWelcomeMessage() {
        Assert.assertEquals(Resources.WELCOME_MESSAGE, testWelcome);
    }
}
