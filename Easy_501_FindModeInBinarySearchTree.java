import bean.TreeNode;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @author wanghu
 * @discrption： 求二叉搜索树出现最多的元素
 * @create 2021-12-01 15:06
 */
public class Easy_501_FindModeInBinarySearchTree {

    //方法：遍历二叉树，将元素及其数量用map记录
    //Runtime: 3 ms, faster than 61.16% of Java online submissions for Find Mode in Binary Search Tree.
    //Memory Usage: 41 MB, less than 40.77% of Java online submissions for Find Mode in Binary Search Tree.
    private Integer max = 0;
    private HashMap<Integer, Integer> map = new HashMap<>();

    public int[] findMode(TreeNode root) {
        count(root);
        int[] res = new int[map.size()];
        int index = 0;
        for (Integer key : map.keySet()) {
            if (map.get(key) == max) {
                res[index++] = key;
            }
        }
        return Arrays.copyOf(res, index);
    }

    private void count(TreeNode root) {
        if (root == null) {
            return;
        } else {
            map.put(root.val, map.getOrDefault(root.val, 0) + 1);
            max = Math.max(max, map.get(root.val));
        }
        count(root.left);
        count(root.right);
    }

}
