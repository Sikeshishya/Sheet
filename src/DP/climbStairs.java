package DP;

public class climbStairs {
    public int climbStairs1(int n) {

        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 1;
        }

        int left = climbStairs1(n - 1);
        int right = climbStairs1(n - 2);

        return left + right;
    }

    public int climbStairs2(int n) {

        int[] dp=new int[n+1];
        dp[0]=1;
        dp[1]=1;
        int steps=0;

        for(int i=2;i<=n;i++)
        {
            steps=dp[i-1]+dp[i-2];
        }

        return steps;
    }
}
