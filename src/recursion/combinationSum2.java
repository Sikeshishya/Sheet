package recursion;

import java.util.ArrayList;
import java.util.Arrays;
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
        Arrays.sort(candidates);
        backtrack(candidates, target, result, list, 0, 0);
        return result;

    }

    public static void backtrack(int[] candidates, int target, List<List<Integer>> result, List<Integer> list, int sum, int index) {

        if (sum == target) {
            result.add(new ArrayList<>(list));
            return;
        }

        for (int i = index; i < candidates.length; i++) {
            if (i > index && candidates[i] == candidates[i - 1]) {
                continue;
            }


            if (sum > target) {
                break;
            }


            list.add(candidates[i]);
            backtrack(candidates, target, result, list, sum + candidates[i], i + 1);
            list.remove(list.size() - 1);
        }
    }
}
