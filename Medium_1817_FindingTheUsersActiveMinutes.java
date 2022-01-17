import java.util.HashMap;
import java.util.HashSet;

/**
 * @author wanghu
 * @discrption： 示例 1：
 * 输入：logs = [[0,5],[1,2],[0,2],[0,5],[1,3]], k = 5
 * 输出：[0,2,0,0,0]
 * 解释：
 * ID=0 的用户执行操作的分钟分别是：5 、2 和 5 。因此，该用户的用户活跃分钟数为 2（分钟 5 只计数一次）
 * ID=1 的用户执行操作的分钟分别是：2 和 3 。因此，该用户的用户活跃分钟数为 2
 * 2 个用户的用户活跃分钟数都是 2 ，answer[2] 为 2 ，其余 answer[j] 的值都是 0
 * @create 2022-01-17 17:26
 */
public class Medium_1817_FindingTheUsersActiveMinutes {

    //方法：使用HashMap和HashSet
    //Runtime: 15 ms, faster than 94.22% of Java online submissions for Finding the Users Active Minutes.
    //Memory Usage: 50.2 MB, less than 60.15% of Java online submissions for Finding the Users Active Minutes.
    public int[] findingUsersActiveMinutes(int[][] logs, int k) {
        int[] res = new int[k];
        HashMap<Integer, HashSet<Integer>> map = new HashMap<>();
        for (int[] a : logs) {
            if (!map.containsKey(a[0])) {
                map.put(a[0], new HashSet<>());
            }
            map.get(a[0]).add(a[1]);
        }
        for (HashSet<Integer> set : map.values()) {
            res[set.size() - 1]++;
        }
        return res;
    }

}
