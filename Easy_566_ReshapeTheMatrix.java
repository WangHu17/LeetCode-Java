/**
 * @author wanghu
 * @discrption： 给定一个 m x n 矩阵 mat 和两个整数 r 和 c，分别代表想要的重构矩阵的行数和列数。
 * 重构后的矩阵应该以与它们相同的行遍历顺序填充原始矩阵的所有元素。 如果给定参数的reshape操作可行且合法，则输出新的reshape矩阵；
 * 否则，输出原始矩阵。
 * @create 2021-09-13 13:37
 */
public class Easy_566_ReshapeTheMatrix {

    //我的方法
    //Runtime: 0 ms, faster than 100.00% of Java online submissions for Reshape the Matrix.
    //Memory Usage: 39.8 MB, less than 79.72% of Java online submissions for Reshape the Matrix.
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int len1 = mat.length;//行数
        int len2 = mat[0].length;//列数
        if (r * c != len1 * len2) return mat;
        int[][] res = new int[r][c];
        int m = 0, n = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                res[i][j] = mat[m][n];
                if (n < len2) {
                    n++;
                }
                if (n == len2) {
                    m++;
                    n = 0;
                }
            }
        }
        return res;
    }

}
