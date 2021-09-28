/**
 * @author wanghu
 * @discrption： 如果数组是单调递增或单调递减的，则它是单调的。
 * 如果对于所有 i <= j，nums[i] <= nums[j]，数组 nums 是单调递增的。
 * 如果对于所有 i <= j，nums[i] >= nums[j]，数组 nums 是单调递减的。
 * 给定一个整数数组 nums，如果给定的数组是单调的，则返回 true，否则返回 false。
 * @create 2021-09-28 10:17
 */
public class Easy_896_MonotonicArray {

    //我的方法
    //Runtime: 3 ms, faster than 55.31% of Java online submissions for Monotonic Array.
    //Memory Usage: 48.3 MB, less than 79.21% of Java online submissions for Monotonic Array.
    public boolean isMonotonic(int[] nums) {
        int len1 = 0, len2 = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] <= nums[i + 1]) len1++;
            if (nums[i] >= nums[i + 1]) len2++;
        }
        return len1 == nums.length || len2 == nums.length;
    }

    //方法二
    //Runtime: 3 ms, faster than 55.31% of Java online submissions for Monotonic Array.
    //Memory Usage: 48.5 MB, less than 53.16% of Java online submissions for Monotonic Array.
    public boolean isMonotonic1(int[] A) {
        boolean increasing = true;
        boolean decreasing = true;
        for (int i = 0; i < A.length - 1; ++i) {
            if (A[i] > A[i+1])
                increasing = false;
            if (A[i] < A[i+1])
                decreasing = false;
        }

        return increasing || decreasing;
    }

}
