import java.util.Arrays;

/**
 * @author wanghu
 * @discrption： 给定整数数组 nums，您将选择该数组的两个不同索引 i 和 j。返回 (nums[i]-1)*(nums[j]-1) 的最大值。
 * @create 2021-11-24 14:07
 */
public class Easy_1464_MaximumProductOfTwoElementsInAnArray {

    //我的方法
    //Runtime: 1 ms, faster than 73.87% of Java online submissions for Maximum Product of Two Elements in an Array.
    //Memory Usage: 38.9 MB, less than 42.80% of Java online submissions for Maximum Product of Two Elements in an Array.
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        return (nums[nums.length - 1] - 1) * (nums[nums.length - 2] - 1);
    }

}
