import java.util.HashMap;

/**
 * @author wanghu
 * @discrption： 我们将和谐数组定义为最大值与最小值之差恰好为 1 的数组。
 * 给定一个整数数组 nums，返回其所有可能子序列中最长和谐子序列的长度。
 * 数组的子序列是可以通过删除一些元素或不删除元素而不改变剩余元素的顺序从数组中导出的序列。
 * @create 2021-09-14 10:19
 */
public class Easy_594_LongestHarmoniousSubsequence {

    //方法：用map存下各个值及其数量，然后把相差1的数的个数相加求出最大值
    //Runtime: 15 ms, faster than 90.60% of Java online submissions for Longest Harmonious Subsequence.
    //Memory Usage: 39.8 MB, less than 85.85% of Java online submissions for Longest Harmonious Subsequence.
    public int findLHS(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int res = 0;
        for (int key : map.keySet()) {
            if (map.containsKey(key + 1)) {
                res = Math.max(res, map.get(key) + map.get(key + 1));
            }
        }
        return res;
    }

}
