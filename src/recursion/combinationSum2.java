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
        combinationSum2helper(0,candidates,0, target, result, list);
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

    public static void combinationSum2helper(int index,int[] candidates,int sum,int target,List<List<Integer>> result, List<Integer> list)
    {
        if(sum==target)
        {
            result.add(new ArrayList<>(list));
            return;
        }
        if(sum>target)
        {
            return;
        }
        if(index==candidates.length)
        {
            return;
        }

        if(sum<target)
        {
            list.add(candidates[index]);
            combinationSum2helper(index+1,candidates,sum+candidates[index],target,result,list);
            list.remove(list.size()-1);
        }


        combinationSum2helper(index+1,candidates,sum,target,result,list);
    }
}
