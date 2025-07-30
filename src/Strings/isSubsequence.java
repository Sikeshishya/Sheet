package Strings;

import java.util.HashSet;

public class isSubsequence {
    public boolean isSubsequence(String s, String t) {

        HashSet<Character> set=new HashSet<>();

        int i=0;
        while(i<s.length())
        {
            char ch1=s.charAt(i);
            set.add(ch1);
            i++;
        }

        i=0;

        while(i<t.length())
        {
            char ch2=t.charAt(i);
            if(set.contains(ch2))
            {
                set.remove(ch2);
            }
            i++;
        }
        return set.isEmpty();
    }
}
