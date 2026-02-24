import java.util.LinkedList;
import java.util.Deque;
public class PalindromeCheckerApp {
    //use case 11
    public boolean checkPalindrome(String input) {

        if (input == null) {
            return false;
        }

        int start = 0;
        int end = input.length() - 1;

        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }

    // MAIN METHOD (You are missing this)
    public static void main(String[] args) {

        String word = "radar";

        PalindromeCheckerApp checker = new PalindromeCheckerApp();

        boolean result = checker.checkPalindrome(word);

        if (result) {
            System.out.println("The string \"" + word + "\" is a Palindrome.");
        } else {
            System.out.println("The string \"" + word + "\" is NOT a Palindrome.");
        }
    }
}