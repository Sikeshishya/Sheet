package Trees;

import com.sun.source.tree.Tree;

public class isCousins {
    public boolean isCousins(TreeNode root, int x, int y) {

        TreeNode xx=findnode(root,x);
        TreeNode yy=findnode(root,y);

        return (level(root, xx, 0) == level(root, yy, 0)) && !isSibling(root, xx, yy);


    }

    public TreeNode findnode(TreeNode root,int x)
    {
        if(root==null)
        {
            return null;
        }

        if(root.val==x)
        {
            return root;
        }

        TreeNode left=findnode(root.left,x);
        if(left!=null)
        {
            return left;
        }
        return findnode(root.right,x);
    }

    public boolean isSibling(TreeNode root,TreeNode x, TreeNode y)
    {
        if(root==null)
        {
            return false;
        }

        return (
                (root.left==x && root.right==y) || (root.right==x && root.left==y)|| isSibling(root.left,x,y)||isSibling(root.right,x,y)
                );
    }

    public int level(TreeNode root,TreeNode x,int lev)
    {
        if(root==null)
        {
            return -1;
        }

        if(root==x)
        {
            return lev;
        }

        int l=level(root.left,x,lev+1);
        if(l!=0)
        {
            return l;
        }
        return level(root.right,x,lev+1);
    }
}
