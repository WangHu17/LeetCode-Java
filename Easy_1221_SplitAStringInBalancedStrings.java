/**
 * @author wanghu
 * @discrption： 平衡字符串是那些具有相等数量的“L”和“R”字符的字符串。 给定一个平衡字符串 s，将其拆分为最大数量的平衡字符串。
 * 返回拆分平衡字符串的最大数量。
 * @create 2021-12-09 10:38
 */
public class Easy_1221_SplitAStringInBalancedStrings {

    //我的方法
    //Runtime: 0 ms, faster than 100.00% of Java online submissions for Split a String in Balanced Strings.
    //Memory Usage: 37 MB, less than 63.02% of Java online submissions for Split a String in Balanced Strings.
    public int balancedStringSplit(String s) {
        int lNum = 0, rNum = 0, sum = 0;
        for (char c : s.toCharArray()) {
            if (c == 'L') lNum++;
            if (c == 'R') rNum++;
            if (lNum == rNum) {
                sum++;
                lNum = 0;
                rNum = 0;
            }
        }
        return sum;
    }

}
