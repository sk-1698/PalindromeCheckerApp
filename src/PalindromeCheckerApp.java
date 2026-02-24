import java.util.LinkedList;
import java.util.Deque;
public class PalindromeCheckerApp {
    //use case 9
    public static void main(String[] args) {

        String original = "madam";

        boolean isPalindrome = checkPalindrome(original, 0, original.length() - 1);

        if (isPalindrome) {
            System.out.println("The string \"" + original + "\" is a Palindrome.");
        } else {
            System.out.println("The string \"" + original + "\" is NOT a Palindrome.");
        }
    }

    // Recursive method
    public static boolean checkPalindrome(String str, int start, int end) {

        // Base condition: if pointers cross or meet
        if (start >= end) {
            return true;
        }

        // If characters do not match
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        // Recursive call (move inward)
        return checkPalindrome(str, start + 1, end - 1);
    }
}