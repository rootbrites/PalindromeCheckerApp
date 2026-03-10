import java.util.Stack;
import java.util.Deque;
import java.util.ArrayDeque;

/**
 * ==========================================================
 * UC13: Palindrome Performance Comparison
 * PalindromeCheckerApp
 * ==========================================================
 */

public class PalindromeCheckerApp {

    // Stack Algorithm
    public static boolean stackPalindrome(String input) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        String reversed = "";

        while (!stack.isEmpty()) {
            reversed += stack.pop();
        }

        return input.equalsIgnoreCase(reversed);
    }

    // Deque Algorithm
    public static boolean dequePalindrome(String input) {

        Deque<Character> deque = new ArrayDeque<>();

        for (char c : input.toCharArray()) {
            deque.addLast(c);
        }

        while (deque.size() > 1) {

            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }

        return true;
    }

    // Two Pointer Algorithm
    public static boolean twoPointerPalindrome(String input) {

        int left = 0;
        int right = input.length() - 1;

        while (left < right) {

            if (input.charAt(left) != input.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {

        System.out.println("=====================================");
        System.out.println("Palindrome Checker Performance Test");
        System.out.println("UC13 - Algorithm Comparison");
        System.out.println("=====================================");

        String testWord = "racecar";

        // Stack Test
        long startStack = System.nanoTime();
        boolean stackResult = stackPalindrome(testWord);
        long endStack = System.nanoTime();

        // Deque Test
        long startDeque = System.nanoTime();
        boolean dequeResult = dequePalindrome(testWord);
        long endDeque = System.nanoTime();

        // Two Pointer Test
        long startPointer = System.nanoTime();
        boolean pointerResult = twoPointerPalindrome(testWord);
        long endPointer = System.nanoTime();

        System.out.println("\nResults:");

        System.out.println("Stack Result: " + stackResult +
                " | Time: " + (endStack - startStack) + " ns");

        System.out.println("Deque Result: " + dequeResult +
                " | Time: " + (endDeque - startDeque) + " ns");

        System.out.println("Two Pointer Result: " + pointerResult +
                " | Time: " + (endPointer - startPointer) + " ns");
    }
}