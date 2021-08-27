/**
 * @author wanghu
 * @discrption： 给定一个整数 n，如果它是四的幂，则返回 true。否则，返回false。
 * @create 2021-08-27 10:10
 */
public class Easy_342_PowerOfFour {


    //我的方法一：循环
    //Runtime: 1 ms, faster than 99.53% of Java online submissions for Power of Four.
    //Memory Usage: 36.3 MB, less than 29.03% of Java online submissions for Power of Four.
    public boolean isPowerOfFour(int n) {
        if (n <= 0) return false;
        while (n % 4 == 0) n /= 4;
        return n == 1;
    }

    //我的方法二
    //Runtime: 1 ms, faster than 99.53% of Java online submissions for Power of Four.
    //Memory Usage: 35.9 MB, less than 71.44% of Java online submissions for Power of Four.
    public boolean isPowerOfFour1(int n) {
        if (n <= 0) return false;
        return Math.pow(4, Math.round(Math.log(n) / Math.log(4))) == n;
    }

}
