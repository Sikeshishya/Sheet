package recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class solveNQueens {
    public List<List<String>> solveNQueens(int n) {

        List<List<String>> ans=new ArrayList<>();
        char[][] board=new char[n][n];

        for(int i=0;i<n;i++)
        {
            Arrays.fill(board[i],'.');
        }

        int[] leftrow=new int[n];
        int[] upperDiagonal=new int[2*n-1];
        int[] lowerDiagonal=new int[2*n-1];

        solve(board,n,0,ans,leftrow,upperDiagonal,lowerDiagonal);

        return ans;

    }

    public void solve(char[][] board, int n, int col, List<List<String>> result, int[] leftRow, int[] upperDiagonal, int[] lowerDiagonal) {
        if (col == n) {
            result.add(construct(board));
            return;
        }

        for (int row = 0; row < n; row++) {
            if (leftRow[row] == 0 && lowerDiagonal[row + col] == 0 && upperDiagonal[n - 1 + col - row] == 0) {
                board[row][col] = 'Q';
                leftRow[row] = 1;
                lowerDiagonal[row + col] = 1;
                upperDiagonal[n - 1 + col - row] = 1;
                solve(board, n, col + 1, result, leftRow, upperDiagonal, lowerDiagonal);
                board[row][col] = '.';
                leftRow[row] = 0;
                lowerDiagonal[row + col] = 0;
                upperDiagonal[n-1+col-row] = 0;

            }

        }


    }

    private List<String> construct(char[][] board) {
        List<String> result = new ArrayList<>();
        for (char[] row : board) {
            result.add(new String(row));
        }
        return result;
    }
}
