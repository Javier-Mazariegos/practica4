import java.util.*;
import org.junit.Test;
import static org.junit.Assert.*;
    
public class AppTest {

    @Test
    public void test() {
        int expectedValue = 1;
        String[] pal = {"ANA"};
        assertEquals(expectedValue, App.palindrome(pal)[0]);
        expectedValue = 0;
        String[] pal2 = {"Javier"};
        assertEquals(expectedValue, App.palindrome(pal2)[0]);
    }
}
    