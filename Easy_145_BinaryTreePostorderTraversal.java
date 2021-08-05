import bean.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wanghu
 * @discrption：树的后序遍历
 * @create 2021-08-05 9:18
 */
public class Easy_145_BinaryTreePostorderTraversal {

    //我的方法
    //Runtime: 0 ms, faster than 100.00% of Java online submissions for Binary Tree Postorder Traversal.
    //Memory Usage: 37 MB, less than 87.76% of Java online submissions for Binary Tree Postorder Traversal.
    private List<Integer> list = new ArrayList<>();

    public List<Integer> postorderTraversal(TreeNode root) {
        if(root==null)return list;
        postorderTraversal(root.left);
        postorderTraversal(root.right);
        list.add(root.val);
        return list;
    }

}
