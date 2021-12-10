/**
 * @author wanghu
 * @discrption： 您将获得一个整数数组 nums（0 索引）。在一次操作中，您可以选择数组的一个元素并将其加 1。
 * 例如，如果 nums = [1,2,3]，您可以选择增加 nums[1] 使 nums = [1,3,3]。 返回使 nums 严格增加所需的最小操作数。
 * 如果 nums[i] < nums[i+1] for all 0 <= i < nums.length - 1，则数组 nums 严格递增。长度为 1 的数组严格递增。
 * @create 2021-12-10 10:23
 */
public class Easy_1827_MinimumOperationsToMakeTheArrayIncreasing {

    //我的方法
    //Runtime: 2 ms, faster than 90.01% of Java online submissions for Minimum Operations to Make the Array Increasing.
    //Memory Usage: 39.1 MB, less than 95.25% of Java online submissions for Minimum Operations to Make the Array Increasing.
    public int minOperations(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] >= nums[i + 1]) {
                sum += nums[i] + 1 - nums[i + 1];
                nums[i + 1] = nums[i] + 1;
            }
        }
        return sum;
    }

}
