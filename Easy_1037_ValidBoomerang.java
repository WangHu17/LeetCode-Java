/**
 * @author wanghu
 * @discrption： 给定一个数组点，其中 points[i] = [xi, yi] 表示 X-Y 平面上的一个点，如果这些点是回旋镖，则返回 true。
 * 回旋镖是一组三个不同的点，它们都不在一条直线上
 * @create 2021-11-09 9:30
 */
public class Easy_1037_ValidBoomerang {

    // 我的方法：先判断特殊情况（三点一线和两点重合），再判断两两点的斜率是否相等
    //Runtime: 0 ms, faster than 100.00% of Java online submissions for Valid Boomerang.
    //Memory Usage: 36.3 MB, less than 93.48% of Java online submissions for Valid Boomerang.
    public boolean isBoomerang(int[][] points) {
        if (points[0][0] == points[1][0] && points[1][0] == points[2][0]) return false;
        if (points[0][1] == points[1][1] && points[1][1] == points[2][1]) return false;
        if (points[0][0] == points[1][0] && points[0][1] == points[1][1]) return false;
        if (points[0][0] == points[2][0] && points[0][1] == points[2][1]) return false;
        if (points[1][0] == points[2][0] && points[1][1] == points[2][1]) return false;
        double k1 = 0.0, k2 = 0.0;
        int x1 = points[1][0] - points[0][0], y1 = points[1][1] - points[0][1];
        if (x1 == 0) {
            k1 = Integer.MAX_VALUE;
        } else {
            k1 = (double) y1 / x1;
        }
        int x2 = points[2][0] - points[1][0], y2 = points[2][1] - points[1][1];
        if (x2 == 0) {
            k2 = Integer.MAX_VALUE;
        } else {
            k2 = (double) y2 / x2;
        }
        return k1 != k2;
    }

}
