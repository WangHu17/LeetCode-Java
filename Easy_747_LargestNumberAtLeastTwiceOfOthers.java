
/**
 * @author wanghu
 * @discrption： 给定一个整数数组 nums，其中最大的整数是唯一的。
 * 确定数组中最大的元素是否至少是数组中所有其他数字的两倍。如果是，则返回最大元素的索引，否则返回 -1。
 * @create 2021-09-23 10:44
 */
public class Easy_747_LargestNumberAtLeastTwiceOfOthers {

    //Runtime: 0 ms, faster than 100.00% of Java online submissions for Largest Number At Least Twice of Others.
    //Memory Usage: 36.5 MB, less than 94.53% of Java online submissions for Largest Number At Least Twice of Others.
    public int dominantIndex(int[] nums) {
        int max1 = 0, max2 = 0, i = 0;
        for (int k = 0; k < nums.length; k++) {
            if (nums[k] > max1) {
                max2 = max1;
                max1 = nums[k];
                i = k;
            } else if (nums[k] > max2)
                max2 = nums[k];
        }
        if (max1 < max2 * 2) return -1;
        return i;
    }

}
