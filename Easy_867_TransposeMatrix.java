/**
 * @author wanghu
 * @discrption： 转置矩阵
 * @create 2021-09-26 10:54
 */
public class Easy_867_TransposeMatrix {

    //我的方法：用一个新数组纵向遍历目标并保存元素
    //Runtime: 0 ms, faster than 100.00% of Java online submissions for Transpose Matrix.
    //Memory Usage: 39.9 MB, less than 68.23% of Java online submissions for Transpose Matrix.
    public int[][] transpose(int[][] matrix) {
        int len1 = matrix[0].length, len2 = matrix.length;
        int[][] res = new int[len1][len2];
        for (int i = 0; i < len1; i++) {
            for (int j = 0; j < len2; j++) {
                res[i][j] = matrix[j][i];
            }
        }
        return res;
    }

}
