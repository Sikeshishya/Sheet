package Arrays;

import java.util.ArrayList;
import java.util.List;

public class pascaltriangle {

    public static void main(String[] args) {
        System.out.println(printele(5, 3));
        System.out.println(printrow(5));
        System.out.println(generate(5));
    }

    static int printele(int row, int col) {
        int res = 1;
        for (int i = 0; i < col; i++) {
            res = res * (row - i);
            res = res / (i + 1);
        }
        return res;
    }


    static List<Integer> printrow(int row) {
        int res = 1;
        List<Integer> list = new ArrayList<>();
        list.add(res);

        for (int i = 1; i <= row; i++) {
            res = res * (row - i + 1);
            res = res / (i);
            list.add(res);

        }
        return list;
    }

    static List<List<Integer>> generate(int numRows)
    {
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i<numRows;i++)
        {
            ans.add(printrow(i));
        }

        return ans;
    }
}
