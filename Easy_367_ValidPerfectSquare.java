/**
 * @author wanghu
 * @discrption： 判断所给的数是否正好是某数的平方
 * @create 2021-08-31 14:54
 */
public class Easy_367_ValidPerfectSquare {

    //使用二分法
    //Runtime: 0 ms, faster than 100.00% of Java online submissions for Valid Perfect Square.
    //Memory Usage: 37.9 MB, less than 7.39% of Java online submissions for Valid Perfect Square.
    public boolean isPerfectSquare(int num) {
        long low = 0, high = num/2, mid = 0;
        if(num==1)return true;
        while (true) {
            mid = low + (high - low) / 2;
            if (mid * mid == num) {
                return true;
            } else if (mid * mid < num && (mid + 1) * (mid + 1) > num) {
                return false;
            } else if (mid * mid < num) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
    }

}
