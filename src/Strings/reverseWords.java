package Strings;

import java.util.Stack;

public class reverseWords {
    public String reverseWords(String s) {

        Stack<String> stack = new Stack<>();
        int i = 0;
        String str = "";
        while (i < s.length()) {
            char ch = s.charAt(i);

            if (ch == ' ') {
                stack.push(str);
                str = "";
            } else {
                str += ch;
            }
            i++;
        }

        if (!str.isEmpty()) {
            stack.push(str);
        }
        String ans="";

        while(stack.size()!=1)
        {
            ans += stack.pop();
            if (!stack.isEmpty()) {
                ans += " ";
            }
        }

        ans+=stack.peek();


        return ans;

    }
}
