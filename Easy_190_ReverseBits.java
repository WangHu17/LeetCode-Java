/**
 * @author wanghu
 * @discrption： 反转32位二进制数（无符号），输出其整数
 * @create 2021-08-12 10:19
 */
public class Easy_190_ReverseBits {

    //Runtime: 1 ms, faster than 98.14% of Java online submissions for Reverse Bits.
    //Memory Usage: 39 MB, less than 14.58% of Java online submissions for Reverse Bits.
    public int reverseBits(int n) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            result += (n&1) << (31 -i);
            n= n>>1;
        }
        return result;
    }

}
