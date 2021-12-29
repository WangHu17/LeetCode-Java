/**
 * @author wanghu
 * @discrption： 给定一个字符串 s，如果 s 是一个好的字符串，则返回 true，否则返回 false。
 * 如果出现在 s 中的所有字符都具有相同的出现次数（即相同的频率），则字符串 s 是好的。
 * @create 2021-12-29 10:16
 */
public class Easy_1941_CheckIfAllCharactersHaveEqualNumberOfOccurrences {

    //我的方法
    //Runtime: 2 ms, faster than 67.14% of Java online submissions for Check if All Characters Have Equal Number of Occurrences.
    //Memory Usage: 37.1 MB, less than 94.70% of Java online submissions for Check if All Characters Have Equal Number of Occurrences.
    public boolean areOccurrencesEqual(String s) {
        int[] count = new int[26];
        for (Character c : s.toCharArray()) {
            count[c - 'a']++;
        }
        int i = count[s.charAt(0) - 'a'];
        for (int n : count) {
            if (n != 0 && n != i) return false;
        }
        return true;
    }

}
