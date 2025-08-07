package recursion;

import java.util.Stack;

public class largestRectangleArea {

    public int largestRectangleArea(int[] heights) {

        Stack<Integer> stack = new Stack<>();
        int maxarea = 0;

        for (int i = 0; i < heights.length; i++) {
            int currHeight = (i == heights.length) ? 0 : heights[i];

            while(!stack.isEmpty() && heights[stack.peek()] > currHeight)
            while(!stack.isEmpty() && heights[stack.peek()] > heights[i])
            {
                int element=heights[stack.pop()];
                int nse=i;
                int pse=stack.isEmpty()?-1:stack.peek();
                int area=element*(nse-pse-1);
                maxarea=Math.max(maxarea,area);
            }
            stack.push(i);
        }

        return maxarea;

    }
}
