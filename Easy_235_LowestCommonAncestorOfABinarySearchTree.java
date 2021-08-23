import bean.TreeNode;

/**
 * @author wanghu
 * @discrption： 二叉搜索树的最低公共祖先
 * @create 2021-08-23 11:13
 */
public class Easy_235_LowestCommonAncestorOfABinarySearchTree {

    //方法：利用最低公共祖先的值一定在p、q之间（包括等于）这一结束条件进行递归
    //Runtime: 3 ms, faster than 100.00% of Java online submissions for Lowest Common Ancestor of a Binary Search Tree.
    //Memory Usage: 39.6 MB, less than 85.37% of Java online submissions for Lowest Common Ancestor of a Binary Search Tree.
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || p == null || q == null) return null;
        if ((p.val <= root.val && q.val >= root.val) || (p.val >= root.val && q.val <= root.val)) return root;
        if (p.val < root.val && q.val < root.val) return lowestCommonAncestor(root.left, p, q);
        else return lowestCommonAncestor(root.right, p, q);
    }

}
