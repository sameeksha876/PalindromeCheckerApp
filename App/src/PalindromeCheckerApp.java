import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== UC10 : Case-Insensitive & Space-Ignored Palindrome ===");
        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();

        // STEP 1: Normalize string
        // remove spaces & special characters + convert to lowercase
        String normalized = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // STEP 2: Apply palindrome logic (two-pointer)
        boolean isPalindrome = true;
        int start = 0;
        int end = normalized.length() - 1;

        while (start < end) {
            if (normalized.charAt(start) != normalized.charAt(end)) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        // STEP 3: Output result
        System.out.println("Normalized string: " + normalized);

        if (isPalindrome)
            System.out.println("Result: Palindrome ✅");
        else
            System.out.println("Result: NOT Palindrome ❌");

        sc.close();
    }
}