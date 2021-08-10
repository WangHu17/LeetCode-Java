import org.junit.Test;

/**
 * @author wanghu
 * @discrption： 求 n！后面的零的个数
 * @create 2021-08-10 9:31
 */
public class Easy_172_FactorialTrailingZeroes {

    //我的方法：不行，会越界
    public int trailingZeroes(int n) {
        if (n == 0) return 0;
        int cnt = 0;
        long sum = 1;
        while (n > 0) {
            sum *= n--;
        }
        System.out.println(sum);
        while (sum % 10 == 0 && sum > 0) {
            cnt++;
            sum /= 10;
        }
        return cnt;
    }

    //柳婼的方法：
    //5*2 = 10出现一个0，n*(n-1)*(n-2)...1当中能被5整除的数少于能被2整除的数
    //所以能被5整除的5的个数就是0的个数
    //比如25！,25 = 5 * 5有两个5，20，15，10，5各含一个5，这六个5分别和2结合相乘就能得到末尾6个0
    //所以只要count每个因子中5的个数就行
    //Runtime: 0 ms, faster than 100.00% of Java online submissions for Factorial Trailing Zeroes.
    //Memory Usage: 35.6 MB, less than 87.67% of Java online submissions for Factorial Trailing Zeroes.
    public int trailingZeroes1(int n) {
        int cnt = 0;
        while (n > 0) {
            cnt += n / 5;
            n /= 5;
        }
        return cnt;
    }

}
