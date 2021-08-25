import java.util.Arrays;

/**
 * @author wanghu
 * @discrption： 给定一个包含 [0, n] 范围内 n 个不同数字的数组 nums，返回该范围内唯一从数组中丢失的数字。
 * @create 2021-08-25 10:23
 */
public class Easy_268_MissingNumber {

    //我的方法：先排序再判断对应位置的数是否对应
    //Runtime: 4 ms, faster than 26.89% of Java online submissions for Missing Number.
    //Memory Usage: 39.1 MB, less than 79.65% of Java online submissions for Missing Number.
    public int missingNumber(int[] nums) {
        int len = nums.length;
        Arrays.sort(nums);
        int i = 0;
        for (i = 0; i < len; i++) {
            if (nums[i] != i) return i;
        }
        return i;
    }

    //其他方法：计算数组所有元素的和，然后计算与n*(n_1)/2的差
    //Runtime: 0 ms, faster than 100.00% of Java online submissions for Missing Number.
    //Memory Usage: 39.1 MB, less than 87.93% of Java online submissions for Missing Number.
    public int missingNumber1(int[] nums) {
        int sum = 0;
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            sum += nums[i];
        }
        return len * (len + 1) / 2 - sum;
    }

}
