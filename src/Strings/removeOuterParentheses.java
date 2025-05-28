package Strings;

import java.util.Stack;

public class removeOuterParentheses {

    public String removeOuterParentheses(String s) {

        Stack<Character> stack = new Stack<>();
        int i = 0;

        while (i < s.length()) {
            if (s.charAt(i) == '(') {
                if (stack.peek() == '(') {
                    continue;
                } else {
                    stack.push('(');
                }
            } else if (s.charAt(i) == ')') {
                if (stack.peek() == ')') {
                    continue;
                } else {
                    stack.push(')');
                }
            }
            i++;
        }

        return s;
    }

    public String removeOuterParentheses1(String s) {
        StringBuilder result = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        int i = 0;

        while (i < s.length()) {
            char ch = s.charAt(i);

            if (ch == '(') {
                if (!stack.isEmpty()) {
                    result.append(ch);

                }
                stack.push(ch);
            } else if (ch == ')') {
                stack.pop();

                if (!stack.isEmpty()) {
                    result.append(ch);
                }

            }
            i++;
        }
        return result.toString();

    }


}
