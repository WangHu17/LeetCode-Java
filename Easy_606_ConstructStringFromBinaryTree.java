import bean.TreeNode;

/**
 * @author wanghu
 * @discrption： 给定一棵二叉树的根，用前序遍历方式从二叉树构造一个由括号和整数组成的字符串，并返回。
 * 省略所有不影响字符串与原始二叉树一对一映射关系的空括号对。
 * Example 1:
 * Input: root = [1,2,3,4]
 * Output: "1(2(4))(3)"
 * Example 2:
 * Input: root = [1,2,3,null,4]
 * Output: "1(2()(4))(3)"
 * @create 2021-10-22 10:38
 */
public class Easy_606_ConstructStringFromBinaryTree {

    // 方法：递归
    //Runtime: 14 ms, faster than 54.44% of Java online submissions for Construct String from Binary Tree.
    //Memory Usage: 40.3 MB, less than 72.70% of Java online submissions for Construct String from Binary Tree.
    public String tree2str(TreeNode root) {
        if (root == null)
            return "";
        if (root.left == null && root.right == null)
            return root.val + "";
        if (root.right == null) // 如果没有右叶子节点，就省略括号，没有左叶子节点仍需要括号，所以不考虑
            return root.val + "(" + tree2str(root.left) + ")";
        return root.val + "(" + tree2str(root.left) + ")(" + tree2str(root.right) + ")";
    }

}
