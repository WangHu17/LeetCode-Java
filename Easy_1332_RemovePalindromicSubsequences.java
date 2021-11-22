/**
 * @author wanghu
 * @discrption： 给定一个字符串 s，它只包含字母 'a' 和 'b'。只需一步，您就可以从 s 中删除一个回文子序列。
 * 返回使给定字符串为空的最小步骤数。 如果字符串是通过删除给定字符串的某些字符而不改变其顺序而生成的，
 * 则该字符串是给定字符串的子序列。请注意，子序列不一定需要是连续的。
 * @create 2021-11-22 10:23
 */
public class Easy_1332_RemovePalindromicSubsequences {

    //Runtime: 0 ms, faster than 100.00% of Java online submissions for Remove Palindromic Subsequences.
    //Memory Usage: 36.7 MB, less than 91.50% of Java online submissions for Remove Palindromic Subsequences.
    public int removePalindromeSub(String s) {
        int j = s.length() - 1;
        for (int i = 0; i < s.length() / 2; i++, j--) {
            if (s.charAt(i)==s.charAt(j))continue;
            return 2;
        }
        return 1;
    }

}
