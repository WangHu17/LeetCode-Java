import bean.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wanghu
 * @discrption：树的先序遍历
 * @create 2021-08-05 9:13
 */
public class Easy_144_BinaryTreePreorderTraversal {

    //我的方法
    //Runtime: 0 ms, faster than 100.00% of Java online submissions for Binary Tree Preorder Traversal.
    //Memory Usage: 36.9 MB, less than 95.21% of Java online submissions for Binary Tree Preorder Traversal.
    private List<Integer> list = new ArrayList<>();

    public List<Integer> preorderTraversal(TreeNode root) {
        if(root==null)return list;
        list.add(root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);
        return list;
    }

}
