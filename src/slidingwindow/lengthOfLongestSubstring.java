package slidingwindow;

import java.util.HashMap;

public class lengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {

        int ws = 0;
        int we = 0;
        int len = 0;
        int ans = 0;
        HashMap<Character, Integer> map = new HashMap<>();

        while (we < s.length()) {
            char ch = s.charAt(we);
            if (map.containsKey(ch) ) {
                ws = map.get(ch) + 1;
            }

            map.put(ch, we);
            len = we - ws + 1;
            ans = Math.max(ans, len);
            we++;

        }
        return ans;

    }
}
