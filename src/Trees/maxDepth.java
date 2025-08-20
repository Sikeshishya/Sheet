package Trees;


public class maxDepth {

    public int maxDepth(TreeNode root) {
        int maxheight = 0;
        if (root == null) {
            return 0;
        }

        int left = maxDepth(root.left);
        int right = maxDepth(root.right);

        maxheight = Math.max(left, right) + 1;

        return maxheight;


    }
}


