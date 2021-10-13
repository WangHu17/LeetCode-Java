import java.util.ArrayList;
import java.util.Collections;

/**
 * @author wanghu
 * @discrption：
 * 给你一组整数石头，其中石头 [i] 是第 i 块石头的重量。
 * 我们正在玩石头游戏。
 * 在每一回合，我们选择最重的两块石头并将它们砸在一起。
 * 假设最重的两块石头的重量为 x 和 y，且 x <= y。
 * 这次粉碎的结果是：
 *      如果 x == y，则两块石头都被破坏，并且
 *      如果 x != y，则重量为 x 的石头被破坏，重量为 y 的石头具有新的重量 y - x。
 * 游戏结束时，最多只剩下一颗石头。
 * 返回左边石头的最小重量。
 * 如果没有剩余的石头，则返回 0。
 * @create 2021-10-13 13:59
 */
public class Easy_1046_LastStoneWeight {

    //Runtime: 3 ms, faster than 30.48% of Java online submissions for Last Stone Weight.
    //Memory Usage: 38.5 MB, less than 24.44% of Java online submissions for Last Stone Weight.
    public int lastStoneWeight(int[] stones) {
        ArrayList<Integer> res = new ArrayList<>();
        for (int n : stones) {
            res.add(n);
        }
        while (res.size() > 1) {
            Collections.sort(res);
            int smash = res.get(res.size() - 1) - res.get(res.size() - 2);
            res.remove(res.size() - 1);
            res.remove(res.size() - 1);
            if (smash != 0) res.add(smash);
        }
        return res.size() == 0 ? 0 : res.get(0);
    }

}
