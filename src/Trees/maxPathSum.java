package Trees;

public class maxPathSum {

    int maxval=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {

        if(root==null)
        {
            return 0;
        }

        helper(root);
        return maxval;

    }

    public int helper(TreeNode node)
    {
        if(node==null)
        {
            return 0;
        }

        int left = Math.max(0, helper(node.left));
        int right = Math.max(0, helper(node.right));

        maxval=Math.max(left+right+node.val,maxval);

        return node.val+Math.max(left,right);

    }
}
