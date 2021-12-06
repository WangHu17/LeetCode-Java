import bean.TreeNode;

/**
 * @author wanghu
 * @discrption： 给定两棵二叉树 root 和 subRoot 的根，如果存在具有相同结构和 subRoot 节点值的 root 子树，
 * 则返回 true，否则返回 false。 二叉树的子树是由树中的一个节点和该节点的所有后代组成的树。
 * 树树也可以被认为是其自身的子树。
 * @create 2021-12-03 18:40
 */
public class Easy_572_SubtreeOfAnotherTree {

    //Runtime: 3 ms, faster than 96.05% of Java online submissions for Subtree of Another Tree.
    //Memory Usage: 39.5 MB, less than 44.70% of Java online submissions for Subtree of Another Tree.
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (root == null && subRoot == null) return true;
        if (root == null || subRoot == null) return false;
        if (isSameTree(root, subRoot)) return true;
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    private boolean isSameTree(TreeNode node1, TreeNode node2) {
        if (node1 == null && node2 == null) return true;
        if (node1 == null || node2 == null) return false;
        if (node1.val != node2.val) return false;
        return isSameTree(node1.left, node2.left) && isSameTree(node1.right, node2.right);
    }

}
