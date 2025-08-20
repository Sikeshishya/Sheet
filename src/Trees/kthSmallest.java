package Trees;

public class kthSmallest {
    int count=0;
    public int kthSmallest(TreeNode root, int k) {

        return helper(root, k).val;

    }

    public TreeNode helper(TreeNode root, int k) {

        if(root==null)
        {
            return null;
        }

        TreeNode left=root.left;
        if(left!=null)
        {
            return left;
        }
        if(count==k)
        {
            return root;
        }
        else {
            return helper(root.right,k);
        }






    }
}
