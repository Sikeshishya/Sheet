package BinarySearch;

import java.util.Arrays;

public class searchRange {
    public static void main(String[] args) {
        int[] nums={5,7,7,8,8,10};
        System.out.println(Arrays.toString(searchRange(nums,6)));

    }

    static int[] searchRange(int[] nums, int target)
    {
        int[] arr= {-1,-1};

        int low=0;
        int high= nums.length-1;

        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(nums[mid]==target)
            {
                arr[0]=mid;
                high=mid-1;
            } else if (nums[mid]>target) {
                high=mid-1;

            }
            else {
                low=mid+1;
            }
        }

        low=0;
        high= nums.length-1;

        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(nums[mid]==target)
            {
                arr[1]=mid;
                low=mid+1;
            } else if (nums[mid]>target) {
                high=mid-1;

            }
            else {
                low=mid+1;
            }
        }

        return arr;
    }
}
