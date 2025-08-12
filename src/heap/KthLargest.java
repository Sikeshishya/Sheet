package heap;

import java.util.PriorityQueue;

public class KthLargest {

    PriorityQueue<Integer> pq;
    int k;

    public KthLargest(int k, int[] nums) {

        this.k=k;
        pq=new PriorityQueue<>();
        for(int num:nums)
        {
            add(num);
        }

    }

    public int add(int val) {

        if(pq.size()<k || val > pq.peek())
        {
            pq.add(val);
            if(pq.size()>k)
            {
                pq.poll();
            }
        }
        return pq.peek();

    }
}
