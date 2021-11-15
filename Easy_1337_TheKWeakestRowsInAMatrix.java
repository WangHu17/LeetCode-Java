import java.util.Arrays;

/**
 * @author wanghu
 * @discrption： 您将获得一个由 1（代表士兵）和 0（代表平民）组成的 m x n 二进制矩阵 mat。
 * 士兵们站在平民面前。也就是说，所有 1 将出现在每行中所有 0 的左侧。
 * 如果下列条件之一为真，则 i 行比 j 行弱：
 *      第 i 行的士兵人数少于第 j 行的士兵人数。
 *      两行都有相同数量的士兵，并且 i < j。
 * 返回矩阵中 k 个最弱行的索引，从最弱到最强排序。
 * Example 1:
 * <p>
 * Input: mat =
 * [[1,1,0,0,0],
 * [1,1,1,1,0],
 * [1,0,0,0,0],
 * [1,1,0,0,0],
 * [1,1,1,1,1]],
 * k = 3
 * Output: [2,0,3]
 * @create 2021-11-12 11:16
 */
public class Easy_1337_TheKWeakestRowsInAMatrix {

    // 方法：先将二维数组每一行的和及行号保存到一个数组中，然后对这个数组自定义排序
    //Runtime: 2 ms, faster than 72.68% of Java online submissions for The K Weakest Rows in a Matrix.
    //Memory Usage: 40.2 MB, less than 44.44% of Java online submissions for The K Weakest Rows in a Matrix.
    public int[] kWeakestRows(int[][] mat, int k) {
        int[][] count = new int[mat.length][2];
        for (int i = 0; i < mat.length; i++) {
            int rowSum = 0;
            for (int j = 0; j < mat[0].length; j++) {
                rowSum += mat[i][j];
                if (mat[i][j] == 0) break;
                ;
            }
            count[i][0] = rowSum;
            count[i][1] = i;
        }
        Arrays.sort(count, (a, b) -> {
            if (a[0] != b[0]) return a[0] - b[0];
            else return a[1] - b[1];
        });
        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = count[i][1];
        }
        return res;
    }

}
