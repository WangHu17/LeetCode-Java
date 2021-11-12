/**
 * @author wanghu
 * @discrption： 你有 n 个硬币，你想用这些硬币建造一个楼梯。
 * 楼梯由 k 行组成，其中第 i 行正好有 i 个硬币。楼梯的最后一排可能不完整。
 * 给定整数 n，返回您将构建的楼梯的完整行数。
 * @create 2021-11-04 11:16
 */
public class Easy_441_ArrangingCoins {

    // 二分法：利用数学公式，台阶的和为等差数列求和，即 k 层台阶为 k(k+1)/2，所以该问题就是求最大的k使得 k(k+1)/2 <= n
    //Runtime: 1 ms, faster than 100.00% of Java online submissions for Arranging Coins.
    //Memory Usage: 36.1 MB, less than 81.65% of Java online submissions for Arranging Coins.
    public int arrangeCoins1(int n) {
        long left = 0, right = n;
        long cur = 0, mid = 0;
        while (left <= right) {
            mid = left + (right - left) / 2;
            cur = mid * (mid + 1) / 2;
            if (cur == n) return (int)mid;
            if (cur < n) left = mid + 1;
            else right = mid - 1;
        }
        return (int)right;
    }

    //我的方法
    //Runtime: 6 ms, faster than 41.34% of Java online submissions for Arranging Coins.
    //Memory Usage: 36.1 MB, less than 71.33% of Java online submissions for Arranging Coins.
    public int arrangeCoins(int n) {
        int res = 0, i = 1;
        while (n > 0) {
            n -= i;
            i++;
            res++;
        }
        if (n < 0) res--;
        return res;
    }

}
