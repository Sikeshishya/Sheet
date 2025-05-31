package Strings;

import java.util.HashMap;

public class frequencySort {

    public String frequencySort(String s) {

        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        StringBuilder result = new StringBuilder();

        while (!map.isEmpty()) {
            int maxfreq = 0;
            char maxchar = 0;

            for (char c : map.keySet()) {
                int freq = map.get(c);
                if (freq > maxfreq) {
                    maxfreq = freq;
                    maxchar = c;
                }
            }

            for (int i = 0; i < maxfreq; i++) {
                result.append(maxchar);
            }
            map.remove(maxchar);
        }
        return result.toString();
    }
}
