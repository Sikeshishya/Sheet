package DP;

import java.util.Arrays;

public class uniquePathsWithObstacles {
    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int[][] dp=new int[obstacleGrid.length][obstacleGrid[0].length];

        for(int[] row:dp)
        {
            Arrays.fill(row,-1);
        }
        return tabulation(obstacleGrid,obstacleGrid.length,obstacleGrid[0].length,dp);

    }
    public static int recursion(int[][] arr,int i, int j)
    {
        if(i>=0 && j>=0 && arr[i][j]==1)
        {
            return 0;
        }
        if(i==0 && j==0)
        {
            return 1;
        }
        if(i<0||j<0)
        {
            return 0;
        }
        int up=recursion(arr,i-1,j);
        int left=recursion(arr,i,j-1);

        return up+left;
    }
    public static int memoisation(int[][] arr,int i,int j,int[][] dp)
    {
        if(i>=0 && j>=0 && arr[i][j]==1)
        {
            return 0;
        }
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
        int up=memoisation(arr,i-1,j,dp);
        int left=memoisation(arr,i,j-1,dp);

        return dp[i][j]=up+left;

    }

    public static int tabulation(int[][] arr,int m,int n,int[][] dp)
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                if(arr[i][j]==1)
                {
                    dp[i][j]=0;
                }
                else if(i==0 && j==0)
                {
                    dp[i][j]=1;
                }
                else {
                    int up=0,left=0;
                    if(i>0) {
                         up=dp[i-1][j];
                    }
                    if(j>0 ){
                         left=dp[i][j-1];
                    }
                    dp[i][j]=up+left;
                }


            }

        }
        return dp[m-1][n-1];

    }

    public static void main(String[] args) {
        System.out.println(uniquePathsWithObstacles(new int[][]{{0,0,0},{0,1,0},{0,0,0}}));
    }
}
