import java.util.Arrays;
import java.util.HashMap;

/**
 * @author wanghu
 * @discrption： 给定一个整数数组 nums 和一个整数 k。您想找到一个长度为 k 且总和最大的 nums 子序列。
 * 将任何此类子序列作为长度为 k 的整数数组返回。 子序列是一个数组，它可以通过删除一些元素或不删除元素而不改变剩余元素的顺序从另一个数组派生。
 * @create 2021-12-29 14:22
 */
public class Easy_2099_FindSubsequenceOfLengthKWithTheLargestSum {

    //我的方法
    //Runtime: 10 ms, faster than 44.05% of Java online submissions for Find Subsequence of Length K With the Largest Sum.
    //Memory Usage: 41.3 MB, less than 41.28% of Java online submissions for Find Subsequence of Length K With the Largest Sum.
    public int[] maxSubsequence(int[] nums, int k) {
        int[] copy = nums.clone();
        Arrays.sort(copy);
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = nums.length - 1; i > nums.length - 1 - k; i--) {
            map.put(copy[i], map.getOrDefault(copy[i], 0) + 1);
        }
        int[] res = new int[k];
        int i = 0;
        for (int n : nums) {
            if (map.containsKey(n) && map.get(n) > 0) {
                res[i++] = n;
                map.put(n, map.get(n) - 1);
            }
            if (i == k) break;
        }
        return res;
    }

}
