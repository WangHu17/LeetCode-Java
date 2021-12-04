import bean.TreeNode;

/**
 * @author wanghu
 * @discrption： 给定两个二叉树 root1 和 root2。 想象一下，当您将其中一个覆盖另一个时，
 * 两棵树的某些节点重叠而其他节点不重叠。您需要将两棵树合并成一个新的二叉树。合并规则是，
 * 如果两个节点重叠，则将节点值相加作为合并节点的新值。否则，NOT null 节点将用作新树的节点。
 * 返回合并后的树。 注意：合并过程必须从两棵树的根节点开始。
 * @create 2021-12-04 13:59
 */
public class Easy_617_MergeTwoBinaryTrees {

    //Runtime: 0 ms, faster than 100.00% of Java online submissions for Merge Two Binary Trees.
    //Memory Usage: 39.6 MB, less than 36.39% of Java online submissions for Merge Two Binary Trees.
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if (root1 == null) return root2;
        if (root2 == null) return root1;
        root1.val += root2.val;
        root1.left = mergeTrees(root1.left, root2.left);
        root1.right = mergeTrees(root1.right, root2.right);
        return root1;
    }

}
