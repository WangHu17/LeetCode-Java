/**
 * @author wanghu
 * @discrption： 给定两个非负整数 num1 和 num2 表示为字符串，将 num1 和 num2 的和作为字符串返回。
 * 您必须在不使用任何用于处理大整数（例如 BigInteger）的内置库的情况下解决问题。您也不得直接将输入转换为整数。
 * @create 2021-10-19 11:10
 */
public class Easy_415_AddStrings {

    //我的方法
    //Runtime: 2 ms, faster than 93.24% of Java online submissions for Add Strings.
    //Memory Usage: 39.9 MB, less than 28.32% of Java online submissions for Add Strings.
    public String addStrings(String num1, String num2) {
        StringBuilder builder = new StringBuilder();
        int len1 = num1.length() - 1, len2 = num2.length() - 1, flag = 0;
        while (len1 >= 0 || len2 >= 0) {
            int sum = (len1 >= 0 ? num1.charAt(len1) - '0' : 0) + (len2 >= 0 ? num2.charAt(len2) - '0' : 0) + flag;
            builder.append(sum % 10);
            flag = sum / 10;
            if (len1 > 0) len1--;
            if (len2 > 0) len2--;
        }
        if (flag > 0) builder.append(1);
        return builder.reverse().toString();
    }

}
