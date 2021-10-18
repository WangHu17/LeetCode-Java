import java.util.Arrays;

/**
 * @author wanghu
 * @discrption：
 * @create 2021-10-18 14:22
 */
public class Easy_387_FirstUniqueCharacterInAString {

    //我的方法：用数组记录每个字母的个数，再遍历找出第一个个数为1的字母
    //Runtime: 5 ms, faster than 96.27% of Java online submissions for First Unique Character in a String.
    //Memory Usage: 39.7 MB, less than 54.45% of Java online submissions for First Unique Character in a String.
    public int firstUniqChar(String s) {
        int[] mapping = new int[26];
        Arrays.fill(mapping, 0);
        for (char c : s.toCharArray()) {
            mapping[c - 'a'] += 1;
        }
        for (int i = 0; i < s.length(); i++) {
            if (mapping[s.charAt(i) - 'a'] == 1) return i;
        }
        return -1;
    }

}
