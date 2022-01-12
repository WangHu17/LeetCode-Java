import java.util.Arrays;
import java.util.Comparator;

/**
 * @author wanghu
 * @discrption： 太简单了
 * @create 2022-01-12 15:42
 */
public class Medium_1637_WidestVerticalAreaBetweenTwoPointsContainingNoPoints {

    //改进：把二维数组的第一列放入一位数组并排序
    //Runtime: 12 ms, faster than 83.53% of Java online submissions for Widest Vertical Area Between Two Points Containing No Points.
    //Memory Usage: 67.7 MB, less than 77.49% of Java online submissions for Widest Vertical Area Between Two Points Containing No Points.
    public int maxWidthOfVerticalArea1(int[][] points) {
        int len = points.length;
        int[] x = new int[len];
        for (int i = 0; i < len; i++) x[i] = points[i][0];
        Arrays.sort(x);
        int max = 0;
        for (int i = 1; i < len; i++) max = Math.max(max, x[i] - x[i - 1]);
        return max;
    }

    //我的方法：二维数组排序
    public int maxWidthOfVerticalArea(int[][] points) {
        Arrays.sort(points, Comparator.comparingInt(a -> a[0]));
        int max = 0;
        for (int i = 1; i < points.length; i++) {
            max = Math.max(max, points[i][0] - points[i - 1][0]);
        }
        return max;
    }

}
