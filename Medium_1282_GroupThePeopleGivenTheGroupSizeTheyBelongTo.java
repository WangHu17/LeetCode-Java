import java.util.*;

/**
 * @author wanghu
 * @discrption： Example 1:
 * Input: groupSizes = [3,3,3,3,3,1,3]
 * Output: [[5],[0,1,2],[3,4,6]]
 * Explanation:
 * The first group is [5]. The size is 1, and groupSizes[5] = 1.
 * The second group is [0,1,2]. The size is 3, and groupSizes[0] = groupSizes[1] = groupSizes[2] = 3.
 * The third group is [3,4,6]. The size is 3, and groupSizes[3] = groupSizes[4] = groupSizes[6] = 3.
 * Other possible solutions are [[2,1,6],[5],[0,4,3]] and [[5],[0,6,2],[4,3,1]].
 * @create 2022-01-12 14:38
 */
public class Medium_1282_GroupThePeopleGivenTheGroupSizeTheyBelongTo {

    //更好的方法：使用hashmap，边存边判断并删除
    //Runtime: 5 ms, faster than 74.86% of Java online submissions for Group the People Given the Group Size They Belong To.
    //Memory Usage: 39.6 MB, less than 81.09% of Java online submissions for Group the People Given the Group Size They Belong To.
    public List<List<Integer>> groupThePeople1(int[] groupSizes) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < groupSizes.length; i++) {
            int cur = groupSizes[i];
            if (!map.containsKey(cur)) {
                map.put(cur, new ArrayList<Integer>());
            }
            map.get(cur).add(i);
            if (map.get(cur).size() == cur) {
                res.add(map.get(cur));
                map.remove(cur);
            }
        }
        return res;
    }

    //我的方法：使用二维数组，排序
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        int len = groupSizes.length;
        int[][] map = new int[len][2];
        for (int i = 0; i < len; i++) {
            map[i][0] = groupSizes[i];
            map[i][1] = i;
        }
        Arrays.sort(map, Comparator.comparingInt(a -> a[0]));
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < len; ) {
            ArrayList<Integer> list = new ArrayList<>();
            int count = map[i][0];
            while (count-- > 0) {
                list.add(map[i][1]);
                i++;
            }
            res.add(list);
        }
        return res;
    }

}
