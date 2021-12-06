import bean.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wanghu
 * @discrption： 考虑二叉树的所有叶子，从左到右的顺序，这些叶子的值形成一个叶子值序列。
 * 如果两个二叉树的叶值序列相同，则认为它们是叶相似的。 当且仅当具有头节点 root1 和 root2 的两个给定树是叶子相似时才返回 true。
 * @create 2021-12-06 11:21
 */
public class Easy_872_LeafSimilarTrees {

    //方法：DFS
    //Runtime: 0 ms, faster than 100.00% of Java online submissions for Leaf-Similar Trees.
    //Memory Usage: 36.9 MB, less than 59.34% of Java online submissions for Leaf-Similar Trees.
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        dfs(root1,list1);
        dfs(root2,list2);
        return list1.equals(list2);
    }

    private void dfs(TreeNode node, List<Integer> list) {
        if (node != null) {
            if (node.left == null && node.right == null) list.add(node.val);
            dfs(node.left, list);
            dfs(node.right, list);
        }
    }


}
