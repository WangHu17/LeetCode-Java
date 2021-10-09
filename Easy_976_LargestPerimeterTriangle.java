import java.util.Arrays;

/**
 * @author wanghu
 * @discrption：
 * 给定一个整数数组 nums，返回具有非零面积的三角形的最大周长，由这些长度中的三个组成。如果不可能形成任何非零区域的三角形，则返回 0。
 * @create 2021-10-09 9:35
 */
public class Easy_976_LargestPerimeterTriangle {

    //我的方法：先排序，再依次判断连续的3个数中两个小的数之和是否大于最大的那个数，如果是就返回这3个数的和。
    //Runtime: 6 ms, faster than 100.00% of Java online submissions for Largest Perimeter Triangle.
    //Memory Usage: 39.6 MB, less than 58.93% of Java online submissions for Largest Perimeter Triangle.
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        for (int i = nums.length - 1; i >= 2; i--) {
            if (nums[i - 2] + nums[i - 1] > nums[i]) {
                return nums[i - 2] + nums[i - 1] + nums[i];
            }
        }
        return -1;
    }

}
