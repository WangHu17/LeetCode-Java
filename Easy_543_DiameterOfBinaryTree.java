import bean.TreeNode;

/**
 * @author wanghu
 * @discrption： 给定二叉树的根，返回树的直径长度。 二叉树的直径是树中任意两个节点之间最长路径的长度。
 * 此路径可能会或可能不会通过根。 两个节点之间的路径长度由它们之间的边数表示。
 * @create 2021-12-02 11:19
 */
public class Easy_543_DiameterOfBinaryTree {

    //Runtime: 0 ms, faster than 100.00% of Java online submissions for Diameter of Binary Tree.
    //Memory Usage: 39 MB, less than 63.64% of Java online submissions for Diameter of Binary Tree.
    private int res = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null) return 0;
        len(root);
        return res;
    }

    private int len(TreeNode root) {
        if (root == null) return 0;
        int l = len(root.left);
        int r = len(root.right);
        res = Math.max(l + r, res);
        return Math.max(l, r) + 1;
    }

}
