package recursion;

import java.util.ArrayList;
import java.util.List;

public class subsets {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        backtrack1(nums, ans, 0, nums.length);
        return ans;

    }

    public void backtrack1(int[] nums, List<List<Integer>> result, int i, int n) {

        List<Integer> list = new ArrayList<>();
        if (i == n) {
            result.add(list);
            return;
        }

        list.add(nums[i]);
        backtrack1(nums, result, i + 1, n);

        list.remove(list.size() - 1);
        backtrack1(nums, result, i + 1, n);

    }
}
