package Trees;

public class Balancedbinarytree {
    public boolean isBalanced(TreeNode root) {

        if (root == null) {
            return true;
        }
        int leftheight = getheight(root.left);
        int rightheight = getheight(root.right);

        if (Math.abs(leftheight - rightheight) <= 1)
        {
            return true;
        }

        return false;

    }

    public int getheight(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int left = getheight(root.left);
        int right = getheight(root.right);

        return Math.max(left, right) + 1;
    }

}
