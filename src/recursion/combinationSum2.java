package recursion;

import java.util.ArrayList;
import java.util.List;

public class combinationSum2 {

    public static void main(String[] args) {
        int[] candidates = {10, 1, 2, 7, 6, 1, 5};
        int target = 8;

        System.out.println(combinationSum2(candidates, target));
    }

    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        backtrack(candidates, target, result, list, 0, 0);
        return result;

    }

    public static void backtrack(int[] candidates, int target, List<List<Integer>> result, List<Integer> list, int sum, int index) {
        if (sum == target) {
            result.add(new ArrayList<>(list));
            return;
        }

        if (sum > target || index == candidates.length) {
            return;
        }


        list.add(candidates[index]);

        backtrack(candidates, target, result, list, sum + candidates[index], index);

        list.remove(list.size() - 1);


    }
}
