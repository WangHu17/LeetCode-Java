/**
 * @author wanghu
 * @discrption： 给定一个整数 n，如果它是 3 的幂，则返回 true。否则，返回false。
 * @create 2021-08-27 9:21
 */
public class Easy_326_PowerOfThree {

    //方法一
    //Runtime: 25 ms, faster than 8.15% of Java online submissions for Power of Three.
    //Memory Usage: 44.2 MB, less than 5.21% of Java online submissions for Power of Three.
    public boolean isPowerOfThree(int n) {
        if (n <= 0) return false;
        return Math.pow(3, Math.round(Math.log(n) / Math.log(3))) == n;
    }

    //方法二：循环
    //Runtime: 10 ms, faster than 99.96% of Java online submissions for Power of Three.
    //Memory Usage: 38.9 MB, less than 45.28% of Java online submissions for Power of Three.
    public boolean isPowerOfThree1(int n) {
        if (n <= 0) return false;
        while (n % 3 == 0) {
            n /= 3;
        }
        return n == 1;
    }

}
