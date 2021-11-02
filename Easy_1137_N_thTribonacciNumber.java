/**
 * @author wanghu
 * @discrption： Tribonacci 数列 Tn 定义如下：
 * T0 = 0，T1 = 1，T2 = 1，且 Tn+3 = Tn + Tn+1 + Tn+2 对于 n >= 0。
 * 给定 n，返回 Tn 的值。
 * @create 2021-11-02 10:54
 */
public class Easy_1137_N_thTribonacciNumber {

    // 我的方法
    // Runtime: 0 ms, faster than 100.00% of Java online submissions for N-th Tribonacci Number.
    // Memory Usage: 35.5 MB, less than 92.90% of Java online submissions for N-th Tribonacci Number.
    public int tribonacci(int n) {
        int a = 0, b = 1, c = 1, s = 0;
        if (n == 0) return 0;
        if (n == 1 || n == 2) return 1;
        int i = 2;
        while (i <= n) {
            s = a + b + c;
            a = b;
            b = c;
            c = s;
            i++;
        }
        return s;
    }

}
