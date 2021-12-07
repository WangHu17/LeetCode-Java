import bean.TreeNode;

/**
 * @author wanghu
 * @discrption： 给定二叉搜索树的根节点和两个整数 low 和 high，返回值在包含范围 [low, high] 内的所有节点的值之和。
 * @create 2021-12-07 9:42
 */
public class Easy_938_RangeSumOfBST {

    //Runtime: 0 ms, faster than 100.00% of Java online submissions for Range Sum of BST.
    //Memory Usage: 47.3 MB, less than 63.00% of Java online submissions for Range Sum of BST.
    public int rangeSumBST(TreeNode root, int low, int high) {
        if (root == null) return 0;
        if (root.val <= low)
            return (root.val == low ? low : 0) + rangeSumBST(root.right, low, high);
        if (root.val > low && root.val < high)
            return root.val + rangeSumBST(root.left, low, high) + rangeSumBST(root.right, low, high);
        else
            return (root.val == high ? high : 0) + rangeSumBST(root.left, low, high);
    }

}
