/**
 * @author wanghu
 * @discrption： 矩阵对角线 是一条从矩阵最上面行或者最左侧列中的某个元素开始的对角线，
 * 沿右下方向一直到矩阵末尾的元素。例如，矩阵 mat 有 6 行 3 列，从 mat[2][0] 开始的矩阵对角线
 * 将会经过 mat[2][0]、mat[3][1] 和 mat[4][2] 。
 * <p>
 * 给你一个m * n的整数矩阵mat，请你将同一条 矩阵对角线 上的元素按升序排序后，返回排好序的矩阵。
 * @create 2022-01-15 15:53
 */
public class Medium_1329_SortTheMatrixDiagonally {

    //Runtime: 9 ms, faster than 44.62% of Java online submissions for Sort the Matrix Diagonally.
    //Memory Usage: 44.4 MB, less than 36.06% of Java online submissions for Sort the Matrix Diagonally.
    public int[][] diagonalSort(int[][] mat) {
        int m = mat.length, n = mat[0].length;
        for (int k = 0; k < Math.min(m, n); k++) {
            for (int i = 0; i < m - k - 1; i++) {
                for (int j = 0; j < n - k - 1; j++) {
                    if (mat[i][j] > mat[i + 1][j + 1]) {
                        int t = mat[i][j];
                        mat[i][j] = mat[i + 1][j + 1];
                        mat[i + 1][j + 1] = t;
                    }
                }
            }
        }
        return mat;
    }

}
