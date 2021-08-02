import bean.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wanghu
 * @discrption：二叉树中序遍历
 * @create 2021-07-29 10:34
 */
public class Easy_94_BinaryTreeInorderTraversal {

    //我的方法
    //Runtime: 0 ms, faster than 100.00% of Java online submissions for Binary Tree Inorder Traversal.
    //Memory Usage: 37.3 MB, less than 49.04% of Java online submissions for Binary Tree Inorder Traversal.
    List<Integer> list = new ArrayList<>();

    public List<Integer> inorderTraversal(TreeNode root) {
        if(root==null)return list;
        inorderTraversal(root.left);
        list.add(root.val);
        inorderTraversal(root.right);
        return list;
    }

}
