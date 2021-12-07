import bean.TreeNode;

/**
 * @author wanghu
 * @discrption： 给定具有唯一值的二叉树的根和 x 和 y 的两个不同节点的值，如果树中值 x 和 y 对应的节点是表亲，则返回 true，
 * 否则返回 false。 如果二叉树的两个节点与不同的父节点具有相同的深度，则它们是表亲。 请注意，在二叉树中，根节点位于深度 0，
 * 每个深度 k 节点的子节点位于深度 k + 1。
 * @create 2021-12-07 10:52
 */
public class Easy_993_CousinsInBinaryTree {

    //Runtime: 1 ms, faster than 47.50% of Java online submissions for Cousins in Binary Tree.
    //Memory Usage: 38.7 MB, less than 40.61% of Java online submissions for Cousins in Binary Tree.
    private int xDepth = 0, yDepth = 0;
    private TreeNode xParent = null, yParent = null;

    public boolean isCousins(TreeNode root, int x, int y) {
        if (x == root.val || y == root.val)return false;
        dfs(root, root.left, x, y, 0);
        dfs(root, root.right, x, y, 0);
        return xDepth == yDepth && xParent != yParent;
    }

    private void dfs(TreeNode parent, TreeNode child, int x, int y, int depth) {
        if (child == null) return;
        if (child.val == x) {
            xDepth = depth;
            xParent = parent;
        }
        if (child.val == y) {
            yDepth = depth;
            yParent = parent;
        }
        parent = child;
        dfs(parent, child.left, x, y, depth + 1);
        dfs(parent, child.right, x, y, depth + 1);
    }

}
