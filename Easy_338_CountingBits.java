/**
 * @author wanghu
 * @discrption： 给定一个整数 n，返回一个长度为 n + 1 的数组 ans，使得对于每个 i (0 <= i <= n)，ans[i] 是 i 的二进制表示中 1 的数量。
 * @create 2021-08-27 11:15
 */
public class Easy_338_CountingBits {

//    0 0
//    1 1
//    2 1
//    3 2
//    4 1
//    5 2
//    6 2
//    7 3
//    8 1
//    9 2
//    10 2
//    11 3
//    12 2
//    13 3
//    14 3
//    15 4

    //方法：偶数的二进制1的数量=该数除以2的那个数的二进制1的数量，奇数的二进制1的数量=该数除以2的那个数的二进制1的数量+1
    //Runtime: 3 ms, faster than 31.34% of Java online submissions for Counting Bits.
    //Memory Usage: 45.3 MB, less than 5.77% of Java online submissions for Counting Bits.
    public int[] countBits(int n) {
        int[] array = new int[n + 1];
        array[0] = 0;
        for (int i = 1; i < n + 1; i++) {
            array[i] = array[i/2] + i%2;
        }
        return array;
    }
}
