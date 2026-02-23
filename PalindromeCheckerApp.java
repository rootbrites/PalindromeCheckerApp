public class PalindromeCheckerApp {

    public static void main(String[] args) {


        String input = "deified";
        char[] charArray = input.toCharArray();
        boolean isPalindrome = true;
        int left = 0;
        int right = charArray.length - 1;


        while (left < right) {
            if (charArray[left] != charArray[right]) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        System.out.println("Input String: " + input);
        if (isPalindrome) {
            System.out.println("Result: It is a Palindrome (Array Check).");
        } else {
            System.out.println("Result: It is NOT a Palindrome (Array Check).");
        }

    }
}