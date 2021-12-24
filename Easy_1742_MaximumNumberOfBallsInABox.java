/**
 * @author wanghu
 * @discrption： 你在一个球厂工作，你有 n 个球，编号从 lowLimit 到 highLimit 包括在内（即 n == highLimit - lowLimit + 1），
 * 还有无数个盒子，编号从 1 到无穷大。 你在这家工厂的工作是把每个球放进盒子里，数字等于球的数字之和。例如，321 号球将放入
 * 3 + 2 + 1 = 6 号箱中，而 10 号球将放入 1 + 0 = 1 号箱内。 给定两个整数 lowLimit 和 highLimit，返回包含最多球的盒子中的球数。
 * @create 2021-12-24 10:46
 */
public class Easy_1742_MaximumNumberOfBallsInABox {

    //我的方法
    //Runtime: 20 ms, faster than 84.53% of Java online submissions for Maximum Number of Balls in a Box.
    //Memory Usage: 38.6 MB, less than 43.28% of Java online submissions for Maximum Number of Balls in a Box.
    public int countBalls(int lowLimit, int highLimit) {
        int[] count = new int[highLimit + 1];
        for (int i = lowLimit; i <= highLimit; i++) {
            int sum = 0, t = i;
            while (t != 0) {
                sum += t % 10;
                t /= 10;
            }
            count[sum]++;
        }
        int max = 0;
        for (int n : count) {
            max = Math.max(max, n);
        }
        return max;
    }

}
