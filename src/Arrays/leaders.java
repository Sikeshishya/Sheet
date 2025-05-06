package Arrays;

import java.util.ArrayList;
import java.util.List;

public class leaders {

    public ArrayList<Integer> leaders(int[] arr) {

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();

        int n = arr.length - 1;

        int max = Integer.MIN_VALUE;

        for (int i = n; i >= 0; i--) {
            if (arr[i] > max) {
                max = arr[i];
                list.add(max);
            }
        }

        for (int i = list.size() - 1; i >= 0; i--) {
            ans.add(list.get(i));
        }

        return ans;
    }
}
