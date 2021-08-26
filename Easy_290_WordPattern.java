import java.util.HashMap;

/**
 * @author wanghu
 * @discrption： 给定一个模式和一个字符串 s，查找 s 是否遵循相同的模式。
 * Example 1:
 * Input: pattern = "abba", s = "dog cat cat dog"
 * Output: true
 * @create 2021-08-26 10:17
 */
public class Easy_290_WordPattern {

    //我的方法
    //Runtime: 1 ms, faster than 81.03% of Java online submissions for Word Pattern.
    //Memory Usage: 38.7 MB, less than 7.30% of Java online submissions for Word Pattern.
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if(pattern.length()!=words.length)return false;
        HashMap<Character, String> map1 = new HashMap<>();
        HashMap<String, Character> map2 = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            if (!map1.containsKey(pattern.charAt(i)) && !map2.containsKey(words[i])) {
                map1.put(pattern.charAt(i), words[i]);
                map2.put(words[i], pattern.charAt(i));
            } else if (map1.containsKey(pattern.charAt(i)) && !map2.containsKey(words[i])) {
                return false;
            } else if (!map1.containsKey(pattern.charAt(i)) && map2.containsKey(words[i])) {
                return false;
            } else if (!map1.get(pattern.charAt(i)).equals(words[i])) {
                return false;
            }
        }
        return true;
    }

}
