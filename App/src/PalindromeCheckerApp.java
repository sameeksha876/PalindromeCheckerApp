public class PalindromeCheckerApp {

    // Recursive function
    private static boolean checkPalindrome(String s, int start, int end) {

        // Base condition → if pointers cross, string is palindrome
        if (start >= end) {
            return true;
        }

        // If mismatch found → not palindrome
        if (s.charAt(start) != s.charAt(end)) {
            return false;
        }

        // Recursive call (move inward)
        return checkPalindrome(s, start + 1, end - 1);
    }

    public static void main(String[] args) {

        String input = "madam";

        boolean result = checkPalindrome(input, 0, input.length() - 1);

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome : " + result);
    }
}