package BinarySearch;

import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class kthmissingelement {

    static int missingno(int[] arr, int k)
    {
        HashSet<Integer> set= new HashSet<>();

        for(int i=0;i< arr.length;i++)
        {
            set.add(arr[i]);
        }

        List<Integer> list=new ArrayList<>();

        for(int i=1;i<1000;i++)
        {
            if(set.contains(i))
            {
                continue;
            }
            else
            list.add(i);
        }

        return list.get(k-1);

    }


}
