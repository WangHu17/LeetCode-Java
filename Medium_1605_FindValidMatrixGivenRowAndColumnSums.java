/**
 * @author wanghu
 * @discrption： 给你两个非负整数数组rowSum 和colSum，其中rowSum[i]是二维矩阵中第 i行元素的和，
 * colSum[j]是第 j列元素的和。换言之你不知道矩阵里的每个元素，但是你知道每一行和每一列的和。
 * <p>
 * 请找到大小为rowSum.length x colSum.length的任意 非负整数矩阵，且该矩阵满足rowSum 和colSum的要求。
 * <p>
 * 请你返回任意一个满足题目要求的二维矩阵，题目保证存在 至少一个可行矩阵。
 * @create 2022-01-18 18:20
 */
public class Medium_1605_FindValidMatrixGivenRowAndColumnSums {

    //Runtime: 4 ms, faster than 91.44% of Java online submissions for Find Valid Matrix Given Row and Column Sums.
    //Memory Usage: 118.2 MB, less than 5.80% of Java online submissions for Find Valid Matrix Given Row and Column Sums.
    public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        int i = 0, j = 0, p = rowSum.length, q = colSum.length;
        int[][] res = new int[p][q];
        while (i < p && j < q) {
            res[i][j] = Math.min(rowSum[i], colSum[j]);
            rowSum[i] -= res[i][j];
            colSum[j] -= res[i][j];
            if (rowSum[i] == 0) i++;
            if (colSum[j] == 0) j++;
        }
        return res;
    }

}
