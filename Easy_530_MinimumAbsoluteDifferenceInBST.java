import bean.TreeNode;

/**
 * @author wanghu
 * @discrption： 求二叉搜索树中任意两个节点的最小差
 * @create 2021-12-02 9:49
 */
public class Easy_530_MinimumAbsoluteDifferenceInBST {

    //Runtime: 0 ms, faster than 100.00% of Java online submissions for Minimum Absolute Difference in BST.
    //Memory Usage: 38.5 MB, less than 88.47% of Java online submissions for Minimum Absolute Difference in BST.
    private Integer pre = Integer.MAX_VALUE, min = Integer.MAX_VALUE;

    public int getMinimumDifference(TreeNode root) {
        inorder(root);
        return min;
    }

    private int inorder(TreeNode root) {
        if (root == null) return 0;
        inorder(root.left);
        min = Math.min(min, Math.abs(root.val - pre));
        pre = root.val;
        inorder(root.right);
        return min;
    }

}
