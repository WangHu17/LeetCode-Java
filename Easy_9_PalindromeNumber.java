import org.junit.Test;

/**
 * @author wanghu
 * @discrption：
 * @create 2021-07-27 9:44
 */
public class Easy_9_PalindromeNumber {

    //我的方法
    //Runtime: 6 ms, faster than 99.96% of Java online submissions for Palindrome Number.
    //Memory Usage: 38.3 MB, less than 77.81% of Java online submissions for Palindrome Number.
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        int reverse = 0, m, y = x;
        while (y != 0) {
            m = y % 10;
            y /= 10;
            reverse = reverse * 10 + m;
        }
        if (reverse == x) return true;
        return false;
    }

    @Test
    public void test() {
        System.out.println(isPalindrome(121));
    }

}
