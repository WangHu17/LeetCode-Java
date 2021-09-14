/**
 * @author wanghu
 * @discrption： 给定一个 mxn 矩阵 M，用全 0 和一组操作 ops 进行初始化，
 * 其中 ops[i] = [ai, bi] 表示 M[x][y] 应加 1，所有 0 <= x < ai并且 0 <= y < bi。
 * 执行所有操作后，计算并返回矩阵中最大整数的数量。
 * @create 2021-09-14 11:46
 */
public class Easy_598_RangeAdditionII {

    //我的方法：只需要找出ops二维数组两列的最小值相乘
    //Runtime: 0 ms, faster than 100.00% of Java online submissions for Range Addition II.
    //Memory Usage: 38.9 MB, less than 82.75% of Java online submissions for Range Addition II.
    public int maxCount(int m, int n, int[][] ops) {
        if (ops.length == 0) return m * n;
        int row = ops[0][0], col = ops[0][1];
        for (int j = 0; j < ops.length; j++) {
            if (row > ops[j][0]) row = ops[j][0];
            if (col > ops[j][1]) col = ops[j][1];
        }
        return row*col;
    }

}
