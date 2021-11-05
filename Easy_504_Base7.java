/**
 * @author wanghu
 * @discrption： 给定一个整数 num，返回一个以 7 为基数表示的字符串。(将十进制转化为七进制)
 * @create 2021-11-05 10:37
 */
public class Easy_504_Base7 {

    // 改进方法：先得出整数结果，再转化为字符串
    //Runtime: 0 ms, faster than 100.00% of Java online submissions for Base 7.
    //Memory Usage: 36.5 MB, less than 59.85% of Java online submissions for Base 7.
    public String convertToBase7_1(int num) {
        int res = 0, k = 1;
        while (num != 0) {
            int t = num % 7;
            num /= 7;
            res += t * k;
            k *= 10;
        }
        return Integer.toString(res);
    }

    // 我的方法
    //Runtime: 8 ms, faster than 15.31% of Java online submissions for Base 7.
    //Memory Usage: 37.4 MB, less than 42.83% of Java online submissions for Base 7.
    public String convertToBase7(int num) {
        if (num == 0) return "0";
        int flag = 0;
        if (num < 0) {
            flag = 1;
            num *= -1;
        }
        String res = "";
        while (num != 0) {
            res = num % 7 + res;
            num /= 7;
        }
        if (flag == 1) return "-" + res;
        return res;
    }

}
