import java.util.HashMap;

/**
 * @author wanghu
 * @discrption： 给定两个字符串数组 words1 和 words2，返回在两个数组中的每一个中只出现一次的字符串数。
 * @create 2021-12-29 10:43
 */
public class Easy_2085_CountCommonWordsWithOneOccurrence {

    //Runtime: 3 ms, faster than 99.83% of Java online submissions for Count Common Words With One Occurrence.
    //Memory Usage: 39.1 MB, less than 74.59% of Java online submissions for Count Common Words With One Occurrence.
    public int countWords(String[] words1, String[] words2) {
        HashMap<String, Integer> map = new HashMap<>();
        for (String s1 : words1) map.put(s1, map.getOrDefault(s1, 0) + 1);
        for (String s2 : words2) {
            if (map.containsKey(s2) && map.get(s2) <= 1)
                map.put(s2, map.get(s2) - 1);
        }
        int res = 0;
        for (int val : map.values()) {
            if (val == 0) res++;
        }
        return res;
    }

}
