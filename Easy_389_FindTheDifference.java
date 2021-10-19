/**
 * @author wanghu
 * @discrption： 给定两个字符串 s 和 t。
 * 字符串 t 由随机打乱字符串 s 生成，然后在随机位置再添加一个字母。
 * 返回添加到 t 的字母。
 * @create 2021-10-19 9:23
 */
public class Easy_389_FindTheDifference {

    //我的方法：用数组记录字母个数
    //Runtime: 1 ms, faster than 99.36% of Java online submissions for Find the Difference.
    //Memory Usage: 37.4 MB, less than 72.35% of Java online submissions for Find the Difference.
    public char findTheDifference(String s, String t) {
        int[] mapping = new int[26];
        for (char c : t.toCharArray()) {
            mapping[c - 'a']++;
        }
        for (char c : s.toCharArray()) {
            mapping[c - 'a']--;
        }
        for (int i = 0; i < 26; i++) {
            if (mapping[i] != 0) return (char) (i + 97);
        }
        return 0;
    }

}
