import org.junit.Test;

/**
 * @author wanghu
 * @discrption： 丑数是一个正整数，其质因数限制为 2、3 和 5。
 * @create 2021-08-25 9:41
 */
public class Easy_263_UglyNumber {

    //我的方法：超时
    public boolean isUgly(int n) {
        if (n <= 0) return false;
        for (int i = 2; i <= n; i++) {
            if (n % i == 0 && isPrime(i)) {
                if (i != 2 && i != 3 && i != 5)
                    return false;
            }
        }
        return true;
    }

    public boolean isPrime(int m) {
        for (int i = 2; i <= Math.sqrt(m); i++) {
            if (m % i == 0) return false;
        }
        return true;
    }

    //柳婼
    //Runtime: 1 ms, faster than 100.00% of Java online submissions for Ugly Number.
    //Memory Usage: 36.3 MB, less than 28.59% of Java online submissions for Ugly Number.
    public boolean isUgly1(int n) {
        if (n <= 0) return false;
        int flag;
        while (n != 1) {
            flag = 0;
            if (n % 2 == 0) {
                flag = 1;
                n /= 2;
            }
            if (n % 3 == 0) {
                flag = 1;
                n /= 3;
            }
            if (n % 5 == 0) {
                flag = 1;
                n /= 5;
            }
            if (flag == 0)
                return false;
        }
        return true;
    }

}
