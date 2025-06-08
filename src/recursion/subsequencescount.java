package recursion;

import java.util.ArrayList;
import java.util.List;

public class subsequencescount {

    public static int backtrack(int[] nums, List<Integer> list, int i, int n) {

        if (i == n) {
            return 1;
        }

        list.add(nums[i]);
        int left = backtrack(nums, list, i + 1, n);

        list.remove(list.size() - 1);
        int right = backtrack(nums, list, i + 1, n);

        return left + right;

    }


}
