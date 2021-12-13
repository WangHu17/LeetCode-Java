import java.util.ArrayList;
import java.util.List;

/**
 * @author wanghu
 * @discrption： 找矩阵中行最小列最大的值
 * @create 2021-12-13 10:48
 */
public class Easy_1380_LuckyNumbersInAMatrix {

    //我的方法
    //Runtime: 1 ms, faster than 94.17% of Java online submissions for Lucky Numbers in a Matrix.
    //Memory Usage: 39.6 MB, less than 49.05% of Java online submissions for Lucky Numbers in a Matrix.
    public List<Integer> luckyNumbers(int[][] matrix) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            int cur = matrix[i][0], col = 0;
            for (int j = 0; j < matrix[0].length; j++) {
                if (cur > matrix[i][j]) {
                    cur = matrix[i][j];
                    col = j;
                }
            }
            int flag = 1;
            for (int k = 0; k < matrix.length; k++) {
                if (matrix[k][col] > cur) flag = 0;
            }
            if (flag == 1) list.add(cur);
        }
        return list;
    }

}
