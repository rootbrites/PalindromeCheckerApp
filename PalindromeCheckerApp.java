public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String original = "madam";

        String reversed = new StringBuilder(original).reverse().toString();

        System.out.println("Checking word: " + original);

        if (original.equals(reversed)) {
            System.out.println("Result: '" + original + "' is a Palindrome.");
        } else {
            System.out.println("Result: '" + original + "' is NOT a Palindrome.");
        }

    }
}