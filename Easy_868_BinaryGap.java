/**
 * @author wanghu
 * @discrption： 给定一个正整数 n，找到并返回 n 的二进制表示中任意两个相邻 1 之间的最长距离。
 * 如果没有两个相邻的 1，则返回 0。 如果只有 0 分隔它们（可能没有 0），则两个 1 是相邻的。
 * 两个 1 之间的距离是它们位位置之间的绝对差。例如，“1001”中的两个 1 的距离为 3。
 * @create 2021-11-08 15:07
 */
public class Easy_868_BinaryGap {

    // 我的方法
    //Runtime: 0 ms, faster than 100.00% of Java online submissions for Binary Gap.
    //Memory Usage: 35.8 MB, less than 78.54% of Java online submissions for Binary Gap.
    public int binaryGap(int n) {
        int max = 0, flag = 0, dis = 0;
        while (n != 0) {
            int t = n % 2;
            n /= 2;
            if (t == 1 && flag == 1) {
                dis++;
                max = Math.max(max, dis);
                dis = 0;
            } else if (t == 1 && flag == 0) {
                flag = 1;
            } else if (t == 0 && flag == 1) {
                dis++;
            }
        }
        return max;
    }

}
