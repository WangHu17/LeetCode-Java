import org.junit.Test;

import java.util.Arrays;

/**
 * @author wanghu
 * @discrption： 给定一个整数数组 nums，返回该数组中第三个不同的最大数。如果第三个最大值不存在，则返回最大值。
 * @create 2021-09-08 9:40
 */
public class EAsy_414_ThirdMaximumNumber {

    //Runtime: 1 ms, faster than 90.59% of Java online submissions for Third Maximum Number.
    //Memory Usage: 38.5 MB, less than 93.09% of Java online submissions for Third Maximum Number.
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int max = nums[nums.length - 1];
        int j = 1;
        for (int i = nums.length - 1; i > 0; i--) {
            if(nums[i]!=nums[i-1])
                j++;
            if (j == 3) {
                return nums[i-1];
            }
        }
        return max;
    }

    @Test
    public void test() {
        int[] ints = {1, 2, 2, 4, 3, 3};
        System.out.println(thirdMax(ints));
    }

}
