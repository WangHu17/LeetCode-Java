import java.util.Arrays;

/**
 * @author wanghu
 * @discrption： 给定一个按非降序排序的整数数组 nums，返回一个按非降序排序的每个数字的平方数组。
 * @create 2021-10-09 9:45
 */
public class Easy_977_SquaresOfASortedArray {

    //我的方法：先平方再排序
    //Runtime: 2 ms, faster than 67.18% of Java online submissions for Squares of a Sorted Array.
    //Memory Usage: 40.8 MB, less than 66.43% of Java online submissions for Squares of a Sorted Array.
    public int[] sortedSquares(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }

}
