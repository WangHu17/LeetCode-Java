import bean.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wanghu
 * @discrption：
 * @create 2021-07-30 10:52
 */
public class Easy_101_SymmetricTree {

    //Runtime: 0 ms, faster than 100.00% of Java online submissions for Symmetric Tree.
    //Memory Usage: 36.9 MB, less than 74.83% of Java online submissions for Symmetric Tree.
    public boolean isSymmetric(TreeNode root) {
        return isMirror(root,root);
    }

    //与判断两个二叉树是否相同的方法类似，一个从左子树开始先序遍历，一个从右子树开始反先序遍历
    public boolean isMirror(TreeNode l1,TreeNode l2){
        if(l1==null&&l2==null)return true;
        if(l1==null||l2==null)return false;
        if(l1.val!=l2.val)return false;
        return isMirror(l1.left,l2.right)&&isMirror(l1.right,l2.left);
    }

}
