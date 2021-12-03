/**
 * @author wanghu
 * @discrption： 字符串的最大公约数.对于两个字符串 s 和 t，当且仅当 s = t + ... + t（t 与自身连接 1 次或多次）时，
 * 我们才说“t 分割 s” 给定两个字符串 str1 和 str2，返回最大的字符串 x，使得 x 可以同时除掉 str1 和 str2。
 * @create 2021-11-09 11:32
 */
public class Easy_1071_GreatestCommonDivisorOfStrings_$ {

    // 方法：递归
    //Runtime: 0 ms, faster than 100.00% of Java online submissions for Greatest Common Divisor of Strings.
    //Memory Usage: 39 MB, less than 68.48% of Java online submissions for Greatest Common Divisor of Strings.
    public String gcdOfStrings(String str1, String str2) {
        if (str1.length() < str2.length()) {
            return gcdOfStrings(str2, str1);
        } else if (!str1.startsWith(str2)) {
            return "";
        } else if (str2.length() == 0) {
            return str1;
        } else {
            return gcdOfStrings(str1.substring(str2.length()), str2);
        }
    }

}
