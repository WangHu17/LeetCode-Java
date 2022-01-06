/**
 * @author wanghu
 * @discrption：
 * @create 2022-01-06 10:38
 */
public class Medium_807_MaxIncreaseToKeepCitySkyline {

    //我的方法
    //Runtime: 1 ms, faster than 98.81% of Java online submissions for Max Increase to Keep City Skyline.
    //Memory Usage: 41.2 MB, less than 11.65% of Java online submissions for Max Increase to Keep City Skyline.
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int sum = 0, row = grid.length;
        int[] rowMax = new int[row];
        int[] colMax = new int[row];
        for (int i = 0; i < row; i++) {
            int max1 = grid[i][0];
            int max2 = grid[0][i];
            for (int j = 0; j < row; j++) {
                max1 = Math.max(max1, grid[i][j]);
                max2 = Math.max(max2, grid[j][i]);
            }
            rowMax[i] = max1;
            colMax[i] = max2;
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row; j++) {
                sum += Math.min(rowMax[i], colMax[j]) - grid[i][j];
            }
        }
        return sum;
    }

}
