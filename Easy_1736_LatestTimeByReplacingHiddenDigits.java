
/**
 * @author wanghu
 * @discrption： 您将获得一个 hh:mm 形式的字符串时间，其中隐藏了字符串中的某些数字（由 ? 表示）。
 * 有效时间为 00:00 至 23:59 之间的时间。 通过替换隐藏数字返回您可以从时间中获得的最新有效时间。
 * @create 2021-12-10 9:51
 */
public class Easy_1736_LatestTimeByReplacingHiddenDigits {

    //我的方法
    //Runtime: 0 ms, faster than 100.00% of Java online submissions for Latest Time by Replacing Hidden Digits.
    //Memory Usage: 37.2 MB, less than 87.83% of Java online submissions for Latest Time by Replacing Hidden Digits.
    public String maximumTime(String time) {
        char[] times = time.toCharArray();
        if (times[0] == '?') {
            if (times[1] == '?') {
                times[0] = '2';
                times[1] = '3';
            }else if (times[1] >= '4') {
                times[0] = '1';
            }else {
                times[0] = '2';
            }
        }else if (times[0] == '2') {
            if (times[1] == '?') {
                times[1] = '3';
            }
        }else {
            if (times[1] == '?') {
                times[1] = '9';
            }
        }
        if (times[3] == '?') {
            times[3] = '5';
        }
        if (times[4] == '?') {
            times[4] = '9';
        }
//        return Arrays.toString(times).replaceAll("[\\[\\]\\s,]","");
        return String.valueOf(times);   // 比上面这种方法效率高
    }

}
