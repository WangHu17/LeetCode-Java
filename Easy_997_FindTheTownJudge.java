import java.util.HashMap;
import java.util.HashSet;

/**
 * @author wanghu
 * @discrption： 在一个城镇中，有 n 个从 1 到 n 标记的人。
 * 有传言说，其中一个人秘密地是镇法官。
 * 如果镇法官存在，那么：
 * 1、镇法官不信任任何人。
 * 2、每个人（除了镇法官）都信任镇法官。
 * 3、只有一个人满足性质 1 和性质 2。
 * 给定一个数组 trust，其中 trust[i] = [ai, bi] 表示标记为 ai 的人信任标记为 bi 的人。
 * 如果镇法官存在并且可以被识别，则返回镇法官的标签，否则返回-1。
 * @create 2021-10-11 9:37
 */
public class Easy_997_FindTheTownJudge {

    //我的方法：先找出被n-1个人信任的人，再判断这个人是否信任了别人，同时满足即为镇法官。（注意n为1的特殊情况）
    //Runtime: 15 ms, faster than 21.63% of Java online submissions for Find the Town Judge.
    //Memory Usage: 47.2 MB, less than 48.11% of Java online submissions for Find the Town Judge.
    public int findJudge(int n, int[][] trust) {
        if (n == 1 && trust.length == 0) return 1;
        HashMap<Integer, Integer> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < trust.length; i++) {
            map.put(trust[i][1], map.getOrDefault(trust[i][1], 0) + 1);
            set.add(trust[i][0]);
        }
        int res = 0;
        for (Integer key : map.keySet()) {
            if (map.get(key) == n - 1) {
                res = key;
            }
        }
        if (set.contains(res)) return -1;
        if (res == 0) return -1;
        return res;
    }

    //简便方法
    //Runtime: 3 ms, faster than 84.73% of Java online submissions for Find the Town Judge.
    //Memory Usage: 46.7 MB, less than 71.32% of Java online submissions for Find the Town Judge.
    public int findJudge1(int n, int[][] trust) {
        int[] res = new int[n + 1];
        for (int[] ints : trust) {
            res[ints[0]]--;
            res[ints[1]]++;
        }
        for (int j = 1; j <= n; j++) {
            if (res[j] == n - 1) return j;
        }
        return -1;
    }

}
