package stack;

import java.util.Stack;

public class checkValidString {

    public static boolean checkValidString(String s) {

        int i=0;
        Stack<Character> stack=new Stack<>();

        while(i<s.length())
        {
            char ch=s.charAt(i);
            if(ch=='(' || ch=='*')
            {
                stack.push(ch);
            }
            if(!stack.isEmpty() && ch==')')
            {
                stack.pop();
            }
            i++;
        }

        return stack.isEmpty();

    }

    public static void main(String[] args) {
        String s = "(*))";
        System.out.println(checkValidString(s));
    }
}
