package Placement_Example;

import java.util.Scanner;
import java.util.Stack;

public class BinaryStringReduction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        System.out.println(getSmallestString(S));
    }
    public static String getSmallestString(String S) {
        Stack<Character> stack = new Stack<>();
        for (char c : S.toCharArray()) {
            if (c == '0' && !stack.isEmpty() && stack.peek() == '1') {
                stack.pop(); // Remove the '1' from stack to eliminate "10" pair
            } 
            else {
                stack.push(c); // Push current character to stack
            }
        }
        // Build result from stack
        StringBuilder result = new StringBuilder();
        for (char c : stack) {
            result.append(c);
        }
        return result.toString();
    }
}