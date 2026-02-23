import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "rotator";

        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            queue.add(c);
            stack.push(c);
        }

        boolean isPalindrome = true;

        while (!queue.isEmpty()) {
            if (!queue.remove().equals(stack.pop())) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Input String: " + input);
        if (isPalindrome) {
            System.out.println("Result: It is a Palindrome (Queue/Stack Comparison).");
        } else {
            System.out.println("Result: It is NOT a Palindrome.");
        }

    }
}