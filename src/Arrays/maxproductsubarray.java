package Arrays;

public class maxproductsubarray {

    static int maxProduct(int[] nums)
    {
        int maxproduct=nums[0];

        for(int i=0;i< nums.length;i++)
        {
            int product=1;
            for(int j=i;j< nums.length;j++)
            {
                product*=nums[j];
                maxproduct=Math.max(maxproduct,product);
            }
        }

        return maxproduct;
    }
}
