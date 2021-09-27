/**
 * @author wanghu
 * @discrption：
 * 给定一个 n x n 网格，我们在其中放置一些 1 x 1 x 1 立方体，这些立方体与 x、y 和 z 轴对齐。
 * 每个值 v = grid[i][j] 表示放置在单元格 (i, j) 顶部的 v 个立方体的塔。 我
 * 们查看这些立方体在 xy、yz 和 zx 平面上的投影。 投影就像一个阴影，它将我们的 3 维图形映射到一个 2 维平面。
 * 从顶部、正面和侧面观察立方体时，我们正在观察“阴影”。 返回所有三个投影的总面积。
 * @create 2021-09-27 9:24
 */
public class Easy_883_ProjectionAreaOf3DShapes {

    //我的方法
    //Runtime: 1 ms, faster than 100.00% of Java online submissions for Projection Area of 3D Shapes.
    //Memory Usage: 38.7 MB, less than 68.09% of Java online submissions for Projection Area of 3D Shapes.
    public int projectionArea(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int topArea = 0, frontArea = 0, leftArea = 0;
        for (int i = 0; i < row; i++) {
            int max = 0;
            for (int j = 0; j < col; j++) {
                max = Math.max(max, grid[i][j]);
                if (grid[i][j] != 0) topArea++;
            }
            frontArea += max;
        }
        for (int i = 0; i < col; i++) {
            int max = 0;
            for (int j = 0; j < row; j++) {
                max = Math.max(max, grid[j][i]);
            }
            leftArea += max;
        }
        return topArea + frontArea + leftArea;
    }

}
