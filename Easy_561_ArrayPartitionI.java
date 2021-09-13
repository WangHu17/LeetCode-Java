import java.util.Arrays;

/**
 * @author wanghu
 * @discrption： 给定一个由 2n 个整数组成的整数数组 nums，将这些整数分组为 n 对 (a1, b1), (a2, b2), ..., (an, bn)
 * 使得所有 i 的 min(ai, bi) 之和被最大化。返回最大化的总和。
 * @create 2021-09-13 13:25
 */
public class Easy_561_ArrayPartitionI {

    //我的方法：先排序，然后将偶数位的数相加
    //Runtime: 10 ms, faster than 94.80% of Java online submissions for Array Partition I.
    //Memory Usage: 40.8 MB, less than 85.73% of Java online submissions for Array Partition I.
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for (int i = 0; i < nums.length; i = i + 2) {
            sum += nums[i];
        }
        return sum;
    }

}
