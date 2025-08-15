package greedy;

public class jumpgametwo {
    public int jump(int[] nums) {

        int l = 0;
        int r = 0;
        int jumps = 0;

        while (r < nums.length) {
            int farthest = 0;

            for (int i = l; i < r; i++) {
                farthest = Math.max(nums[i] + i, farthest);

            }
            l = r + 1;
            r = farthest;
            jumps++;
        }
        return jumps;

    }
}
