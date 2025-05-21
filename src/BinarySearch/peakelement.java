package BinarySearch;

public class peakelement {
    public int findPeakElement(int[] nums)
    {
        int ans=-1;

        int low=0;
        int high= nums.length-1;

        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(nums[mid]>nums[low] && nums[mid]>nums[high])
            {
                ans=mid;
                low=mid+1;
            }
            else {
                high=mid-1;
            }
        }
        return ans;

    }

}

