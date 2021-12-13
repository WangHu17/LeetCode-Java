import java.util.ArrayList;
import java.util.List;

/**
 * @author wanghu
 * @discrption： 给定一个大小为 m x n 的二维网格和一个整数 k。您需要将网格移动 k 次。
 * 在一班作业中： grid[i][j] 处的元素移动到 grid[i][j + 1]。
 * grid[i][n - 1] 处的元素移动到 grid[i + 1][0]。
 * grid[m - 1][n - 1] 处的元素移动到 grid[0][0]。
 * 应用移位操作 k 次后返回 2D 网格。
 * @create 2021-12-12 16:18
 */
public class Easy_1260_Shift2DGrid {

    //我的方法
    //Runtime: 5 ms, faster than 78.90% of Java online submissions for Shift 2D Grid.
    //Memory Usage: 39.6 MB, less than 83.54% of Java online submissions for Shift 2D Grid.
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int row = grid.length, col = grid[0].length;
        k = k % (row * col);
        // 移动多少个，就从多少个开始加入集合内
        if (k != 0) k = row * col - k;
        ArrayList<List<Integer>> res = new ArrayList<>();
        int i = 0, j = 0;
        // 定位到结果里的第一个元素原先的位置
        i = k / col;
        j = k % col;
        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            list.add(grid[i][j++]);
            if (j == col) {
                j = 0;
                i++;
            }
            if (list.size() == col) {
                res.add(list);
                list = new ArrayList<>();
            }
            if (i == row) i = 0;
            if (res.size() == row) break;
        }
        return res;
    }

}
