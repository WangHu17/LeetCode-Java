/**
 * @author wanghu
 * @discrption：爬楼梯
 * @create 2021-07-28 11:03
 */
public class Easy_70_ClimbingStairs {

    //只有两种办法爬楼，每次一步或者每次两步。
    //可以这样想，n个台阶，一开始可以爬 1 步，也可以爬 2 步，那么n个台阶爬楼的爬楼方法就等于:
    // 一开始爬1步的方法数 + 一开始爬2步的方法数，这样我们就只需要计算n-1个台阶的方法数和n-2个台阶方法数，
    // 同理，计算n-1个台阶的方法数只需要计算一下n-2个台阶和n-3个台阶，计算n-2个台阶需要计算一下n-3个台阶和n-4个台阶……
    //Runtime: 0 ms, faster than 100.00% of Java online submissions for Climbing Stairs.
    //Memory Usage: 35.7 MB, less than 57.08% of Java online submissions for Climbing Stairs.
    public int climbStairs(int n) {
        if(n<3)return n;
        int[] a = new int[n+1];
        a[1]=1;
        a[2]=2;
        a[3]=3;
        for(int i=4;i<=n;i++){
            a[i]=a[i-1]+a[i-2];
        }
        return a[n];
    }

}
