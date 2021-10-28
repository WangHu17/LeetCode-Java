import java.util.Arrays;

/**
 * @author wanghu
 * @discrption： 给定一个整数数组 nums，找出乘积最大的三个数字并返回最大的乘积。
 * @create 2021-09-15 11:22
 */
public class Easy_628_MaximumProductOfThreeNumbers {

    //我的方法
    //Runtime: 17 ms, faster than 11.81% of Java online submissions for Maximum Product of Three Numbers.
    //Memory Usage: 51.4 MB, less than 30.07% of Java online submissions for Maximum Product of Three Numbers.
    public int maximumProduct(int[] nums) {
        if (nums.length==3){
            return nums[0]*nums[1]*nums[2];
        }
        Arrays.sort(nums);
        int len = nums.length;
        int res1 = nums[len - 3] * nums[len - 2] * nums[len - 1];
        int res2 = nums[0] * nums[1] * nums[len - 1];
        return Math.max(res1, res2);
    }

    //better方法：一轮循环，找出最小的两个数和最大的三个数
    //Runtime: 2 ms, faster than 99.46% of Java online submissions for Maximum Product of Three Numbers.
    //Memory Usage: 40.2 MB, less than 82.25% of Java online submissions for Maximum Product of Three Numbers.
    public int maximumProduct1(int[] nums) {
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE, max3 = Integer.MIN_VALUE;
        for (int n: nums) {
            if (n <= min1) {
                min2 = min1;
                min1 = n;
            } else if (n <= min2) {
                min2 = n;
            }
            if (n >= max1) {
                max3 = max2;
                max2 = max1;
                max1 = n;
            } else if (n >= max2) {
                max3 = max2;
                max2 = n;
            } else if (n >= max3) {
                max3 = n;
            }
        }
        return Math.max(min1 * min2 * max1, max1 * max2 * max3);
    }

}
