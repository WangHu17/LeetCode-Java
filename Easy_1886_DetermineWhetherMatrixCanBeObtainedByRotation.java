/**
 * @author wanghu
 * @discrption： 判断矩阵是否可以通过一次或多次90度旋转得到目标矩阵
 * @create 2021-12-15 10:34
 */
public class Easy_1886_DetermineWhetherMatrixCanBeObtainedByRotation {

    // 方法：暴力
    //Runtime: 1 ms, faster than 47.88% of Java online submissions for Determine Whether Matrix Can Be Obtained By Rotation.
    //Memory Usage: 39.3 MB, less than 13.35% of Java online submissions for Determine Whether Matrix Can Be Obtained By
    public boolean findRotation(int[][] mat, int[][] target) {
        if (isSame(mat, target)) return true;
        for (int i = 0; i < 3; i++) {
            int[][] rotateMatrix = rotateMatrix(mat);
            if (isSame(rotateMatrix, target)) return true;
            mat = rotateMatrix;
        }
        return false;
    }

    private int[][] rotateMatrix(int[][] mat) {
        int len = mat.length;
        int[][] rotateMat = new int[len][len];
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                rotateMat[i][j] = mat[len - j - 1][i];
            }
        }
        return rotateMat;
    }

    private boolean isSame(int[][] mat1, int[][] mat2) {
        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[0].length; j++) {
                if (mat1[i][j] != mat2[i][j]) return false;
            }
        }
        return true;
    }

}
