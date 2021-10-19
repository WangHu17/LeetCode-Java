/**
 * @author wanghu
 * @discrption： 给定两个字符串 s 和 t，如果 s 是 t 的子序列，则返回 true，否则返回 false。
 * 字符串的子序列是通过删除一些（可以没有）字符而不干扰剩余字符的相对位置而从原始字符串形成的新字符串。
 * （即，“ace”是“abcde”的子序列，而“aec”不是）。
 * @create 2021-10-19 10:09
 */
public class Easy_392_IsSubsequence {

    //我的方法：依次对比
    //Runtime: 1 ms, faster than 84.31% of Java online submissions for Is Subsequence.
    //Memory Usage: 38.8 MB, less than 31.09% of Java online submissions for Is Subsequence.
    public boolean isSubsequence(String s, String t) {
        if (s.length() > t.length()) return false;
        int i = 0, j = 0;
        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();
        while (i < s.length() && j < t.length()) {
            if (s1[i] == t1[j]) {
                i++;
                j++;
            } else {
                j++;
            }
        }
        return i == s.length();
    }

}
