import java.util.LinkedList;
import java.util.Deque;
import java.util.Stack;

public class PalindromeCheckerApp {
    //use case 13
    public static void main(String[] args) {

        // Large test string for better measurement
        String word = "A man a plan a canal Panama".toLowerCase().replaceAll("[^a-z0-9]", "");

        System.out.println("Testing string: " + word);
        System.out.println("----------------------------------");

        // Two Pointer Method
        long startTime1 = System.nanoTime();
        boolean result1 = twoPointerCheck(word);
        long endTime1 = System.nanoTime();

        // Stack Method
        long startTime2 = System.nanoTime();
        boolean result2 = stackCheck(word);
        long endTime2 = System.nanoTime();

        // Deque Method
        long startTime3 = System.nanoTime();
        boolean result3 = dequeCheck(word);
        long endTime3 = System.nanoTime();

        System.out.println("Two Pointer Result: " + result1 +
                " | Time: " + (endTime1 - startTime1) + " ns");

        System.out.println("Stack Result: " + result2 +
                " | Time: " + (endTime2 - startTime2) + " ns");

        System.out.println("Deque Result: " + result3 +
                " | Time: " + (endTime3 - startTime3) + " ns");
    }

    // Two Pointer Method
    public static boolean twoPointerCheck(String str) {
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

    // Stack Method
    public static boolean stackCheck(String str) {
        Stack<Character> stack = new Stack<>();

        for (char ch : str.toCharArray()) {
            stack.push(ch);
        }

        for (char ch : str.toCharArray()) {
            if (ch != stack.pop()) {
                return false;
            }
        }
        return true;
    }

    // Deque Method
    public static boolean dequeCheck(String str) {
        Deque<Character> deque = new LinkedList<>();

        for (char ch : str.toCharArray()) {
            deque.addLast(ch);
        }

        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }
        return true;
    }
}