package DP;

import java.util.Arrays;

public class uniquePaths {
    public static int uniquePaths(int m, int n) {

        int[][] dp=new int[m][n];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }


        return memoization(m-1,n-1,dp);
    }

    public static int recursion(int i,int j)
    {
        if(i==0 && j==0)
        {
            return 1;
        }
        if(i<0||j<0)
        {
            return 0;
        }
        int up=recursion(i-1,j);
        int left=recursion(i,j-1);

        return up+left;
    }

    public static int memoization(int i,int j,int[][] dp)
    {

        if(i==0 && j==0)
        {
            return 1;
        }
        if(i<0||j<0)
        {
            return 0;
        }

        if(dp[i][j]!=-1)
        {
            return dp[i][j];
        }
            int up=memoization(i-1,j,dp);
            int left=memoization(i,j-1,dp);



        return dp[i][j]=up+left;

    }

    public static void main(String[] args) {
        System.out.println(uniquePaths(3,7));
    }
}
