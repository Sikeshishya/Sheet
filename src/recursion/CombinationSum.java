package recursion;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {

    public static void main(String[] args) {
        int[] candidates = {2, 3, 6, 7};
        int target = 7;

        List<List<Integer>> result = combinationSum(candidates, target);
        System.out.println(result);
    }

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        backtrack(candidates, target, result, list, 0, 0);
        return result;


    }

    public static void backtrack(int[] candidates, int target, List<List<Integer>> result, List<Integer> list, int sum, int index) {
        if (sum > target) {
            return;
        }

        if (sum == target) {
            result.add(new ArrayList<>(list));
            return;
        }

        for (int i = index; i < candidates.length; i++) {


            list.add(candidates[i]);
            backtrack(candidates, target, result, list, sum + candidates[i], i);

            list.remove(list.size() - 1);
        }


    }
}
