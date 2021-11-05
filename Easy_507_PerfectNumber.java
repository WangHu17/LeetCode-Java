
/**
 * @author wanghu
 * @discrption： 完全数是一个正整数，它等于它的正除数之和，不包括数字本身。整数 x 的约数是可以整除 x 的整数。
 * 给定一个整数 n，如果 n 是一个完全数，则返回 true，否则返回 false。
 * @create 2021-11-05 11:09
 */
public class Easy_507_PerfectNumber {

    // 我的方法：sum=1，从2到num的平方根这个区间找除数，找到了再加上与该除数对应的另一个除数，最后如果有两个除数相等减去一个它。
    //Runtime: 1 ms, faster than 97.27% of Java online submissions for Perfect Number.
    //Memory Usage: 35.8 MB, less than 66.55% of Java online submissions for Perfect Number.
    public boolean checkPerfectNumber(int num) {
        int sum = 1, t = (int) Math.sqrt(num);
        for (int i = 2; i <= t; i++) {
            if (num % i == 0) {
                sum += i + num / i;
            }
        }
        if (t * t == num) sum -= t;
        return sum == num;
    }

}
