import java.util.Arrays;

/**
 * @author wanghu
 * @discrption： 示例 1：
 * <p>
 * 输入：nums = [3,5,2,3]
 * 输出：7
 * 解释：数组中的元素可以分为数对 (3,3) 和 (5,2) 。
 * 最大数对和为 max(3+3, 5+2) = max(6, 7) = 7 。
 * @create 2022-01-16 16:59
 */
public class Medium_1877_MinimizeMaximumPairSumInArray {

    //我的方法
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int max = 0, len = nums.length;
        for (int i = 0; i < len / 2; i++) {
            int cur = nums[i] + nums[len - i - 1];
            max = Math.max(max, cur);
        }
        return max;
    }

}
