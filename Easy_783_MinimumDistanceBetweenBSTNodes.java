import bean.TreeNode;

/**
 * @author wanghu
 * @discrption： 给定二叉搜索树 (BST) 的根，返回树中任意两个不同节点的值之间的最小差异。
 * @create 2021-12-06 11:11
 */
public class Easy_783_MinimumDistanceBetweenBSTNodes {

    //我的方法：中序遍历，用一个变量保存前一个节点的值，每次递归求出最小差
    //Runtime: 0 ms, faster than 100.00% of Java online submissions for Minimum Distance Between BST Nodes.
    //Memory Usage: 36.4 MB, less than 93.78% of Java online submissions for Minimum Distance Between BST Nodes.
    private int min = Integer.MAX_VALUE, pre = Integer.MAX_VALUE;

    public int minDiffInBST(TreeNode root) {
        inOrder(root);
        return min;
    }

    private void inOrder(TreeNode node) {
        if (node == null) return;
        inOrder(node.left);
        min = Math.min(min, Math.abs(node.val - pre));
        pre = node.val;
        inOrder(node.right);
    }

}
