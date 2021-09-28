
/**
 * @author wanghu
 * @discrption：
 * 给定一个整数数组 nums 和一个整数 k。
 * 在一个操作中，您可以选择任何索引 i，其中 0 <= i < nums.length 并将 nums[i] 更改为 nums[i] + x，
 * 其中 x 是 [-k, k] 范围内的整数。您最多可以对每个索引 i 应用此操作一次。
 * nums 的分数是 nums 中最大和最小元素之间的差值。
 * 对其中的每个索引最多应用一次上述操作后，返回 nums 的最小分数。
 * @create 2021-09-28 11:23
 */
public class Easy_908_SmallestRangeI {

    //我的方法
    //Runtime: 1 ms, faster than 100.00% of Java online submissions for Smallest Range I.
    //Memory Usage: 39.2 MB, less than 68.59% of Java online submissions for Smallest Range I.
    public int smallestRangeI(int[] nums, int k) {
        if (nums.length == 1) return 0;
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        for (int num:nums){
            if (max < num)max = num;
            if (min > num)min = num;
        }
        if (max - k <= min + k) return 0;
        return max - k - (min + k);
    }

}
