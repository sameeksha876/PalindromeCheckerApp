import java.util.Stack;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("Palindrome Checker App - UC5 (Stack Method)");

        String input = "noon";   // hardcoded input from assignment

        // Create stack
        Stack<Character> stack = new Stack<>();

        // Push characters into stack
        for(char c : input.toCharArray()){
            stack.push(c);
        }

        // Compare with popped characters
        boolean isPalindrome = true;

        for(char c : input.toCharArray()){
            if(c != stack.pop()){
                isPalindrome = false;
                break;
            }
        }

        // Print result
        if(isPalindrome)
            System.out.println(input + " is a Palindrome");
        else
            System.out.println(input + " is NOT a Palindrome");
    }
}