/**
 * @author wanghu
 * @discrption： 求方矩阵对角线上元素的和，不重复计算
 * @create 2021-12-13 11:15
 */
public class Easy_1572_MatrixDiagonalSum {

    //我的方法：先计算两条对角线元素的总和，如果行数是奇数就减去一个中间的元素
    //Runtime: 0 ms, faster than 100.00% of Java online submissions for Matrix Diagonal Sum.
    //Memory Usage: 38.6 MB, less than 97.50% of Java online submissions for Matrix Diagonal Sum.
    public int diagonalSum(int[][] mat) {
        int sum = 0, len = mat.length;
        for (int i = 0; i < len; i++) {
            sum += mat[i][i] + mat[len - i - 1][i];
        }
        return len % 2 == 1 ? (sum - mat[len / 2][len / 2]) : sum;
    }

}
