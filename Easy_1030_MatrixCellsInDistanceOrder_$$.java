import java.util.Arrays;

/**
 * @author wanghu
 * @discrption：
 * 给定四个整数 row、cols、rCenter 和 cCenter。
 * 有一个行 x cols 矩阵，您位于具有坐标 (rCenter, cCenter) 的单元格上。
 * 返回矩阵中所有单元格的坐标，按照它们与 (rCenter, cCenter) 的距离从最小距离到最大距离排序。
 * 您可以按照满足此条件的任何顺序返回答案。
 * 两个单元格 (r1, c1) 和 (r2, c2) 之间的距离为 |r1 - r2| + |c1 - c2|。
 * @create 2021-10-13 9:26
 */
public class Easy_1030_MatrixCellsInDistanceOrder_$$ {

    // 方法：以目标位置为中心，按正菱形向外扩散，每个菱形上的点到目标位置的距离相等；
    //      以左上边、左下边、右下边、右上边为顺序遍历菱形上的点放入数组；
    //      每个菱形遍历的起始位置是上顶点；
    //      遍历菱形的个数为最远点的距离。
    //Runtime: 4 ms, faster than 99.10% of Java online submissions for Matrix Cells in Distance Order.
    //Memory Usage: 41.5 MB, less than 48.06% of Java online submissions for Matrix Cells in Distance Order.
    public int[][] allCellsDistOrder(int rows, int cols, int rCenter, int cCenter) {
        int[][] res = new int[rows * cols][2];
        res[0] = new int[]{rCenter, cCenter};
        int i = 1;// res数组的索引
        int cnt = Math.max(rCenter, rows - rCenter) + Math.max(cCenter, cols - cCenter);//最远点的距离，即循环遍历的次数
        for (int dist = 1; dist <= cnt; dist++) {
            // 从菱形的上顶点开始遍历
            int r = rCenter - dist;
            int c = cCenter;
            // 左上边
            for (int j = 0; j < dist; j++) {
                if (r >= 0 && c >= 0) res[i++] = new int[]{r, c};
                r++;
                c--;
            }
            // 左下边
            for (int j = 0; j < dist; j++) {
                if (r < rows && c >= 0) res[i++] = new int[]{r, c};
                r++;
                c++;
            }
            // 右下边
            for (int j = 0; j < dist; j++) {
                if (r < rows && c < cols) res[i++] = new int[]{r, c};
                r--;
                c++;
            }
            // 右上边
            for (int j = 0; j < dist; j++) {
                if (r >= 0 && c < cols) res[i++] = new int[]{r, c};
                r--;
                c--;
            }
        }
        return res;
    }

    //方法二：排序，先将所有点依次放入数组中，然后按距离排序
    //Runtime: 11 ms, faster than 82.99% of Java online submissions for Matrix Cells in Distance Order.
    //Memory Usage: 41.4 MB, less than 55.22% of Java online submissions for Matrix Cells in Distance Order.
    public int[][] allCellsDistOrder1(int rows, int cols, int rCenter, int cCenter) {
        int[][] res = new int[rows * cols][2];
        int index = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                res[index][0] = i;
                res[index][1] = j;
                index++;
            }
        }
        Arrays.sort(res, (o1, o2) ->
                Math.abs(o1[0] - rCenter) + Math.abs(o1[1] - cCenter) - (Math.abs(o2[0] - rCenter) + Math.abs(o2[1] - cCenter))
        );
        return res;
    }

}
