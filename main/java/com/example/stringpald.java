package com.example;

public class PalindromeCheck {
    
    public static boolean isPalindrome(String str) {
        if (str == null) {
            return false;
        }
        
        // Remove spaces and convert to lowercase for uniform comparison
        String cleanedStr = str.replaceAll("\\s+", "").toLowerCase();
        
        int left = 0;
        int right = cleanedStr.length() - 1;
        
        while (left < right) {
            if (cleanedStr.charAt(left) != cleanedStr.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String testStr = "Radar";
        if (isPalindrome(testStr)) {
            System.out.println("\"" + testStr + "\" is a palindrome.");
        } else {
            System.out.println("\"" + testStr + "\" is not a palindrome.");
        }
    }
}
