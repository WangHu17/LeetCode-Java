/**
 * @author wanghu
 * @discrption： 给你一个 有序数组nums，它由n个非负整数组成，同时给你一个整数maximumBit。
 * 你需要执行以下查询 n次：
 * <p>
 * 找到一个非负整数k < 2^maximumBit，使得nums[0] XOR nums[1] XOR ... XOR nums[nums.length-1] XOR k
 * 的结果 最大化。k是第 i个查询的答案。
 * 从当前数组nums删除最后一个元素。
 * 请你返回一个数组answer，其中answer[i]是第i个查询的结果。
 * @create 2022-01-20 13:59
 */
public class Medium_1829_MaximumXORForEachQuery {

    //方法：最大值一样，都是2^maximumBit - 1，可以反推出答案
    //Runtime: 6 ms, faster than 34.60% of Java online submissions for Maximum XOR for Each Query.
    //Memory Usage: 130.7 MB, less than 42.22% of Java online submissions for Maximum XOR for Each Query.
    public int[] getMaximumXor1(int[] nums, int maximumBit) {
        int len = nums.length;
        for (int i = 1; i < len; i++) {
            nums[i] ^= nums[i - 1];
        }
        int max = (int) (Math.pow(2, maximumBit) - 1);
        int[] res = new int[len];
        int k = 0;
        for (int i = len - 1; i >= 0; i--) {
            res[k++] = max ^ nums[i];
        }
        return res;
    }

    //我的方法：超时
    public int[] getMaximumXor(int[] nums, int maximumBit) {
        int len = nums.length;
        int[] res = new int[len];
        int m = len;
        for (int i = 0; i < len; i++) {
            int answer = 0, max = 0;
            for (int j = 0; j < Math.pow(2, maximumBit); j++) {
                int cur = j;
                for (int k = 0; k < m; k++) {
                    cur = cur ^ nums[k];
                }
                if (cur > max) {
                    max = cur;
                    answer = j;
                }
            }
            m--;
            res[i] = answer;
        }
        return res;
    }

}
