import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author wanghu
 * @discrption： 给定数组 nums，获取数组的子序列，该子序列的元素总和严格大于此类子序列中未包含元素的总和。
 * 如果有多个解，则返回最小尺寸的子序列，如果还有多个解，则返回其所有元素总和最大的子序列。
 * 可以通过从数组中擦除一些（可能为零）元素来获得数组的子序列。 请注意，具有给定约束的解决方案保证是唯一的。还返回按非递增顺序排序的答案。
 * @create 2021-12-10 14:44
 */
public class Easy_1403_MinimumSubsequenceInNonIncreasingOrder {

    //我的方法
    //Runtime: 3 ms, faster than 92.18% of Java online submissions for Minimum Subsequence in Non-Increasing Order.
    //Memory Usage: 39.2 MB, less than 59.61% of Java online submissions for Minimum Subsequence in Non-Increasing Order.
    public List<Integer> minSubsequence(int[] nums) {
        Arrays.sort(nums);
        int sum = 0, curSum = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for (int n : nums) sum += n;
        for (int i = nums.length - 1; i >= 0; i--) {
            list.add(nums[i]);
            curSum += nums[i];
            if (curSum > sum / 2) break;
        }
        return list;
    }

}
