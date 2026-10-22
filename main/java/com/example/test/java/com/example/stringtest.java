
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PalindromeCheckerTest {

    private final PalindromeChecker checker = new PalindromeChecker();

    @Test
    public void testValidPalindrome() {
        assertTrue(checker.isPalindrome("radar"));
        assertTrue(checker.isPalindrome("Madam"));
    }

    @Test
    public void testNonPalindrome() {
        assertFalse(checker.isPalindrome("hello"));
    }

    @Test
    public void testNullString() {
        assertFalse(checker.isPalindrome(null));
    }
}
