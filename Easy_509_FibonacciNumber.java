/**
 * @author wanghu
 * @discrption： 返回斐波拉契数列第n个元素的值
 * @create 2021-11-01 10:32
 */
public class Easy_509_FibonacciNumber {

    // 方法二：用数组
    //Runtime: 0 ms, faster than 100.00% of Java online submissions for Fibonacci Number.
    //Memory Usage: 35.6 MB, less than 78.54% of Java online submissions for Fibonacci Number.
    public int fib1(int n) {
        if (n < 2) return n;
        int[] record = new int[n + 1];
        record[0] = 0;
        record[1] = 1;
        for (int i = 2; i <= n; i++) {
            record[i] = record[i - 1] + record[i - 2];
        }
        return record[n];
    }

    // 我的方法：递归
    //Runtime: 6 ms, faster than 31.17% of Java online submissions for Fibonacci Number.
    //Memory Usage: 35.6 MB, less than 87.33% of Java online submissions for Fibonacci Number.
    public int fib(int n) {
        if (n < 2) return n;
        return fib(n - 1) + fib(n - 2);
    }

}
