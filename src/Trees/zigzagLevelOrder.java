package Trees;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class zigzagLevelOrder {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        List<List<Integer>> ans = new ArrayList<>();
        Deque<TreeNode> queue = new LinkedList<>();

        if (root == null) {
            return ans;
        }

        queue.add(root);
        boolean flag = false;

        while (!queue.isEmpty()) {

            int size = queue.size();
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < size; i++)
            {
                if (flag != false) {
                    {
                        TreeNode node = queue.pollFirst();
                        list.add(node.val);
                        while (node.left != null) {
                            queue.addLast(node.left);
                        }
                        while (node.right != null) {
                            queue.addLast(node.right);
                        }
                    }
                } else {
                    {
                        TreeNode node = queue.pollLast();
                        list.add(node.val);
                        while (node.right != null) {
                            queue.addFirst(node.left);
                        }
                        while (node.left != null) {
                            queue.addFirst(node.right);
                        }
                    }
                }


            }
            flag = !flag;
            ans.add(list);


        }
        return ans;

    }
}
