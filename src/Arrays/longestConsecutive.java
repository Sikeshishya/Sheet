package Arrays;

import java.util.Arrays;

public class longestConsecutive {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length - 1;
        int first = 0;
        int second = 0;
        int count = 0;

        for (int i = 0; i < n - 1; i++) {
            first = i;
            second = i + 1;

            if (nums[second] == nums[first] + 1 || nums[second] == nums[first]) {
                count++;
            }
        }

        return count;
    }

    public int longestConsecutive1(int[] nums){

        Arrays.sort(nums);
        int currentlen=1;
        int longestlen=1;

        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]==nums[i-1])
            {
                continue;
            }

            else if(nums[i]==nums[i-1]+1)
            {
                currentlen++;
            }
            else {
                currentlen=1;
            }
            longestlen=Math.max(longestlen,currentlen);
        }

        return longestlen;

    }
}
