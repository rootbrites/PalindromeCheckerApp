import java.util.Stack;
import java.util.Deque;
import java.util.ArrayDeque;

/**
 * ==========================================================
 * UC12: Strategy Pattern for Palindrome Algorithms
 * PalindromeCheckerApp
 * ==========================================================
 */

/* ---------- STRATEGY INTERFACE ---------- */

interface PalindromeStrategy {
    boolean checkPalindrome(String input);
}

/* ---------- STACK STRATEGY ---------- */

class StackStrategy implements PalindromeStrategy {

    public boolean checkPalindrome(String input) {

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
}

/* ---------- DEQUE STRATEGY ---------- */

class DequeStrategy implements PalindromeStrategy {

    public boolean checkPalindrome(String input) {

        Deque<Character> deque = new ArrayDeque<>();

        for (int i = 0; i < input.length(); i++) {
            deque.addLast(input.charAt(i));
        }

        while (deque.size() > 1) {

            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }

        return true;
    }
}

/* ---------- PALINDROME CHECKER (CONTEXT) ---------- */

class PalindromeChecker {

    private PalindromeStrategy strategy;

    public PalindromeChecker(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean check(String input) {
        return strategy.checkPalindrome(input);
    }
}

/* ---------- APPLICATION ENTRY ---------- */

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println("Palindrome Checker App - UC12");
        System.out.println("Strategy Pattern Implementation");
        System.out.println("=================================");

        String word = "madam";

        // Using Stack Strategy
        PalindromeChecker stackChecker =
                new PalindromeChecker(new StackStrategy());

        System.out.println("Stack Strategy:");
        System.out.println(word + " -> " + stackChecker.check(word));

        // Using Deque Strategy
        PalindromeChecker dequeChecker =
                new PalindromeChecker(new DequeStrategy());

        System.out.println("\nDeque Strategy:");
        System.out.println(word + " -> " + dequeChecker.check(word));
    }
}