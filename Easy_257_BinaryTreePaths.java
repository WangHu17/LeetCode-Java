import bean.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author wanghu
 * @discrption： 二叉树路径
 * @create 2021-08-24 9:30
 */
public class Easy_257_BinaryTreePaths {

    //Runtime: 9 ms, faster than 27.01% of Java online submissions for Binary Tree Paths.
    //Memory Usage: 39.3 MB, less than 57.08% of Java online submissions for Binary Tree Paths.
    private ArrayList<String> list = new ArrayList<>();

    public List<String> binaryTreePaths(TreeNode root) {
        if (root == null) return list;
        btp(root, root.val + "");
        return list;
    }

    public void btp(TreeNode p, String s) {
        if (p.left == null && p.right == null) {
            list.add(s);
            return;
        }
        if (p.left != null) {
            btp(p.left, s + "->" + p.left.val);
        }
        if (p.right != null) {
            btp(p.right, s + "->" + p.right.val);
        }
    }

}
