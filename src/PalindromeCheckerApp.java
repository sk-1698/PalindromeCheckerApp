import java.util.LinkedList;
import java.util.Deque;
public class PalindromeCheckerApp {
    //use case 10
    public static void main(String[] args) {

        String original = "A man a plan a canal Panama";

        // Normalize string:
        // 1. Convert to lowercase
        // 2. Remove spaces and non-alphanumeric characters
        String normalized = original.toLowerCase().replaceAll("[^a-z0-9]", "");

        boolean isPalindrome = checkPalindrome(normalized);

        if (isPalindrome) {
            System.out.println("\"" + original + "\" is a Palindrome (Ignoring case and spaces).");
        } else {
            System.out.println("\"" + original + "\" is NOT a Palindrome.");
        }
    }

    // Two-pointer palindrome check
    public static boolean checkPalindrome(String str) {

        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}