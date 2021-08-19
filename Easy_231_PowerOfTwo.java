import org.junit.Test;

/**
 * @author wanghu
 * @discrption： 判断一个数是否是2的整数幂
 * @create 2021-08-19 9:57
 */
public class Easy_231_PowerOfTwo {

    //Runtime: 1 ms, faster than 99.96% of Java online submissions for Power of Two.
    //Memory Usage: 36.1 MB, less than 61.41% of Java online submissions for Power of Two.
    public boolean isPowerOfTwo(int n) {
        if (n < 0) return false;
        return Math.pow(2, Math.round(Math.log(n)/Math.log(2)))==n;
    }

    @Test
    public void test() {
        System.out.println(isPowerOfTwo(6));
    }

}
