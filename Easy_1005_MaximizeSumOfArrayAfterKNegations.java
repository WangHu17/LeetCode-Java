import org.junit.Test;

import java.util.Arrays;

/**
 * @author wanghu
 * @discrption：
 * 给定一个整数数组 nums 和一个整数 k，按以下方式修改数组：
 *      选择一个索引 i 并用 -nums[i] 替换 nums[i]。
 * 您应该准确地应用此过程 k 次。
 * 您可以多次选择相同的索引 i。
 * 以这种方式修改后返回数组的最大可能总和。
 * @create 2021-10-12 10:33
 */
public class Easy_1005_MaximizeSumOfArrayAfterKNegations {

    //我的方法：先排序，然后先将负数变正，如果k为奇数，再将最小的那个数变负
    //Runtime: 1 ms, faster than 99.83% of Java online submissions for Maximize Sum Of Array After K Negations.
    //Memory Usage: 38.4 MB, less than 66.67% of Java online submissions for Maximize Sum Of Array After K Negations.
    public int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);
        int i = 0;
        while (k > 0 && i < nums.length) {
            if (nums[i] < 0) {
                nums[i] *= -1;
                i++;
                k--;
            } else {
                if (k % 2 == 0) {
                    break;
                } else {
                    if (i > 0 && nums[i] >= nums[i - 1]) {
                        nums[i - 1] *= -1;
                    } else {
                        nums[i] *= -1;
                    }
                    k = 0;
                    break;
                }
            }
        }
        if (k % 2 == 1) {
            nums[i - 1] *= -1;
        }
        int sum = 0;
        for (int n : nums) {
            sum += n;
        }
        return sum;
    }

    @Test
    public void test(){
        int[] ints = {-8,-5,-5,-3,-2,3};
        System.out.println(largestSumAfterKNegations(ints,6));
    }

}
