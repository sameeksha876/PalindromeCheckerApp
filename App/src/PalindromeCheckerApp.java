import java.util.*;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("=== UC13: Performance Comparison ===");
        System.out.print("Enter a word: ");
        String input = sc.nextLine();

        // STACK STRATEGY TEST
        PalindromeStrategy stackStrategy = new StackStrategy();

        long startStack = System.nanoTime();
        boolean stackResult = stackStrategy.check(input);
        long endStack = System.nanoTime();

        long stackTime = endStack - startStack;

        // DEQUE STRATEGY TEST
        PalindromeStrategy dequeStrategy = new DequeStrategy();

        long startDeque = System.nanoTime();
        boolean dequeResult = dequeStrategy.check(input);
        long endDeque = System.nanoTime();

        long dequeTime = endDeque - startDeque;

        // OUTPUT RESULTS
        System.out.println("\nStack Result: " + stackResult);
        System.out.println("Stack Execution Time: " + stackTime + " ns");

        System.out.println("\nDeque Result: " + dequeResult);
        System.out.println("Deque Execution Time: " + dequeTime + " ns");

        sc.close();
    }
}


// Strategy Interface
interface PalindromeStrategy {
    boolean check(String input);
}


// Stack Implementation
class StackStrategy implements PalindromeStrategy {

    public boolean check(String input) {
        Stack<Character> stack = new Stack<>();

        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        for (char c : input.toCharArray()) {
            if (c != stack.pop())
                return false;
        }
        return true;
    }
}


// Deque Implementation
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