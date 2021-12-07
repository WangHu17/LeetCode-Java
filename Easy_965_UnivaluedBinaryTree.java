import bean.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author wanghu
 * @discrption： 如果树中的每个节点都具有相同的值，则二叉树是单值的。 给定二叉树的根，如果给定的树是单值的，则返回 true，否则返回 false。
 * @create 2021-12-07 10:15
 */
public class Easy_965_UnivaluedBinaryTree {

    //我的方法：BFS
    //Runtime: 0 ms, faster than 100.00% of Java online submissions for Univalued Binary Tree.
    //Memory Usage: 36.7 MB, less than 54.68% of Java online submissions for Univalued Binary Tree.
    public boolean isUnivalTree(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList();
        queue.add(root);
        while (!queue.isEmpty()) {
            Queue<TreeNode> temp = new LinkedList();
            while (!queue.isEmpty()) {
                TreeNode node = queue.poll();
                if (node.val != root.val)return false;
                if (node.left != null) temp.add(node.left);
                if (node.right != null) temp.add(node.right);
            }
            queue = temp;
        }
        return true;
    }

}
