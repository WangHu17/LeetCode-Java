/**
 * @author wanghu
 * @discrption： 找出两个字符串中最长的子字符串，该子字符串在另一个字符串中不包含，返回该子字符串的长度，没有返回-1
 * @create 2021-10-21 9:53
 */
public class Easy_521_LongestUncommonSubsequenceI {

    // 这题有何意义
    //Runtime: 0 ms, faster than 100.00% of Java online submissions for Longest Uncommon Subsequence I.
    //Memory Usage: 38.5 MB, less than 34.77% of Java online submissions for Longest Uncommon Subsequence I.
    public int findLUSlength(String a, String b) {
        return a.equals(b)?-1:Math.max(a.length(),b.length());
    }

}
