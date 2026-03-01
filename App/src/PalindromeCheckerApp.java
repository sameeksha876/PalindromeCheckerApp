public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // Welcome message
        System.out.println("Welcome to Palindrome Checker App");
        System.out.println("Version 3.0");

        // UC3 – Reverse string palindrome check
        String input = "madam";
        String reversed = "";

        // Reverse the string using loop
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed = reversed + input.charAt(i);
        }

        // Compare using equals()
        if (input.equals(reversed))
            System.out.println(input + " is a Palindrome");
        else
            System.out.println(input + " is NOT a Palindrome");
    }
}