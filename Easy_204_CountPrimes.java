import com.sun.org.apache.xpath.internal.axes.PredicatedNodeTest;
import org.junit.Test;

/**
 * @author wanghu
 * @discrption：求n以内的质数的个数
 * @create 2021-07-20 14:00
 */
public class Easy_204_CountPrimes {

    //我的方法，超时了...
    public int countPrimes(int n) {
        int sum=0;
        int flag=1;
        if(n<3)return 0;
        for(int i=2; i<n; i++){
            flag=1;
            for(int j=2; j<=Math.sqrt(i); j++){
                if(i%j==0){
                    flag=0;
                    continue;
                }
            }
            if(flag==1){
                sum++;
            }
        }
        return sum;
    }

    //大佬的方法：筛选法，筛选掉后面是当前数的倍数的数，并跳过已筛选的的数
    //Runtime: 29 ms, faster than 88.50% of Java online submissions for Count Primes.
    //Memory Usage: 42.6 MB, less than 39.48% of Java online submissions for Count Primes.
    public int countPrimes1(int n) {
        boolean[] seen = new boolean[n];
        int ans = 0;
        for (int num = 2; num < n; num++) {
            if (seen[num]) continue;
            ans += 1;
            for (long mult = (long)num * num; mult < n; mult += num)
                seen[(int)mult] = true;
        }
        return ans;
    }

    @Test
    public void test(){
        System.out.println(countPrimes1( 499979));//41537
    }

}
