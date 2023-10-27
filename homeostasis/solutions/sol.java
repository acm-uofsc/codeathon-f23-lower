import java.io.*;
import java.util.*;

public class Solution {

    public static boolean areBracketsBalanced(String input) {
        Stack<Character> stack = new Stack<>();

        for (char bracket : input.toCharArray()) {
            if (bracket == '(' || bracket == '{' || bracket == '[') {
                stack.push(bracket);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();
                if ((bracket == ')' && top != '(') || (bracket == '}' && top != '{') || (bracket == ']' && top != '[')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        for (int i = 0; i < t; i++) {
            String brackets = scanner.nextLine();
            boolean answer = areBracketsBalanced(brackets);
            if (answer)
                System.out.println("True");
            else
                System.out.println("False");
        }

        scanner.close();
    }
}