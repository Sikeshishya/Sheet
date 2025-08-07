package recursion;

import java.util.ArrayList;
import java.util.List;

public class subsets {
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        backtrack1(nums, ans, list,0, nums.length);
        return ans;

    }

    public static void backtrack1(int[] nums, List<List<Integer>> result, List<Integer> list, int i, int n) {


        if (i == n) {
            if(result.contains(list))
            {
                return;
            }
            else
            result.add(new ArrayList<>(list));
            return;
        }

        list.add(nums[i]);
        backtrack1(nums, result, list,i + 1, n);

        list.remove(list.size() - 1);
        

    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 2};

        System.out.println(subsets(nums));

    }
}
