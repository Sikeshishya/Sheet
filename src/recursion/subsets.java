package recursion;

import java.util.ArrayList;
import java.util.List;

public class subsets {
    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> result=new ArrayList<>();

        List<Integer> ans=new ArrayList<>();
        for(int i=0;i< nums.length;i++)
        {
            ans.add(nums[i]);
        }
        result.add(ans);

        for(int i=0;i< nums.length;i++)
        {
            for(int j=i+1;j< nums.length;j++)
            {
                ans.add(i,j);
            }
            result.add(ans);
        }


        return result;
    }
}
