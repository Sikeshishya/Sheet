package Arrays;

public class sortColors {

    public void sortColors(int[] nums)
    {
        int i=0;
        int j=0;
        int k= nums.length-1;

        while(j<=k)
        {
            if(nums[j]==2)
            {
                swap(nums,j,k);
                k--;
            }

            if(nums[j]==0)
            {
                swap(nums,i,j);
                i++;
                j++;
            }

            else {
                j++;
            }
        }

    }

    public void swap(int[] arr,int i,int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
