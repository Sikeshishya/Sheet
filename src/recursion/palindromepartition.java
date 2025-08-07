package recursion;

import java.util.ArrayList;
import java.util.List;

public class palindromepartition {
    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        List<String> list = new ArrayList<>();
        partition(s, 0, result, list);
        return result;
    }

    public void partition(String s, int index, List<List<String>> result, List<String> list) {
        if (index == s.length()) {
            result.add(new ArrayList<>(list));
            return;
        }

        for (int i = index; i < s.length(); i++) {
            if (ispalindrome(s, index, i)) {
                list.add((s.substring(index, i + 1)));
                partition(s, i + 1, result, list);
                list.remove(list.size() - 1);
            }
        }

    }

    public boolean ispalindrome(String s, int start, int end) {
        while (start<=end)
        {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;

        }


        return true;
    }
}
