/**
 * @author wanghu
 * @discrption： 给定一个整数数组 nums，移动数组开头的所有偶数，然后移动所有奇数。 返回满足此条件的任何数组。
 * @create 2021-09-28 10:55
 */
public class Easy_905_SortArrayByParity {

    //我的方法
    //Runtime: 1 ms, faster than 99.23% of Java online submissions for Sort Array By Parity.
    //Memory Usage: 39.8 MB, less than 73.87% of Java online submissions for Sort Array By Parity.
    public int[] sortArrayByParity(int[] nums) {
        int odd = 0, even = nums.length - 1;
        while (odd < even) {
            if (nums[odd] % 2 == 1 && nums[even] % 2 == 0) {
                int temp = nums[odd];
                nums[odd] = nums[even];
                nums[even] = temp;
                odd++;
                even--;
            } else if (nums[odd] % 2 == 0) {
                odd++;
            } else if (nums[even] % 2 == 1) {
                even--;
            }
        }
        return nums;
    }

}
