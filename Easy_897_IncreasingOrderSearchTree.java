import bean.TreeNode;

/**
 * @author wanghu
 * @discrption： 给定一棵二叉搜索树的根，按顺序重新排列树，使树中最左边的节点现在是树的根，每个节点都没有左孩子，只有一个右孩子。
 * @create 2021-11-26 11:10
 */
public class Easy_897_IncreasingOrderSearchTree {

    //我的方法
    //Runtime: 0 ms, faster than 100.00% of Java online submissions for Increasing Order Search Tree.
    //Memory Usage: 38.3 MB, less than 28.97% of Java online submissions for Increasing Order Search Tree.
    private TreeNode res = new TreeNode(0);
    private TreeNode node = res;

    public TreeNode increasingBST(TreeNode root) {
        if (root==null)return node;
        increasingBST(root.left);
        node.right = new TreeNode(root.val);;
        node = node.right;
        increasingBST(root.right);
        return res.right;
    }

}
