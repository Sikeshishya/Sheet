package greedy;

import java.util.ArrayList;
import java.util.List;

public class mergeintervals {

    public int[][] mergeforn2(int[][] intervals) {
        List<int[]> ans = new ArrayList<>();
        for (int i = 0; i < intervals.length; i++) {
            int start = intervals[i][0];
            int end = intervals[i][1];

            if (!ans.isEmpty() && end <= ans.get(ans.size() - 1)[1]) {
                continue;
            }

            for (int j = i + 1; j < intervals.length; i++) {
                if (intervals[j][0] <= end) {
                    end = Math.max(end, intervals[j][1]);

                } else {
                    break;
                }
            }
            ans.add((new int[]{start, end}));

        }
        return ans.toArray(new int[ans.size()][]);
    }

    public int[][] mergeforn(int[][]  intervals)
    {
        List<int[]> ans=new ArrayList<>();

        for(int[] interval:intervals)
        {

            if(ans.isEmpty()|| interval[0]>ans.get(ans.size()-1)[1])
            {
                ans.add(interval);
            }
            else {
                ans.get(ans.size()-1)[1]=Math.max(interval[1],ans.get(ans.size()-1)[1]);
            }

        }

        return ans.toArray(new int[ans.size()][]);
    }
}
