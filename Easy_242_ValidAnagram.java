import java.util.HashMap;
import java.util.Map;

/**
 * @author wanghu
 * @discrption： 给定两个字符串 s 和 t，如果 t 是 s 的变位，则返回 true，否则返回 false。
 * @create 2021-08-23 9:21
 */
public class Easy_242_ValidAnagram {

    //我的方法：用两个map保存两个字符串字符的个数，然后一一比较是否一样(性能太低了)
    //Runtime: 26 ms, faster than 5.38% of Java online submissions for Valid Anagram.
    //Memory Usage: 39.7 MB, less than 25.06% of Java online submissions for Valid Anagram.
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Integer> map = new HashMap<>();
        Map<Character, Integer> map1 = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (!map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), 1);
            } else {
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            }
            if (!map1.containsKey(t.charAt(i))) {
                map1.put(t.charAt(i), 1);
            } else {
                map1.put(t.charAt(i), map1.get(t.charAt(i)) + 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            Character key = entry.getKey();
            Integer value = entry.getValue();
            if (map1.containsKey(key)) {
                if (!map1.get(key).equals(value)) return false;
            } else {
                return false;
            }
        }
        return true;
    }

    //方法二：用一个数组先保存s字符串的字符数，然后遍历t字符串一一减去数组中的字符数，最后遍历数组看是否有不是0的
    //Runtime: 2 ms, faster than 94.72% of Java online submissions for Valid Anagram.
    //Memory Usage: 39.3 MB, less than 60.76% of Java online submissions for Valid Anagram.
    public boolean isAnagram1(String s, String t) {
        int len = s.length();
        if (len != t.length()) {
            return false;
        }
        int[] a = new int[26];
        for (int i = 0; i < 26; i++) {
            a[i] = 0;
        }
        for (int i = 0; i < len; i++) {
            a[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < len; i++) {
            a[t.charAt(i) - 'a']--;
        }
        for (int i = 0; i < 26; i++) {
            if (a[i] != 0) return false;
        }
        return true;
    }

}
