package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PalindromeCheckTest {

    @Test
    public void testIsPalindrome() {
        assertTrue(PalindromeCheck.isPalindrome("radar"));
        assertTrue(PalindromeCheck.isPalindrome("A man a plan a canal Panama"));
        assertFalse(PalindromeCheck.isPalindrome("hello"));
    }
}

