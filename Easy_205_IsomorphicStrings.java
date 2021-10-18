import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * @author wanghu
 * @discrption： 给定两个字符串 s 和 t，确定它们是否同构。
 * 如果可以替换 s 中的字符得到 t，则两个字符串 s 和 t 是同构的。
 * 所有出现的字符都必须替换为另一个字符，同时保留字符的顺序。没有两个字符可以映射到同一个字符，但一个字符可以映射到它自己。
 * @create 2021-08-17 9:47
 */
public class Easy_205_IsomorphicStrings {

    //官方方法：使用数组
    //Runtime: 3 ms, faster than 98.60% of Java online submissions for Isomorphic Strings.
    //Memory Usage: 39.3 MB, less than 51.99% of Java online submissions for Isomorphic Strings.
    public boolean isIsomorphic1(String s, String t) {
        int[] map1 = new int[256];
        Arrays.fill(map1, -1);

        int[] map2 = new int[256];
        Arrays.fill(map2, -1);

        for (int i = 0; i < s.length(); ++i) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            if (map1[c1] == -1 && map2[c2] == -1) {
                map1[c1] = c2;
                map2[c2] = c1;
            } else if (!(map1[c1] == c2 && map2[c2] == c1)) {
                return false;
            }
        }
        return true;
    }

    //我的方法：使用map
    //Runtime: 11 ms, faster than 47.81% of Java online submissions for Isomorphic Strings.
    //Memory Usage: 39.2 MB, less than 58.28% of Java online submissions for Isomorphic Strings.
    public boolean isIsomorphic (String s, String t){
        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();
        HashMap<Character, Character> map = new HashMap<>();
        HashMap<Character, Character> map1 = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (!map.containsKey(s1[i]) && !map1.containsKey(t1[i])) {
                map.put(s1[i], t1[i]);
                map1.put(t1[i], s1[i]);
            } else if (map.containsKey(s1[i]) && !map1.containsKey(t1[i])) {
                return false;
            } else if (!map.containsKey(s1[i]) && map1.containsKey(t1[i])) {
                return false;
            } else if (!map.get(s1[i]).equals(t1[i])) {
                return false;
            }
        }
        return true;
    }

}
