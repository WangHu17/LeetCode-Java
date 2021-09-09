/**
 * @author wanghu
 * @discrption： 给你 row x col 网格代表一张地图，其中 grid[i][j] = 1 代表陆地，grid[i][j] = 0 代表水。
 * 网格单元水平/垂直（不是对角线）连接。网格完全被水包围，只有一个岛（即一个或多个相连的陆地单元）。
 * 岛上没有“湖泊”，这意味着里面的水与岛周围的水没有联系。一个单元格是边长为1的正方形。网格为矩形，宽高不超过100。确定岛的周长。
 * @create 2021-09-09 10:47
 */
public class Easy_463_IslandPerimeter {

    //Runtime: 5 ms, faster than 99.32% of Java online submissions for Island Perimeter.
    //Memory Usage: 40.1 MB, less than 80.79% of Java online submissions for Island Perimeter.
    public int islandPerimeter(int[][] grid) {
        int sum = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    //上
                    if (i == 0 || grid[i - 1][j] == 0) sum++;
                    //左
                    if (j == 0 || grid[i][j - 1] == 0) sum++;
                    //下
                    if (i == grid.length - 1 || grid[i + 1][j] == 0) sum++;
                    //右
                    if (j == grid[i].length - 1 || grid[i][j + 1] == 0) sum++;
                }
            }
        }
        return sum;
    }

}
