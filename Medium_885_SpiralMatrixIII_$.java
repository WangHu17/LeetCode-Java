import org.junit.Test;

/**
 * @author wanghu
 * @discrption： 在R行C列的矩阵上，我们从(r0, c0)面朝东面开始
 * 这里，网格的西北角位于第一行第一列，网格的东南角位于最后一行最后一列。
 * 现在，我们以顺时针按螺旋状行走，访问此网格中的每个位置。
 * 每当我们移动到网格的边界之外时，我们会继续在网格之外行走（但稍后可能会返回到网格边界）。
 * 最终，我们到过网格的所有R * C个空间。
 * 按照访问顺序返回表示网格位置的坐标列表。
 * @create 2022-01-27 21:10
 */
public class Medium_885_SpiralMatrixIII_$ {

    //Runtime: 5 ms, faster than 51.65% of Java online submissions for Spiral Matrix III.
    //Memory Usage: 64.1 MB, less than 5.11% of Java online submissions for Spiral Matrix III.
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int count = 0, cur = 1, total = rows * cols;
        int[][] res = new int[total][2];
        res[0][0] = rStart;
        res[0][1] = cStart;
        count++;
        while (count < total) {
            //右
            for (int i = cStart + 1; i <= cStart + cur && count < total; i++) {
                //如果在矩阵内
                if (rStart >= 0 && rStart < rows && i >= 0 && i < cols) {
                    res[count][0] = rStart;
                    res[count][1] = i;
                    count++;
                }
            }
            cStart += cur;
            //下
            for (int i = rStart + 1; i <= rStart + cur && count < total; i++) {
                //如果在矩阵内
                if (i >= 0 && i < rows && cStart >= 0 && cStart < cols) {
                    res[count][0] = i;
                    res[count][1] = cStart;
                    count++;
                }
            }
            rStart += cur;
            cur++;
            //左
            for (int i = cStart - 1; i >= cStart - cur && count < total; i--) {
                //如果在矩阵内
                if (rStart >= 0 && rStart < rows && i >= 0 && i < cols) {
                    res[count][0] = rStart;
                    res[count][1] = i;
                    count++;
                }
            }
            cStart -= cur;
            //上
            for (int i = rStart - 1; i >= rStart - cur && count < total; i--) {
                //如果在矩阵内
                if (i >= 0 && i < rows && cStart >= 0 && cStart < cols) {
                    res[count][0] = i;
                    res[count][1] = cStart;
                    count++;
                }
            }
            rStart -= cur;
            cur++;
        }
        return res;
    }

    @Test
    public void test() {
        System.out.println(spiralMatrixIII(5, 6, 1, 4));
    }

}
