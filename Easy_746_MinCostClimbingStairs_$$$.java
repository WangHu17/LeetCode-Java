/**
 * @author wanghu
 * @discrption： 给定一个整数数组成本，其中 cost[i] 是楼梯上第 i 步的成本。
 * 支付费用后，您可以爬上一两步。 您可以从索引为 0 的步骤开始，也可以从索引为 1 的步骤开始。 返回到达楼层顶部的最低成本。
 * @create 2021-11-01 10:53
 */
public class Easy_746_MinCostClimbingStairs_$$$ {

    //Runtime: 1 ms, faster than 86.36% of Java online submissions for Min Cost Climbing Stairs.
    //Memory Usage: 38.7 MB, less than 76.90% of Java online submissions for Min Cost Climbing Stairs.
    public int minCostClimbingStairs(int[] cost) {
        int len = cost.length;
        int[] dp = new int[len];
        dp[0] = cost[0];
        dp[1] = cost[1];
        for (int i = 2; i < len; i++) {
            dp[i] = cost[i] + Math.min(dp[i - 1], dp[i - 2]);
        }
        return Math.min(dp[len - 1], dp[len - 2]);
    }

}
