package Strings;

public class strStr {

    public static int strStr(String haystack, String needle) {

        if (needle.length() == 0) {
            return 0;
        }

        int i = 0;
        while (i <= needle.length()) {
            char needlechar = needle.charAt(i);
            char haystackchar = haystack.charAt(i);

            if (needlechar != haystackchar) {
                return -1;
            }
            i++;
        }
        return 0;
    }

    public static void main(String[] args) {

        System.out.println(strStr("leetcode","leeto"));
    }

    class Solution {
        public int strStr(String haystack, String needle) {
            if (needle.length() == 0) {
                return 0; // Correct behavior for empty needle
            }

            int hLen = haystack.length();
            int nLen = needle.length();

            for (int i = 0; i <= hLen - nLen; i++) {
                if (haystack.substring(i, i + nLen).equals(needle)) {
                    return i;
                }
            }

            return -1;
        }
    }

}
