import java.util.*;

// ===============================
// UC12 - Strategy Pattern Version
// ===============================

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== Palindrome Checker (Strategy Pattern) ===");
        System.out.print("Enter a word: ");
        String input = sc.nextLine();

        System.out.println("\nChoose Algorithm:");
        System.out.println("1. Stack Strategy");
        System.out.println("2. Deque Strategy");
        System.out.print("Enter choice: ");

        int choice = sc.nextInt();

        // Strategy selection at runtime
        PalindromeStrategy strategy;

        if (choice == 1) {
            strategy = new StackStrategy();
        } else {
            strategy = new DequeStrategy();
        }

        // Execute selected strategy
        boolean result = strategy.check(input);

        System.out.println("\nInput : " + input);
        System.out.println("Is Palindrome? " + result);
    }
}


// ======================================
// 1️⃣ Strategy Interface
// ======================================
interface PalindromeStrategy {
    boolean check(String input);
}


// ======================================
// 2️⃣ Stack Strategy Implementation
// ======================================
class StackStrategy implements PalindromeStrategy {

    public boolean check(String input) {
        Stack<Character> stack = new Stack<>();

        // Push characters
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // Compare while popping
        for (char c : input.toCharArray()) {
            if (c != stack.pop())
                return false;
        }

        return true;
    }
}


// ======================================
// 3️⃣ Deque Strategy Implementation
// ======================================
class DequeStrategy implements PalindromeStrategy {

    public boolean check(String input) {
        Deque<Character> deque = new ArrayDeque<>();

        for (char c : input.toCharArray()) {
            deque.addLast(c);
        }

        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast())
                return false;
        }

        return true;
    }
}