/**
 * @author wanghu
 * @discrption： 给你一个字符串 num，代表一个大整数。返回最大值的奇整数（作为字符串），它是 num 的非空子字符串，
 * 如果不存在奇整数，则返回空字符串 ""。 子字符串是字符串中连续的字符序列。
 * @create 2021-12-10 10:57
 */
public class Easy_1903_LargestOddNumberInString {

    //我的方法
    //Runtime: 1 ms, faster than 100.00% of Java online submissions for Largest Odd Number in String.
    //Memory Usage: 39.4 MB, less than 95.85% of Java online submissions for Largest Odd Number in String.
    public String largestOddNumber(String num) {
        int index = -1;
        for (int i = num.length() - 1; i >= 0; i--) {
            char c = num.charAt(i);
            int n = c - '0';
            if (n % 2 == 1) {
                index = i;
                break;
            }
        }
        return num.substring(0, index + 1);
    }

}
