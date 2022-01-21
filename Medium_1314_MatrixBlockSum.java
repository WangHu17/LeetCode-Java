/**
 * @author wanghu
 * @discrption： 给你一个m x n的矩阵mat和一个整数 k ，请你返回一个矩阵answer，
 * 其中每个answer[i][j]是所有满足下述条件的元素mat[r][c] 的和：
 * <p>
 * i - k <= r <= i + k,
 * j - k <= c <= j + k 且
 * (r, c)在矩阵内。
 * @create 2022-01-21 16:03
 */
public class Medium_1314_MatrixBlockSum {

    //我的方法：暴力
    //Runtime: 196 ms, faster than 12.97% of Java online submissions for Matrix Block Sum.
    //Memory Usage: 46.4 MB, less than 21.32% of Java online submissions for Matrix Block Sum.
    public int[][] matrixBlockSum(int[][] mat, int k) {
        int row = mat.length, col = mat[0].length;
        int[][] res = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                int sum = 0;
                for (int m = Math.max(i - k, 0); m <= Math.min(i + k, row - 1); m++) {
                    for (int n = Math.max(j - k, 0); n <= Math.min(j + k, col - 1); n++) {
                        sum += mat[m][n];
                    }
                }
                res[i][j] = sum;
            }
        }
        return res;
    }

}
