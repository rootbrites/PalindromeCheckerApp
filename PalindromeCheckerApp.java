public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "A man a plan a canal Panama";


        String normalized = input.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");

        boolean isPalindrome = true;
        int left = 0;
        int right = normalized.length() - 1;

        while (left < right) {
            if (normalized.charAt(left) != normalized.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        System.out.println("Original:   " + input);
        System.out.println("Normalized: " + normalized);

        if (isPalindrome) {
            System.out.println("Result: It is a Palindrome (Normalized).");
        } else {
            System.out.println("Result: It is NOT a Palindrome.");
        }

    }
}