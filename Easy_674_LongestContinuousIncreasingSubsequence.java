/**
 * @author wanghu
 * @discrption： 给定一个未排序的整数数组 nums，返回最长连续递增子序列（即子数组）的长度。子序列必须严格递增。
 * @create 2021-09-17 9:35
 */
public class Easy_674_LongestContinuousIncreasingSubsequence {

    //我的方法
    //Runtime: 1 ms, faster than 99.07% of Java online submissions for Longest Continuous Increasing Subsequence.
    //Memory Usage: 39.9 MB, less than 49.33% of Java online submissions for Longest Continuous Increasing Subsequence.
    public int findLengthOfLCIS(int[] nums) {
        int max = 0, cur = 1;
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i + 1] > nums[i]) {
                cur++;
            } else {
                if (max < cur) max = cur;
                cur = 1;
            }
        }
        if (max < cur) max = cur;
        return max;
    }

}
