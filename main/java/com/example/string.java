public class Palindrome {
    public static void main(String[] args) {
        String original = "radar";
        String reversed = new StringBuilder(original).reverse().toString();
        if (original.equalsIgnoreCase(reversed)) {
            System.out.println(original + " is a palindrome.");
        } else {
            System.out.println(original + " is not a palindrome.");
        }
    }
}
