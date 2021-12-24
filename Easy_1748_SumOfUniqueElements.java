/**
 * @author wanghu
 * @discrption： 给定一个整数数组 nums。数组的唯一元素是在数组中只出现一次的元素。 返回 nums 的所有唯一元素的总和。
 * @create 2021-12-24 11:03
 */
public class Easy_1748_SumOfUniqueElements {

    //Runtime: 0 ms, faster than 100.00% of Java online submissions for Sum of Unique Elements.
    //Memory Usage: 36.4 MB, less than 86.35% of Java online submissions for Sum of Unique Elements.
    public int sumOfUnique(int[] nums) {
        int sum = 0;
        int[] count = new int[101];
        for (int i = 0; i < nums.length; i++) {
            if (count[nums[i]] == 0) {
                count[nums[i]]++;
                sum += nums[i];
            } else if (count[nums[i]] == 1) {
                count[nums[i]]++;
                sum -= nums[i];
            }
        }
        return sum;
    }

}
