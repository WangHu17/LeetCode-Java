import bean.TreeNode;

/**
 * @author wanghu
 * @discrption：判断一棵树是否是平衡二叉树
 * @create 2021-08-03 11:00
 */
public class Easy_110_BalancedBinaryTree {

    //方法：在求树的最大高度过程中，判断左子树与右子树的高度差是否大于1
    //Runtime: 0 ms, faster than 100.00% of Java online submissions for Balanced Binary Tree.
    //Memory Usage: 39 MB, less than 76.22% of Java online submissions for Balanced Binary Tree.

    private boolean flag=true;

    public boolean isBalanced(TreeNode root) {
        if(root==null)return true;
        maxDepth(root);
        return flag;
    }

    public int maxDepth(TreeNode root){
        if(root==null)return 0;
        int l = maxDepth(root.left);
        int r = maxDepth(root.right);
        if(Math.abs(l-r)>1)flag=false;
        return Math.max(l,r)+1;
    }
}
