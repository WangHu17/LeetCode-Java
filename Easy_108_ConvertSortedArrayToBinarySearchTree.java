import bean.TreeNode;

/**
 * @author wanghu
 * @discrption：将一个有序数组转变为一棵二叉排序树
 * @create 2021-08-03 10:34
 */
public class Easy_108_ConvertSortedArrayToBinarySearchTree {

    //二分法
    //Runtime: 0 ms, faster than 100.00% of Java online submissions for Convert Sorted Array to Binary Search Tree.
    //Memory Usage: 38.7 MB, less than 52.86% of Java online submissions for Convert Sorted Array to Binary Search Tree.
    public TreeNode sortedArrayToBST(int[] nums) {
        return toBTS(nums,0,nums.length-1);
    }

    public TreeNode toBTS(int[] nums, int low, int high) {
        if (low > high) return null;
        int mid = (low + high) / 2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = toBTS(nums, low, mid - 1);
        node.right = toBTS(nums, mid + 1, high);
        return node;
    }

}
