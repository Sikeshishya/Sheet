package greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class eraseOverlapIntervals {
    public int eraseOverlapIntervals(int[][] intervals) {

        if (intervals.length <= 1) {
            return 0;
        }

        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));

        List<int[]> ans = new ArrayList<>();
        ans.add(intervals[0]);
        int count = 1;

        for (int i = 1; i < intervals.length; i++) {
            int start = intervals[i][0];
            int end = intervals[i][1];

            if (end <= ans.get(ans.size() - 1)[1]) {
                count++;
            }
            ans.add(new int[]{start,end});

        }
        return intervals.length - count;


    }
}
