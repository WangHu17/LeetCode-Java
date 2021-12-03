import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author wanghu
 * @discrption： 给定一个不同整数 arr 的数组，找到任意两个元素的绝对差最小的所有元素对。
 * 按升序返回对列表（相对于对），每对 [a, b] 跟随
 * a, b 来自 arr
 * a < b
 * b - a 等于 arr 中任意两个元素的最小绝对差
 * @create 2021-11-23 15:11
 */
public class Easy_1200_MinimumAbsoluteDifference {

    // 我的方法：先求出最小差，再遍历找符合的组合放入集合
    //Runtime: 14 ms, faster than 97.00% of Java online submissions for Minimum Absolute Difference.
    //Memory Usage: 50.6 MB, less than 41.23% of Java online submissions for Minimum Absolute Difference.
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        for (int i = 1; i < arr.length; i++) {
            min = Math.min(min, arr[i] - arr[i - 1]);
        }
        ArrayList<List<Integer>> res = new ArrayList<>();
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - arr[i - 1] == min) {
                ArrayList<Integer> list = new ArrayList<>();
                list.add(arr[i - 1]);
                list.add(arr[i]);
                res.add(list);
            }
        }
        return res;
    }

}
