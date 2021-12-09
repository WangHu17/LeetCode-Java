/**
 * @author wanghu
 * @discrption： 我们有 n 个筹码，其中第 i 个筹码的位置是 position[i]。 我们需要将所有筹码移动到同一位置。
 * 一步，我们可以将第 i 个芯片的位置从 position[i] 改为： position[i] + 2 或 position[i] - 2 成本 = 0。
 * position[i] + 1 或 position[i] - 1，成本 = 1。 返回将所有筹码移动到同一位置所需的最小成本。
 * @create 2021-12-09 10:27
 */
public class Easy_1217_MinimumCostToMoveChipsToTheSamePosition {

    //方法：移动两步的成本是0，所以可以先将所有偶数位置的筹码移动到0的位置，奇数位置的筹码移动到1的位置，最后将少的那一堆移动到多的那一堆。
    //      所以只需计算偶数位置的筹码个数和奇数位置的筹码个数，少的就是答案
    //Runtime: 0 ms, faster than 100.00% of Java online submissions for Minimum Cost to Move Chips to The Same Position.
    //Memory Usage: 36.6 MB, less than 20.06% of Java online submissions for Minimum Cost to Move Chips to The Same Position.
    public int minCostToMoveChips(int[] position) {
        int odd = 0, even = 0;
        for (int i : position) {
            if (i % 2 == 1) odd++;
            if (i % 2 == 0) even++;
        }
        return Math.min(odd, even);
    }

}
