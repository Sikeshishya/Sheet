package heap;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class topKFrequent {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:nums)
        {
            map.put(num,map.getOrDefault(num,0)+1);
        }

        PriorityQueue<Map.Entry<Integer,Integer>> pq=new PriorityQueue<>((a,b)->b.getValue()-a.getValue());

        for(Map.Entry entry: map.entrySet())
        {
            pq.add(entry);
        }

        int[] ans=new int[nums.length];
        for(int i=0;i<k;i++)
        {
            ans[i]=pq.poll().getKey();
        }
        return ans;

    }
}
