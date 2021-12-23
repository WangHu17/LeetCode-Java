/**
 * @author wanghu
 * @discrption： 给定一个整数数组 nums，返回好的对的数量。 如果 nums[i] == nums[j] 且 i < j，则一对 (i, j) 被称为良好。
 * @create 2021-12-23 11:01
 */
public class Easy_1512_NumberOfGoodPairs {

    //我的方法
    //Runtime: 0 ms, faster than 100.00% of Java online submissions for Number of Good Pairs.
    //Memory Usage: 36 MB, less than 96.74% of Java online submissions for Number of Good Pairs.
    public int numIdenticalPairs(int[] nums) {
        int[] count = new int[101];
        for (int n : nums) count[n]++;
        int res = 0;
        for (int n : count) {
            if (n != 0) res += n*(n - 1) / 2;
        }
        return res;
    }

}
