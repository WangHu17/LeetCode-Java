/**
 * @author wanghu
 * @discrption： 给定一个整数数组 nums，找出其总和最大的连续子数组（至少包含一个数字）并返回其总和。
 * @create 2021-09-03 9:41
 */
public class Easy_53_MaximumSubarray_$$$ {

    //Runtime: 0 ms, faster than 100.00% of Java online submissions for Maximum Subarray.
    //Memory Usage: 38.5 MB, less than 96.02% of Java online submissions for Maximum Subarray.
    public int maxSubArray(int[] nums) {
        int sum = nums[0];
        int max = nums[0];
        int flag = 0;
        for (int num:nums) {
            if (flag == 0) {
                flag ++;
                continue;
            }
            sum += num;
            if(num > sum) {
                sum = num;
                if(max < num)
                    max = num;
            }else {
                if (max < sum)
                    max = sum;
            }
        }
        return max;
    }

}
