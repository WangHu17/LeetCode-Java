import java.util.Arrays;
import java.util.HashMap;

/**
 * @author wanghu
 * @discrption： 给数组中的元素排名，相等的元素排名相同
 * @create 2021-11-23 15:19
 */
public class Easy_1331_RankTransformOfAnArray {

    // 我的方法：复制数组并排序，然后将元素及排名存入map中
    //Runtime: 44 ms, faster than 42.08% of Java online submissions for Rank Transform of an Array.
    //Memory Usage: 87.8 MB, less than 5.79% of Java online submissions for Rank Transform of an Array.
    public int[] arrayRankTransform(int[] arr) {
        int[] clone = arr.clone();
        int[] rank = new int[arr.length];
        Arrays.sort(clone);
        HashMap<Integer, Integer> map = new HashMap<>();
        int i = 1;
        for (int n : clone) {
            if (!map.containsKey(n)) {
                map.put(n, i++);
            }
        }
        int j = 0;
        for (int n : arr) {
            rank[j++] = map.get(n);
        }
        return rank;
    }

}
