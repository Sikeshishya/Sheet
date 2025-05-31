package Strings;

import java.util.Arrays;

public class longestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {

        Arrays.sort(strs);

        int idx = 0;
        String first = strs[0];
        String last = strs[strs.length - 1];

        for (int i = 0; i < first.length(); i++) {

            if (idx < first.length() && idx < last.length()) {
                if (first.charAt(i) == last.charAt(i)) {
                    idx++;
                } else {
                    break;
                }
            }

        }

        return first.substring(0, idx);

    }


}
