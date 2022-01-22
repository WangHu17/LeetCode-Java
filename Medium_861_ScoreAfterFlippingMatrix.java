/**
 * @author wanghu
 * @discrption： 有一个二维矩阵A 其中每个元素的值为0或1。
 *
 * 移动是指选择任一行或列，并转换该行或列中的每一个值：将所有 0 都更改为 1，将所有 1 都更改为 0。
 *
 * 在做出任意次数的移动后，将该矩阵的每一行都按照二进制数来解释，矩阵的得分就是这些数字的总和。
 *
 * 返回尽可能高的分数。
 * @create 2022-01-22 20:11
 */
public class Medium_861_ScoreAfterFlippingMatrix {

    //我的方法
    //Runtime: 1 ms, faster than 61.76% of Java online submissions for Score After Flipping Matrix.
    //Memory Usage: 38.6 MB, less than 57.14% of Java online submissions for Score After Flipping Matrix.
    public int matrixScore(int[][] grid) {
        int row = grid.length, sum = 0;
        for (int i = 0; i < row; i++) {
            if (grid[i][0] == 0) flipRow(grid, i);
        }
        for (int i = 1; i < grid[0].length; i++) {
            if (count(grid, i)) flipCol(grid, i);
        }
        for (int i = 0; i < row; i++) sum += sum(grid[i]);
        return sum;
    }

    private void flipRow(int[][] nums, int row) {
        for (int i = 0; i < nums[0].length; i++) {
            nums[row][i] = nums[row][i] == 1 ? 0 : 1;
        }
    }

    private void flipCol(int[][] nums, int col) {
        for (int i = 0; i < nums.length; i++) {
            nums[i][col] = nums[i][col] == 1 ? 0 : 1;
        }
    }

    private Boolean count(int[][] nums, int col) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i][col] == 0) sum++;
        }
        return sum > nums.length / 2;
    }

    private int sum(int[] num) {
        int sum = 0, k = 0;
        for (int i = num.length - 1; i >= 0; i--) {
            if (num[i] == 1) sum += Math.pow(2, k);
            k++;
        }
        return sum;
    }

}
