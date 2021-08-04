import bean.TreeNode;

/**
 * @author wanghu
 * @discrption：给一个值，一棵树的根节点，判断这棵树是否有一条路径（根节点到叶节点）的长度等于该值
 * @create 2021-08-04 10:27
 */
public class Easy_112_PathSum {

    //方法：主要是判断是否到了叶子节点，即左孩子和右孩子都是null的时候，这时候判断路径和

    //Runtime: 0 ms, faster than 100.00% of Java online submissions for Path Sum.
    //Memory Usage: 38.4 MB, less than 98.81% of Java online submissions for Path Sum.
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) return false;
        return (root.left == null && root.right == null && root.val == targetSum)
                || (hasPathSum(root.left, targetSum - root.val))
                || (hasPathSum(root.right, targetSum - root.val));
    }

}
