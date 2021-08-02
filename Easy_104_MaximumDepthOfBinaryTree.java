import bean.TreeNode;

/**
 * @author wanghu
 * @discrption：求二叉树的高度
 * @create 2021-08-02 9:43
 */
public class Easy_104_MaximumDepthOfBinaryTree {

    //Runtime: 0 ms, faster than 100.00% of Java online submissions for Maximum Depth of Binary Tree.
    //Memory Usage: 38.5 MB, less than 98.26% of Java online submissions for Maximum Depth of Binary Tree.

    public int maxDepth(TreeNode root) {
        if(root==null)return 0;
        int l = maxDepth(root.left);
        int r = maxDepth(root.right);
        return Math.max(l,r)+1;
    }

}
