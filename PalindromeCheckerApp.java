import java.util.Stack; // Import the Stack class

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "level";
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        String reversed = "";
        while (!stack.isEmpty()) {
            reversed += stack.pop();
        }

        System.out.println("Input String: " + input);
        System.out.println("Reversed from Stack: " + reversed);

        if (input.equals(reversed)) {
            System.out.println("Result: It is a Palindrome (Stack Check).");
        } else {
            System.out.println("Result: It is NOT a Palindrome (Stack Check).");
        }

    }
}