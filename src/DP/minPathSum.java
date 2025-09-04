package DP;

import java.util.Arrays;

public class minPathSum {
    public static int minPathSum(int[][] grid) {

        return recursion(grid, grid.length-1,grid[0].length-1);

    }

    public static int recursion(int[][] arr, int i, int j)
    {
        if(i==0 && j==0)
        {
            return arr[i][j];
        }
        if(i<0 || j<0)
        {
            return Integer.MAX_VALUE;
        }

        int up=arr[i][j]+recursion(arr,i-1,j);
        int left=arr[i][j]+recursion(arr,i,j-1);

        return Math.min(up,left);
    }

    public static void main(String[] args) {
        int[][] grid = new int[][]{
                {1, 3, 1},
                {1, 5, 1},
                {4, 2, 1}
        };

        System.out.println(minPathSum(grid));
    }
}
