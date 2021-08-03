import bean.TreeNode;

/**
 * @author wanghu
 * @discrption：求二叉树的最低高度
 * @create 2021-08-03 11:25
 */
public class Easy_111_MinimumDepthOfBinaryTree {

    //Runtime: 5 ms, faster than 66.14% of Java online submissions for Minimum Depth of Binary Tree.
    //Memory Usage: 59.9 MB, less than 47.11% of Java online submissions for Minimum Depth of Binary Tree.
    public int minDepth(TreeNode root) {
        if(root==null)return 0;
        int l=minDepth(root.left);
        int r=minDepth(root.right);
        return (l>0&&r>0)?Math.min(l,r)+1:Math.max(l,r)+1;
    }

}
