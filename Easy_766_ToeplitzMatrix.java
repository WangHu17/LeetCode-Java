import org.junit.Test;

/**
 * @author wanghu
 * @discrption： 给定一个 m x n 矩阵，如果矩阵是 Toeplitz，则返回 true。否则，返回false。
 * 如果从左上角到右下角的每条对角线都具有相同的元素，则矩阵是 Toeplitz。
 * @create 2021-09-23 11:11
 */
public class Easy_766_ToeplitzMatrix {

    //Runtime: 0 ms, faster than 100.00% of Java online submissions for Toeplitz Matrix.
    //Memory Usage: 39 MB, less than 72.65% of Java online submissions for Toeplitz Matrix.
    public boolean isToeplitzMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (i > 0 && j > 0 && matrix[i - 1][j - 1] != matrix[i][j])
                    return false;
            }
        }
        return true;
    }

}
