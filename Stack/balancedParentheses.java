package Stack;
import java.util.*;

public class balancedParentheses {

    // Helper function to check if the opening and closing parentheses match
    static boolean match(char open, char close) {
        return (open == '(' && close == ')') ||
               (open == '[' && close == ']') ||
               (open == '{' && close == '}');
    }

    // Function to check if the parentheses in the string are balanced
    public static void CheckParentheses(String str) {
        Stack<Character> s = new Stack<>();
        boolean isValid = true; // Flag to track validity

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // If it's an opening parenthesis, push to the stack
            if (ch == '{' || ch == '[' || ch == '(') {
                s.push(ch);
            }
            // If it's a closing parenthesis
            else if (ch == '}' || ch == ']' || ch == ')') {
                // Check if the stack is empty (no matching opening parenthesis)
                if (s.isEmpty()) {
                    isValid = false;
                    break; // Exit early if invalid
                }

                // Pop the top element and check if it matches
                char top = s.pop();
                if (!match(top, ch)) {
                    isValid = false;
                    break; // Exit early if invalid
                }
            }
        }

        // After processing the string, the stack should be empty
        if (!s.isEmpty()) {
            isValid = false;
        }

        // Print the result
        if (isValid) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
    }

    public static void main(String[] args) {
        String str = "{{(})}";
        CheckParentheses(str); // Output: Invalid
    }
}