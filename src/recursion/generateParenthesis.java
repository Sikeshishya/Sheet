package recursion;

import java.util.ArrayList;
import java.util.List;

public class generateParenthesis {

    public static void main(String[] args) {
        generateParenthesis(2);
    }

    public static void generateParenthesis(int n) {

        List<String> result=new ArrayList<>();
        StringBuilder sb=new StringBuilder();
        result= backtrack(result,sb,0,0,2);
        System.out.println(result);
    }

    public  List<String> backtrack(List<String> res,StringBuilder sb,int open,int close,int n)
    {
        if(open==n && close==n)
        {
            res.add(String.valueOf(sb));
            return res;
        }

        if(open<n)
        {
            sb.append('(');
            backtrack(res,sb,open+1,close,n);
            sb.deleteCharAt(sb.length()-1);
        }

        if(close<open)
        {
            sb.append(')');
            backtrack(res,sb,open,close+1,n);
            sb.deleteCharAt(sb.length()-1);
        }
        return res;
    }
}
