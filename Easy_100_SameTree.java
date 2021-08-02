import bean.TreeNode;

/**
 * @author wanghu
 * @discrption：判断两个二叉树是否相同
 * @create 2021-07-30 9:56
 */
public class Easy_100_SameTree {

    //先序遍历
    //Runtime: 0 ms, faster than 100.00% of Java online submissions for Same Tree.
    //Memory Usage: 36.1 MB, less than 89.24% of Java online submissions for Same Tree.
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null&&q==null)return true;
        if(p==null||q==null)return false;
        if(p.val!=q.val)return false;
        return isSameTree(p.left,q.left)&&isSameTree(p.right,q.right);
    }

}
