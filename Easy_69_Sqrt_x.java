import org.junit.Test;

/**
 * @author wanghu
 * @discrption：手动求根号
 * @create 2021-07-28 9:19
 */
public class Easy_69_Sqrt_x {

    //二分法：用long是为了避免mid*mid超出int范围
    //Runtime: 1 ms, faster than 99.99% of Java online submissions for Sqrt(x).
    //Memory Usage: 36.1 MB, less than 63.49% of Java online submissions for Sqrt(x).
    public int mySqrt(int x) {
        long low = 0, high = x, mid=0;
        if (x == 0) return 0;
        if (x < 4) return 1;
        while (low <= high) {
            mid = low + (high-low)/2;
            if(mid*mid<=x && (mid+1)*(mid+1)>x){
                return (int)mid;
            }
            if (mid * mid > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return 0;
    }

    @Test
    public void test(){
        System.out.println(mySqrt(2147395599));
    }

}
