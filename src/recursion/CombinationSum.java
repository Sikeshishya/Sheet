package recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.ListResourceBundle;

public class CombinationSum {

    public static void main(String[] args) {
        int[] candidates = {2, 3, 6, 7};
        int target = 7;

        List<List<Integer>> result = combinationSum(candidates, target);
        System.out.println(result);
    }

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        combinationSumHelper(0, candidates, 0, target, ans, new ArrayList<>());
        return ans;


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

    public static void combinationSumHelper(int index, int[] candidates, int sum,int target, List<List<Integer>> ans,List<Integer> list)
    {
        if(sum>target)
        {
            return;
        }
        if (index >= candidates.length) {
            return;
        }

        if(sum==target)
        {
            ans.add(new ArrayList<>(list));
            return;
        }

        if(sum<target)
        {
            list.add(candidates[index]);
            combinationSumHelper(index,candidates,sum+candidates[index],target,ans,list);
            list.remove(list.size()-1);

        }
        combinationSumHelper(index+1,candidates,sum,target,ans,list);

    }


}
