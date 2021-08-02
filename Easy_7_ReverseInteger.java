import org.junit.Test;

import java.util.ArrayList;

/**
 * @author wanghu
 * @discrption：将一个整数倒转（考虑结果是否超过int范围）
 * @create 2021-07-26 16:51
 */
public class Easy_7_ReverseInteger {

    //Runtime: 1 ms, faster than 100.00% of Java online submissions for Reverse Integer.
    //Memory Usage: 36 MB, less than 70.18% of Java online submissions for Reverse Integer.
    public double reverse(int x) {
        int result=0;
        while(x!=0){
            int m = x%10;
            x/=10;
            if (result > Integer.MAX_VALUE/10 || (result == Integer.MAX_VALUE / 10 && m > 7)) return 0;
            if (result < Integer.MIN_VALUE/10 || (result == Integer.MIN_VALUE / 10 && m < -8)) return 0;
            result=result*10+m;
        }
        return result;
    }

    @Test
    public void test(){
        System.out.println(reverse(123));
    }

}
