public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "malayalam";

        boolean result = isPalindromeRecursive(input, 0, input.length() - 1);

        System.out.println("Input String: " + input);
        if (result) {
            System.out.println("Result: It is a Palindrome (Recursive Check).");
        } else {
            System.out.println("Result: It is NOT a Palindrome.");
        }

    }


    public static boolean isPalindromeRecursive(String str, int start, int end) {
        if (start >= end) {
            return true;
        }

        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        return isPalindromeRecursive(str, start + 1, end - 1);
    }
}