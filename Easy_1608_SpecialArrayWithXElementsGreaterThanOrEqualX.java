import java.util.Arrays;

/**
 * @author wanghu
 * @discrption： 给定一个非负整数数组 nums 。如果存在一个数字 x 使得 nums 中正好有 x 个数字大于或等于 x，则 nums 被认为是特殊的。
 * 请注意，x 不必是 nums 中的元素。 如果数组是特殊的，则返回 x，否则返回 -1。可以证明，如果 nums 特殊，则 x 的值是唯一的。
 * @create 2021-11-16 14:15
 */
public class Easy_1608_SpecialArrayWithXElementsGreaterThanOrEqualX {

    //方法：二分搜索，在搜索的过程中，遍历数组中有多少数大于等于mid
    //Runtime: 1 ms, faster than 74.10% of Java online submissions for Special Array With X Elements Greater Than or Equal X.
    //Memory Usage: 36.9 MB, less than 51.16% of Java online submissions for Special Array With X Elements Greater Than or
    public int specialArray(int[] nums) {
        Arrays.sort(nums);
        int left = 0, right = nums.length;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int count = count(nums, mid);
            if (count == mid) return mid;
            else if (count < mid) right = mid - 1;
            else left = mid + 1;
        }
        return -1;
    }

    public int count(int[] arr, int n) {
        int sum = 0;
        for (int i : arr) {
            if (i >= n) sum++;
        }
        return sum;
    }

}
