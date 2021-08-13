/**
 * @author wanghu
 * @discrption： 编写一个函数，该函数接受一个无符号整数并返回它具有的“1”位数（也称为汉明权重）
 * @create 2021-08-13 9:57
 */
public class Easy_191_NumberOf1Bits {

    //方法一
    //Runtime: 0 ms, faster than 100.00% of Java online submissions for Number of 1 Bits.
    //Memory Usage: 36.1 MB, less than 22.49% of Java online submissions for Number of 1 Bits.
    public int hammingWeight(int n) {
        int res = 0;
        while (n != 0) {
            if ((n & 1) == 1) res++;// 判断最低位是否是 1，是则计数器 +1
            n = n >>> 1;// 舍弃最低位，继续判断下一位（会有负数情况，因此应该使用无符号右移）
        }
        return res;
    }

    //方法二：将整数n转化为二进制字符串
    //Runtime: 3 ms, faster than 8.28% of Java online submissions for Number of 1 Bits.
    //Memory Usage: 38 MB, less than 6.47% of Java online submissions for Number of 1 Bits.
    public int hammingWeight1(int n) {
        String s = Integer.toBinaryString(n);
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') res++;
        }
        return res;
    }

}
