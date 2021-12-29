/**
 * @author wanghu
 * @discrption： 如果 word1 和 word2 之间从“a”到“z”的每个字母的频率差异最多为 3，则认为两个字符串 word1 和 word2 几乎等效。
 * 给定两个长度为 n 的字符串 word1 和 word2，如果 word1 和 word2 几乎相等，则返回 true，否则返回 false。
 * 字母 x 的频率是它在字符串中出现的次数。
 * @create 2021-12-29 10:35
 */
public class Easy_2068_CheckWhetherTwoStringsAreAlmostEquivalent {

    //改进
    //Runtime: 0 ms, faster than 100.00% of Java online submissions for Check Whether Two Strings are Almost Equivalent.
    //Memory Usage: 37.4 MB, less than 69.70% of Java online submissions for Check Whether Two Strings are Almost Equivalent.
    public boolean checkAlmostEquivalent1(String word1, String word2) {
        int[] count = new int[26];
        for (int i = 0; i < word1.length(); i++) {
            count[word1.charAt(i) - 'a']++;
            count[word2.charAt(i) - 'a']--;
        }
        for (int n : count) {
            if (n > 3 || n < -3) return false;
        }
        return true;
    }

    //我的方法
    //Runtime: 1 ms, faster than 64.96% of Java online submissions for Check Whether Two Strings are Almost Equivalent.
    //Memory Usage: 37.3 MB, less than 79.67% of Java online submissions for Check Whether Two Strings are Almost Equivalent.
    public boolean checkAlmostEquivalent(String word1, String word2) {
        int[] count1 = new int[26];
        int[] count2 = new int[26];
        for (Character c1 : word1.toCharArray()) count1[c1 - 'a']++;
        for (Character c2 : word2.toCharArray()) count2[c2 - 'a']++;
        for (int i = 0; i < 26; i++) {
            int dif = Math.abs(count1[i] - count2[i]);
            if (dif > 3) return false;
        }
        return true;
    }

}
