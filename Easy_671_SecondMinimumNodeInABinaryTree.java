import bean.TreeNode;

import java.util.Collections;
import java.util.HashSet;

/**
 * @author wanghu
 * @discrption： 给定一个由具有非负值的节点组成的非空特殊二叉树，其中该树中的每个节点恰好有两个或零个子节点。
 * 如果该节点有两个子节点，则该节点的值为其两个子节点中较小的值。更正式地说，属性
 * root.val = min(root.left.val, root.right.val) 始终成立。 给定这样一棵二叉树，
 * 您需要输出整个树中所有节点的值组成的集合中的第二个最小值。 如果不存在这样的第二个最小值，则输出 -1。
 * @create 2021-12-05 14:14
 */
public class Easy_671_SecondMinimumNodeInABinaryTree {

    //我的方法：遍历树将所有的元素放入set中，移除set中最小的元素即根节点的值，然后返回set中最小的值
    //Runtime: 0 ms, faster than 100.00% of Java online submissions for Second Minimum Node In a Binary Tree.
    //Memory Usage: 36.2 MB, less than 87.74% of Java online submissions for Second Minimum Node In a Binary Tree.
    private HashSet<Integer> set = new HashSet<>();

    public int findSecondMinimumValue(TreeNode root) {
        preOrder(root);
        if (set.size() == 1)return -1;
        set.remove(root.val);
        return Collections.min(set);
    }

    private void preOrder(TreeNode node) {
        if (node == null) return;
        set.add(node.val);
        preOrder(node.left);
        preOrder(node.right);
    }

}
