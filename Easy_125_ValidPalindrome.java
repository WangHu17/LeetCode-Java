
/**
 * @author wanghu
 * @discrption： 给定一个字符串 s，确定它是否是回文，只考虑字母数字字符并忽略大小写。
 * @create 2021-10-18 9:15
 */
public class Easy_125_ValidPalindrome {

    //我的方法
    //Runtime: 3 ms, faster than 77.86% of Java online submissions for Valid Palindrome.
    //Memory Usage: 39 MB, less than 77.75% of Java online submissions for Valid Palindrome.
    public boolean isPalindrome(String s) {
        String s1 = s.toLowerCase();
        char[] chars = s1.toCharArray();
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (!Character.isLetterOrDigit(chars[i]) && !Character.isLetterOrDigit(chars[j])) {
                i++;
                j--;
            } else if (!Character.isLetterOrDigit(chars[i])) {
                i++;
            } else if (!Character.isLetterOrDigit(chars[j])) {
                j--;
            } else {
                if (chars[i] != chars[j]) return false;
                i++;
                j--;
            }
        }
        return true;
    }

}
