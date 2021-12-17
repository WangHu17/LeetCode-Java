/**
 * @author wanghu
 * @discrption： 给定一个正整数，检查它是否有交替位：即，两个相邻位是否总是具有不同的值。
 * @create 2021-12-17 14:34
 */
public class Easy_693_BinaryNumberWithAlternatingBits {

    //我的方法
    //Runtime: 0 ms, faster than 100.00% of Java online submissions for Binary Number with Alternating Bits.
    //Memory Usage: 36 MB, less than 41.98% of Java online submissions for Binary Number with Alternating Bits.
    public boolean hasAlternatingBits(int n) {
        int flag = n & 1;
        while (n != 0) {
            int cur = n & 1;
            n = n >> 1;
            if (cur != flag) return false;
            flag = flag == 1 ? 0 : 1;
        }
        return true;
    }

}
