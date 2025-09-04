package Trees;


import java.util.LinkedList;
import java.util.Queue;

public class widthOfBinaryTree {
    class Pair {
        TreeNode node;
        int index;

        Pair(TreeNode node, int index) {
            this.node = node;
            this.index = index;
        }

    }

    int max = 0;

    public int widthOfBinaryTree(TreeNode root) {
        if (root == null) {
            return 0;
        }

        Queue<Pair> queue = new LinkedList<>();
        queue.offer(new Pair(root, 0));

        while (!queue.isEmpty()) {
            int size = queue.size();
            ;
            int firstindex = queue.peek().index;
            int lastindex = firstindex;

            for (int i = 0; i < size; i++) {
                Pair current = queue.poll();
                TreeNode node = current.node;
                int index = current.index;

                if (node.left != null) {
                    queue.add(new Pair(node.left, 2 * i));
                }
                if (node.right != null) {
                    queue.add(new Pair(node.right, 2 * i + 1));
                }
            }

            max = Math.max(max, lastindex - firstindex + 1);


        }
        return max;

    }
}
