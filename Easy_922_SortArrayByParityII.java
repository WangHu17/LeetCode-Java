/**
 * @author wanghu
 * @discrption： 给定一个整数数组 nums，nums 中的一半整数是奇数，另一半是偶数。
 * 对数组进行排序，以便每当 nums[i] 为奇数时，i 为奇数，每当 nums[i] 为偶数时，i 为偶数。
 * 返回满足此条件的任何答案数组。
 * @create 2021-09-29 11:14
 */
public class Easy_922_SortArrayByParityII {

    //方法一：使用额外数组
    //Runtime: 2 ms, faster than 99.65% of Java online submissions for Sort Array By Parity II.
    //Memory Usage: 41.7 MB, less than 58.45% of Java online submissions for Sort Array By Parity II.
    public int[] sortArrayByParityII(int[] nums) {
        int[] res = new int[nums.length];
        int odd = 1, even = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                res[even] = nums[i];
                even += 2;
            } else {
                res[odd] = nums[i];
                odd += 2;
            }
        }
        return res;
    }

    //方法二：在原数组中排序，双指针
    //Runtime: 3 ms, faster than 59.58% of Java online submissions for Sort Array By Parity II.
    //Memory Usage: 39.6 MB, less than 99.86% of Java online submissions for Sort Array By Parity II.
    public int[] sortArrayByParityII1(int[] nums) {
        for (int even = 0, odd = 1; even < nums.length && odd < nums.length;) {
            if (nums[even] % 2 == 1 && nums[odd] % 2 == 0) {
                int temp = nums[even];
                nums[even] = nums[odd];
                nums[odd] = temp;
            }
            if (nums[even] % 2 == 0) even += 2;
            if (nums[odd] % 2 == 1) odd += 2;
        }
        return nums;
    }

}
