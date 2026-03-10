import java.util.Stack;

/**
 * ==========================================================
 * Use Case 11: Object-Oriented Palindrome Service
 * PalindromeCheckerApp
 * ==========================================================
 */

/* ---------- PALINDROME SERVICE CLASS ---------- */

class PalindromeChecker {

    // Method that checks if a string is a palindrome
    public boolean checkPalindrome(String input) {

        Stack<Character> stack = new Stack<>();

        // Push characters to stack
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        // Build reversed string
        String reversed = "";

        while (!stack.isEmpty()) {
            reversed += stack.pop();
        }

        // Compare original and reversed
        return input.equalsIgnoreCase(reversed);
    }
}


/* ---------- APPLICATION ENTRY POINT ---------- */

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("=====================================");
        System.out.println("Palindrome Checker App");
        System.out.println("Use Case 11 - OOP Palindrome Service");
        System.out.println("=====================================");

        PalindromeChecker checker = new PalindromeChecker();

        String word1 = "madam";
        String word2 = "hello";

        System.out.println(word1 + " -> " + checker.checkPalindrome(word1));
        System.out.println(word2 + " -> " + checker.checkPalindrome(word2));
    }
}