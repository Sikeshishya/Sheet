package BinarySearch;

import java.util.Arrays;

public class splitarrlargestsum {

    public int splitArray(int[] nums, int k) {

        Arrays.sort(nums);
        int sum=0;
        for(int i= nums.length-1;i>=k;i--)
        {
            sum+=nums[i];
        }
        return sum;
    }
}
