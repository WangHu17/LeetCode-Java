/**
 * @author wanghu
 * @discrption： 给一个数组，找出其中一个元素，它左边的元素之和等于它右边的元素之和
 * @create 2021-09-22 9:29
 */
public class Easy_724_FindPivotIndex {

    //我的方法：用两个数组分别记录每个数左边的元素之和和右边的元素之和，然后比较两个数组
    //Runtime: 1 ms, faster than 100.00% of Java online submissions for Find Pivot Index.
    //Memory Usage: 39.7 MB, less than 62.52% of Java online submissions for Find Pivot Index.
    public int pivotIndex(int[] nums) {
        int len = nums.length;
        int[] left = new int[len];
        int[] right = new int[len];
        int sum = 0;
        for (int i = 0; i < len; i++) {
            left[i] = sum;
            sum += nums[i];
        }
        sum = 0;
        for (int i = len - 1; i >= 0; i--) {
            right[i] = sum;
            sum += nums[i];
        }
        for (int i = 0; i < len; i++) {
            if (left[i] == right[i]) return i;
        }
        return -1;
    }

}
