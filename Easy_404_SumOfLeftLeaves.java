import bean.TreeNode;

/**
 * @author wanghu
 * @discrption： 求二叉树的所有左叶子节点的和
 * @create 2021-12-01 14:29
 */
public class Easy_404_SumOfLeftLeaves {

    //Runtime: 0 ms, faster than 100.00% of Java online submissions for Sum of Left Leaves.
    //Memory Usage: 36.9 MB, less than 53.38% of Java online submissions for Sum of Left Leaves.
    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) return 0;
        if (root.left != null && root.left.left == null && root.left.right == null) {
            return root.left.val + sumOfLeftLeaves(root.right);
        }
        return sumOfLeftLeaves(root.left) + sumOfLeftLeaves(root.right);
    }

}
