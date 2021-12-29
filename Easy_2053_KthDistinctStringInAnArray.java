import java.util.HashMap;

/**
 * @author wanghu
 * @discrption： 不同的字符串是在数组中只出现一次的字符串。 给定一个字符串数组 arr 和一个整数 k，返回 arr 中存在的第 k 个不同字符串。
 * 如果少于 k 个不同的字符串，则返回一个空字符串 ""。 请注意，字符串是按照它们在数组中出现的顺序来考虑的。
 * @create 2021-12-29 9:53
 */
public class Easy_2053_KthDistinctStringInAnArray {

    //我的方法
    //Runtime: 4 ms, faster than 96.67% of Java online submissions for Kth Distinct String in an Array.
    //Memory Usage: 38.6 MB, less than 78.82% of Java online submissions for Kth Distinct String in an Array.
    public String kthDistinct(String[] arr, int k) {
        HashMap<String, Integer> map = new HashMap<>();
        for (String s : arr) map.put(s, map.getOrDefault(s, 0) + 1);
        int i = 0;
        for (String s : arr) {
            if (map.get(s) == 1) i++;
            if (i == k) return s;
        }
        return "";
    }

}
