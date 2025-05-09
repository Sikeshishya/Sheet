package Arrays;

public class maxProfit {

    public int maxProfit(int[] prices)
    {
        int min=0;
        int max=prices.length-1;
        int profit=0;
        int max1=0;

        while(min<max)
        {
            profit=prices[max]-prices[min];

            if(profit>max1)
            {
                max1=profit;
            }

            if(profit<0)
            {
                profit=0;
            }
            min++;
            max--;
        }

        return max1;
    }

    public int maxProfit1(int[] prices)
    {
        int profit=0;
        int min=prices[0];
        int max=Integer.MIN_VALUE;

        for (int i=1;i< prices.length;i++)
        {
            profit=prices[i]-min;

            if(profit<0)
            {
                profit=0;
            }
         min=Math.min(min,prices[i]);
            max=Math.max(max,profit);
        }

        return max;

    }
}
