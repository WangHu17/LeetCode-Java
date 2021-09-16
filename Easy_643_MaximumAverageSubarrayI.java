import java.util.HashMap;

/**
 * @author wanghu
 * @discrption：
 * 给定一个由 n 个元素组成的整数数组 nums 和一个整数 k。
 * 找到一个长度等于 k 且具有最大平均值的连续子数组并返回该值。
 * 任何计算错误小于 10-5 的答案都将被接受。
 * @create 2021-09-16 9:31
 */
public class Easy_643_MaximumAverageSubarrayI {

    //我的方法：累计求和
    //Runtime: 3 ms, faster than 83.84% of Java online submissions for Maximum Average Subarray I.
    //Memory Usage: 49.3 MB, less than 97.65% of Java online submissions for Maximum Average Subarray I.
    public double findMaxAverage(int[] nums, int k) {
        int max = Integer.MIN_VALUE;
        double res;
        if (k == 1) {
            for (int num : nums) {
                if (max < num) max = num;
            }
            return (double) max / (double) k;
        }
        int[] temp = new int[nums.length];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            temp[i] = sum;
        }
        max = temp[k - 1];
        for (int j = k; j < nums.length; j++) {
            int cur = temp[j] - temp[j - k];
            max = Math.max(max, cur);
        }
        return (double) max / (double) k;
    }

    //方法二：滑动窗口
    //Runtime: 3 ms, faster than 83.84% of Java online submissions for Maximum Average Subarray I.
    //Memory Usage: 55.3 MB, less than 35.21% of Java online submissions for Maximum Average Subarray I.
    public double findMaxAverage1(int[] nums, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        double max = sum;
        for (int j = k; j < nums.length; j++) {
            sum += nums[j] - nums[j - k];
            max = Math.max(max, sum);
        }
        return max/k;
    }

}
