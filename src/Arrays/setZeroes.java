package Arrays;

public class setZeroes {

    public void setZeroes(int[][] matrix) {


        int n=matrix.length;
        int m=matrix[0].length;

        int[] row=new int[n];
        int[] col=new int[m];



        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(matrix[i][j]==0)
                {
                    row[i]=0;
                    row[j]=0;
                }
            }
        }

        for(int i=0;i<n;i++) {
            for (int j = 0; j < m; j++) {
                if (row[i] == 0 || col[j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        return;


    }
}
