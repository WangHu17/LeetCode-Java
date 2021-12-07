import bean.TreeNode;

/**
 * @author wanghu
 * @discrption： 给定一个二叉树的根，其中每个节点的值都是 0 或 1。每个根到叶的路径代表一个从最高有效位开始的二进制数。
 * 例如，如果路径是 0 -> 1 -> 1 -> 0 -> 1，那么这可以用二进制表示 01101，即 13。
 * 对于树中的所有叶子，请考虑从根到该叶子的路径所代表的数字。 返回这些数字的总和。答案保证适合 32 位整数。
 * @create 2021-12-07 14:47
 */
public class Easy_1022_SumOfRootToLeafBinaryNumbers {

    //方法：DFS preOrder
    //Runtime: 0 ms, faster than 100.00% of Java online submissions for Sum of Root To Leaf Binary Numbers.
    //Memory Usage: 39.5 MB, less than 16.48% of Java online submissions for Sum of Root To Leaf Binary Numbers.
    private int sum = 0;

    public int sumRootToLeaf(TreeNode root) {
        preOrder(root, 0);
        return sum;
    }

    private void preOrder(TreeNode node, int cur) {
        if (node != null) {
            cur = (cur << 1) | node.val; // ‘|’ 符号是或操作
            // 如果到叶节点了，把这条路径的值加到总和里
            if (node.left == null && node.right == null)
                sum += cur;
            preOrder(node.left, cur);
            preOrder(node.right, cur);
        }
    }

}
