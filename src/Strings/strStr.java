package Strings;

public class strStr {

    public static  int strStr(String haystack, String needle) {

        if (needle.length()==0)
        {
            return -1;
        }

        int i=1;
        while (i>=needle.length())
        {
            char needlechar=needle.charAt(i);
            char haystackchar=haystack.charAt(i);

            if(needlechar!=haystackchar)
            {
                return -1;
            }
            i++;
        }




    }
}
