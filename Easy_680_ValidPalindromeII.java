import org.junit.Test;

/**
 * @author wanghu
 * @discrption： 给定一个字符串 s，如果该 s 最多删除一个字符后可以是回文，则返回 true。
 * @create 2021-10-25 9:27
 */
public class Easy_680_ValidPalindromeII {

    // 方法：从两端检查字符是否相同，当不同时，判断去掉左边的字符或去掉右边的字符能否形成回文
    //Runtime: 5 ms, faster than 91.86% of Java online submissions for Valid Palindrome II.
    //Memory Usage: 39.3 MB, less than 87.15% of Java online submissions for Valid Palindrome II.
    public boolean validPalindrome(String s) {
        char[] s1 = s.toCharArray();
        int i = 0, j = s1.length - 1, flag = 1;
        while (i < j) {
            if (s1[i] == s1[j]) {
                i++;
                j--;
            } else {
                return isPalindrome(s1, i + 1, j) || isPalindrome(s1, i, j - 1);
            }
        }
        return true;
    }

    public boolean isPalindrome(char[] s, int i, int j) {
        while (i < j) {
            if (s[i] == s[j]) {
                i++;
                j--;
            } else return false;
        }
        return true;
    }

    @Test
    public void test() {
        String s = "ebcbbececabbacecbbcbe";
        System.out.println(validPalindrome(s));
    }

}
