import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author wanghu
 * @discrption： 示例：
 * <p>
 * 输入：words = ["abc","deq","mee","aqq","dkd","ccc"], pattern = "abb"
 * 输出：["mee","aqq"]
 * 解释：
 * "mee" 与模式匹配，因为存在排列 {a -> m, b -> e, ...}。
 * "ccc" 与模式不匹配，因为 {a -> c, b -> c, ...} 不是排列。
 * 因为 a 和 b 映射到同一个字母。
 * @create 2022-01-20 15:35
 */
public class Medium_890_FindAndReplacePattern {

    //我的方法：双向映射，两个HashMap
    //Runtime: 1 ms, faster than 95.14% of Java online submissions for Find and Replace Pattern.
    //Memory Usage: 39 MB, less than 69.53% of Java online submissions for Find and Replace Pattern.
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        ArrayList<String> res = new ArrayList<>();
        for (String word : words) {
            if (match(word, pattern)) res.add(word);
        }
        return res;
    }

    private Boolean match(String word, String pattern) {
        HashMap<Character, Character> map1 = new HashMap<>();
        HashMap<Character, Character> map2 = new HashMap<>();
        for (int i = 0; i < word.length(); i++) {
            Character c1 = pattern.charAt(i);
            Character c2 = word.charAt(i);
            if (!map1.containsKey(c1))
                map1.put(c1, c2);
            if (!map2.containsKey(c2))
                map2.put(c2, c1);
            if (map1.get(c1) != c2 || map2.get(c2) != c1)
                return false;
        }
        return true;
    }

}
