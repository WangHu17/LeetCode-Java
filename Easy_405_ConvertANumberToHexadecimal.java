/**
 * @author wanghu
 * @discrption： 将数组转为 16进制的字符串
 * @create 2021-12-17 9:29
 */
public class Easy_405_ConvertANumberToHexadecimal {

    //Runtime: 1 ms, faster than 43.44% of Java online submissions for Convert a Number to Hexadecimal.
    //Memory Usage: 38.2 MB, less than 14.89% of Java online submissions for Convert a Number to Hexadecimal.
    public String toHex(int num) {
        if (num == 0) return "0";
        StringBuilder builder = new StringBuilder();
        while (num != 0) {
            int n = num & 0xF;
            if (n < 10) builder.append(n);
            else builder.append((char)('a' + n - 10));
            num = num >>> 4;
        }
        return builder.reverse().toString();
    }

}
