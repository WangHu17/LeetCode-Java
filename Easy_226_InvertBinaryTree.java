import bean.TreeNode;

/**
 * @author wanghu
 * @discrption： 反转二叉树
 * @create 2021-08-19 9:18
 */
public class Easy_226_InvertBinaryTree {

    //我的方法：递归先序遍历，交换左右子树
    //Runtime: 0 ms, faster than 100.00% of Java online submissions for Invert Binary Tree.
    //Memory Usage: 36.1 MB, less than 94.08% of Java online submissions for Invert Binary Tree.
    public TreeNode invertTree(TreeNode root) {
        invert(root);
        return root;
    }

    public void invert(TreeNode root){
        if(root==null)return;
        TreeNode p = root.left;
        root.left = root.right;
        root.right = p;
        invert(root.left);
        invert(root.right);
    }

}
