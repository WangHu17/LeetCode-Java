import java.util.Arrays;

/**
 * @author wanghu
 * @discrption： 两对 (a, b) 和 (c, d) 之间的乘积差定义为 (a * b) - (c * d)。
 * 例如，(5, 6) 和 (2, 7) 的乘积差为 (5 * 6) - (2 * 7) = 16。
 * 给定一个整数数组 nums，选择四个不同的索引 w、x、y 和 z，使得 (nums[w], nums[x]) 和 (nums[y], nums[z])
 * 对之间的乘积差异最大化. 返回最大此类产品差异。
 * @create 2021-11-25 14:07
 */
public class Easy_1913_MaximumProductDifferenceBetweenTwoPairs {

    //我的方法
    //Runtime: 10 ms, faster than 20.53% of Java online submissions for Maximum Product Difference Between Two Pairs.
    //Memory Usage: 51.8 MB, less than 13.35% of Java online submissions for Maximum Product Difference Between Two Pairs.
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        return nums[len - 1] * nums[len - 2] - nums[0] * nums[1];
    }

}
