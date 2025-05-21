package BinarySearch;

import static java.lang.Math.ceil;

public class kokoeatingbanana {

     int sum=0;
     int max=Integer.MIN_VALUE;

     int eatrate(int nums[],int k)
    {
        for(int i=0;i<nums.length;i++)
        {
            sum += (int) ceil((double) nums[i] / k);
        }
        return sum;
    }

     int getmax(int[] nums)
    {
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>max)
            {
                max=nums[i];
            }
        }
        return max;
    }

     int minEatingSpeed(int[] piles, int h)
    {
        int result=0;
        int low=0;
        getmax(piles);
        int high=max;

        while(low<=high)
        {
            int mid=low+(high-low)/2;

            int ans=eatrate(piles,mid);

            if(ans<=h)
            {
                result=ans;
                high=mid-1;
            }
            else {
                low=mid+1;
            }
        }

        return result;
    }

}
