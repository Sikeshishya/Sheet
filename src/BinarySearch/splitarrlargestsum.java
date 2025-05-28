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

    public int partitions(int[] arr,int sum)
    {
        int partitions=1;
        int subarraysum=0;

        for(int i=0;i<arr.length;i++)
        {
            if(subarraysum+arr[i]<=sum)
            {
                subarraysum+=arr[i];

            }
            else {
                partitions++;
                subarraysum=0;
            }
        }

        return partitions;
    }

    public int splitArray1(int[] nums, int k)
    {
        int low=0;
        for(int i=0;i<nums.length;i++)
        {
            low=Math.max(low,nums[i]);
        }
        int high=0;
        for(int i=0;i<nums.length;i++)
        {
            high+=nums[i];
        }

        for(int i=low;i<=high;i++)
        {
            int partition=partitions(nums,i);

            if(partition==k)
            {
                return i;
            }
        }

        return -1;


    }
}
