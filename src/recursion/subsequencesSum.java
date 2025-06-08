package recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class subsequencesSum {

    public static void main(String[] args) {

        int[] arr = {1, 2, 1};
        int sum = 2;
        System.out.println(subsequencesSum(arr, sum));
    }

    public static List<List<Integer>> subsequencesSum(int[] nums, int sum) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        backtrack(nums, list, result, 0, nums.length, 0, sum);
        return result;
    }

    public static void backtrack(int[] nums, List<Integer> list, List<List<Integer>> result, int i, int n, int s, int sum) {
        if (i == n) {
            if (s == sum) {
                result.add(new ArrayList<>(list));

            }
            return;
        }

        list.add(nums[i]);
        s += nums[i];
        backtrack(nums, list, result, i + 1, n, s, sum);

        list.remove(list.size() - 1);
        s -= nums[i];
        backtrack(nums, list, result, i + 1, n, s, sum);


    }
}
