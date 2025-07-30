package stack;

import java.util.Stack;

public class isValidParenthsisi {
    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        int i = 0;
        while (i < s.length()) {
            char ch = s.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }
            if (ch == ')') {
                if (!stack.isEmpty() &&stack.peek() == '(') {
                    stack.pop();
                }
                else return false;
            }
            if (ch == '}') {
                if (!stack.isEmpty() && stack.peek() == '{') {
                    stack.pop();
                }
                else return false;
            }
            if (ch == ']') {
                if (!stack.isEmpty() && stack.peek() == '[') {
                    stack.pop();
                }
               else return false;
            }
            i++;
        }

        return stack.isEmpty();

    }
}
