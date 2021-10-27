import bean.TreeNode;

import java.util.HashSet;
import java.util.Set;

/**
 * @author wanghu
 * @discrption：
 * @create 2021-10-27 11:09
 */
public class Easy_653_TwoSumIV_InputIsABST {

    // 要使用set保存数值，比使用list快很多
    //Runtime: 2 ms, faster than 98.67% of Java online submissions for Two Sum IV - Input is a BST.
    //Memory Usage: 40.2 MB, less than 70.62% of Java online submissions for Two Sum IV - Input is a BST.
    private Set<Integer> set = new HashSet<Integer>();

    public boolean findTarget(TreeNode root, int k) {
        if (root == null) return false;
        if (set.contains(k - root.val)) return true;
        set.add(root.val);
        return findTarget(root.left, k) || findTarget(root.right, k);
    }

}
