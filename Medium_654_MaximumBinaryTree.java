import bean.TreeNode;

/**
 * @author wanghu
 * @discrption： 给定一个不含重复元素的整数数组 nums 。一个以此数组直接递归构建的 最大二叉树 定义如下：
 * <p>
 * 二叉树的根是数组 nums 中的最大元素。
 * 左子树是通过数组中 最大值左边部分 递归构造出的最大二叉树。
 * 右子树是通过数组中 最大值右边部分 递归构造出的最大二叉树。
 * 返回有给定数组 nums 构建的 最大二叉树 。
 * @create 2022-01-13 17:06
 */
public class Medium_654_MaximumBinaryTree {

    //Runtime: 4 ms, faster than 39.38% of Java online submissions for Maximum Binary Tree.
    //Memory Usage: 51.6 MB, less than 26.68% of Java online submissions for Maximum Binary Tree.
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return construct(nums, 0, nums.length);
    }

    private TreeNode construct(int[] nums, int l, int r) {
        if (l == r)return null;
        int maxi = maxi(nums,l,r);
        TreeNode root = new TreeNode(nums[maxi]);
        root.left = construct(nums, l, maxi);
        root.right = construct(nums, maxi + 1, r);
        return root;
    }

    //找区间的最大值的位置
    private int maxi(int[] nums, int l, int r) {
        int maxi = l;
        for (int i = l; i < r; i++) {
            if (nums[maxi] < nums[i]) maxi = i;
        }
        return maxi;
    }

}
