/**
 * @author wanghu
 * @discrption： 给定一个 m x n 矩阵网格，该网格按行和列的非递增顺序排序，返回网格中负数的数量。
 * [[4,3,2,-1],
 * [3,2,1,-1],
 * [1,1,-1,-2],
 * [-1,-1,-2,-3]]
 * @create 2021-11-15 14:30
 */
public class Easy_1351_CountNegativeNumbersInASortedMatrix {

    // 我的方法：倒序遍历，当遍历到非负数，则下一行不遍历这之前的数，当一行中没有负数了，则不继续往前遍历了
    //Runtime: 1 ms, faster than 48.34% of Java online submissions for Count Negative Numbers in a Sorted Matrix.
    //Memory Usage: 39.2 MB, less than 82.00% of Java online submissions for Count Negative Numbers in a Sorted Matrix.
    public int countNegatives(int[][] grid) {
        int m = 0, sum = 0;
        for (int i = grid.length - 1; i >= 0; i--) {
            for (int j = grid[0].length - 1; j >= m; j--) {
                if (grid[i][j] < 0) sum++;
                else {
                    m = j;
                    break;
                }
            }
            if (m == grid[0].length - 1) break;
        }
        return sum;
    }

}
