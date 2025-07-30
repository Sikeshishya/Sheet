package stack;

import java.util.HashMap;
import java.util.Stack;

public class nextGreaterElements {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        int[] nge=new int[nums2.length];
        Stack<Integer> stack=new Stack<>();
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=nums2.length-1;i>=0;i--)
        {
            while (!stack.isEmpty() && stack.peek() <= nums2[i])

            {
                stack.pop();
            }
            if(stack.isEmpty())
            {
                nge[i]=-1;
            }
            else {
                nge[i]=stack.peek();
            }
            stack.push(nums2[i]);
            map.put(nums2[i],nge[i]);

        }
        int[] ans=new int[nums1.length];
        for(int i=0;i< nums1.length;i++)
        {
            ans[i]=map.get(nums1[i]);
        }
        return ans;

    }

}
