import java.util.Arrays;

/**
 * @author wanghu
 * @discrption： 给定一个索引为 0 的整数数组 nums，其中 nums[i] 表示第 i 个学生的分数。还给你一个整数 k。
 * 从数组中挑选任何 k 个学生的分数，使 k 个分数中最高和最低之间的差异最小化。 返回最小可能的差异。
 * @create 2021-11-25 14:17
 */
public class Easy_1984_MinimumDifferenceBetweenHighestAndLowestOfKScores {

    //我的方法
    //Runtime: 3 ms, faster than 100.00% of Java online submissions for Minimum Difference Between Highest and Lowest of K Scores.
    //Memory Usage: 39.3 MB, less than 39.13% of Java online submissions for Minimum Difference Between Highest and Lowest of K Scores.
    public int minimumDifference(int[] nums, int k) {
        if (k == 1) return 0;
        Arrays.sort(nums);
        int min = Integer.MAX_VALUE;
        for (int i = k - 1; i < nums.length; i++) {
            min = Math.min(min, nums[i] - nums[i - k + 1]);//注意k个数之间的距离是k-1
        }
        return min;
    }

}
