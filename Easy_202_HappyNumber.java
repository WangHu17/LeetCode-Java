import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

/**
 * @author wanghu
 * @discrption：
 * 判断是不是快乐数。从任何正整数开始，用其数字的平方和替换该数字。
 * 重复这个过程直到数字等于 1（它将停留在那里），或者它在一个不包括 1 的无限循环。
 * 这个过程以 1 结束的那些数字是快乐的。
 * @create 2021-08-16 10:39
 */
public class Easy_202_HappyNumber {

    //我的方法：递归，用set集合判断是否循环了
    //Runtime: 1 ms, faster than 79.73% of Java online submissions for Happy Number.
    //Memory Usage: 35.7 MB, less than 95.16% of Java online submissions for Happy Number.
    private Set<Integer> set = new HashSet<>();

    public boolean isHappy(int n) {
        boolean add = set.add(n);
        if(!add)return false;
        int sum = 0;
        while (n!=0){
            sum += Math.pow(n%10, 2);
            n/=10;
        }
        return sum==1?true:isHappy(sum);
    }

    //柳婼的方法：超过10次计算就返回false。经过实验超过7次就可以返回false
    //Runtime: 0 ms, faster than 100.00% of Java online submissions for Happy Number.
    //Memory Usage: 35.3 MB, less than 99.92% of Java online submissions for Happy Number.
    public boolean isHappy1(int n) {
        int cnt = 0;
        while(n != 1) {
            cnt++;
            int temp = 0;
            while(n!=0) {
                temp = temp + (n % 10) * (n % 10);
                n = n / 10;
            }
            n = temp;
            if(cnt == 7) {
                return false;
            }
        }
        return true;
    }

    @Test
    public void test(){
        System.out.println(isHappy(19));
    }

}
