/**
 * @author wanghu
 * @discrption：
 * @create 2021-09-17 15:35
 */
public class Easy_704_BinarySearch {

    //我的方法
    //Runtime: 0 ms, faster than 100.00% of Java online submissions for Binary Search.
    //Memory Usage: 39.7 MB, less than 82.27% of Java online submissions for Binary Search.
    public int search(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return 0;
    }

}
