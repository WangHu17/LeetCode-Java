import java.util.ArrayList;

/**
 * @author wanghu
 * @discrption： 给你一个待查数组 queries ，数组中的元素为 1 到 m 之间的正整数。
 * 请你根据以下规则处理所有待查项 queries[i]（从 i=0 到 i=queries.length-1）：
 * 一开始，排列 P=[1,2,3,...,m]。
 * 对于当前的 i ，请你找出待查项 queries[i] 在排列 P 中的位置（下标从 0 开始），
 * 然后将其从原位置移动到排列 P 的起始位置（即下标为 0 处）。
 * 注意， queries[i] 在 P 中的位置就是 queries[i] 的查询结果。
 * @create 2022-01-15 15:02
 */
public class Medium_1409_QueriesOnAPermutationWithKey {

    //方法二：使用集合ArrayList
    //Runtime: 14 ms, faster than 28.92% of Java online submissions for Queries on a Permutation With Key.
    //Memory Usage: 39.9 MB, less than 29.97% of Java online submissions for Queries on a Permutation With Key.
    public int[] processQueries1(int[] queries, int m) {
        int[] res = new int[queries.length];
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= m; i++) {
            list.add(i);
        }
        for (int i = 0; i < queries.length; i++) {
            int query = queries[i];
            int index = -1;
            for (int j = 0; j < m; j++) {
                if (list.get(j) == query) {
                    index = j;
                    break;
                }
            }
            res[i] = index;
            list.remove(index);
            list.add(0, query);
        }
        return res;
    }

    //我的方法
    //Runtime: 6 ms, faster than 74.22% of Java online submissions for Queries on a Permutation With Key.
    //Memory Usage: 39.2 MB, less than 63.41% of Java online submissions for Queries on a Permutation With Key.
    public int[] processQueries(int[] queries, int m) {
        int[] res = new int[queries.length];
        int[] map = new int[m];
        for (int i = 0; i < m; i++) {
            map[i] = i + 1;
        }
        for (int i = 0; i < queries.length; i++) {
            int index = index(map, queries[i]);
            res[i] = index;
            map = move(map, index);
        }
        return res;
    }

    private int index(int[] arr, int n) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) return i;
        }
        return -1;
    }

    private int[] move(int[] arr, int n) {
        int temp = arr[n];
        for (int i = n; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = temp;
        return arr;
    }

}
