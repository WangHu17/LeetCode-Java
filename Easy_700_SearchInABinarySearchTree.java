import bean.TreeNode;

/**
 * @author wanghu
 * @discrption： 您将获得二叉搜索树 (BST) 的根和一个整数 val。 在 BST 中找到该节点的值等于 val 的节点，
 * 并返回以该节点为根的子树。如果这样的节点不存在，则返回 null。
 * @create 2021-12-05 14:46
 */
public class Easy_700_SearchInABinarySearchTree {

    //Runtime: 0 ms, faster than 100.00% of Java online submissions for Search in a Binary Search Tree.
    //Memory Usage: 39.9 MB, less than 70.57% of Java online submissions for Search in a Binary Search Tree.
    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null) return null;
        if (root.val == val) return root;
        else if (root.val > val) return searchBST(root.left, val);
        return searchBST(root.right, val);
    }

}
