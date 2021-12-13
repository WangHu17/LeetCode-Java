
/**
 * @author wanghu
 * @discrption： 求矩阵中特殊元素的个数，特殊元素是指它所在的行和列只有它是1，其他都是0
 * @create 2021-12-13 11:22
 */
public class Easy_1582_SpecialPositionsInABinaryMatrix {

    //我的方法
    //Runtime: 1 ms, faster than 99.64% of Java online submissions for Special Positions in a Binary Matrix.
    //Memory Usage: 39.4 MB, less than 49.09% of Java online submissions for Special Positions in a Binary Matrix.
    public int numSpecial(int[][] mat) {
        int row = mat.length, col = mat[0].length, res = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (mat[i][j] == 1) {
                    int flag = 1;
                    for (int m = 0; m < col; m++) {
                        if (mat[i][m] == 1 && m != j) flag = 0;
                    }
                    for (int n = 0; n < row; n++) {
                        if (mat[n][j] == 1 && n != i) flag = 0;
                    }
                    if (flag == 1) res++;
                    break;
                }
            }
        }
        return res;
    }

}
