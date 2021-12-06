import bean.TreeNode;

/**
 * @author wanghu
 * @discrption： 给定二叉树的根，返回每个树节点倾斜度的总和。 树节点的倾斜度是所有左子树节点值和所有右子树节点值之和的绝对差。
 * 如果节点没有左子节点，则左子树节点值的总和被视为 0。如果节点没有右子节点，则规则类似。
 * @create 2021-12-03 17:00
 */
public class Easy_563_BinaryTreeTilt {

    //Runtime: 0 ms, faster than 100.00% of Java online submissions for Binary Tree Tilt.
    //Memory Usage: 39.8 MB, less than 29.99% of Java online submissions for Binary Tree Tilt.
    private Integer res = 0;

    public int findTilt(TreeNode root) {
        countTilt(root);
        return res;
    }

    private int countTilt(TreeNode node) {
        if (node == null) return 0;
        int leftSum = countTilt(node.left);
        int rightSum = countTilt(node.right);
        int tilt = Math.abs(leftSum - rightSum);
        res += tilt;
        return node.val + leftSum + rightSum;
    }

}
