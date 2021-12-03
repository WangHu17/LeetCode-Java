/**
 * @author wanghu
 * @discrption： 轴对齐的矩形表示为一个列表 [x1, y1, x2, y2]，其中 (x1, y1) 是其左下角的坐标，(x2, y2) 是其右上角的坐标角落。
 * 它的上下边缘平行于X轴，左右边缘平行于Y轴。 如果它们的交点面积为正，则两个矩形重叠。需要明确的是，仅在角或边缘处接触的两个矩形不重叠。
 * 给定两个轴对齐的矩形 rec1 和 rec2，如果它们重叠则返回 true，否则返回 false。
 * @create 2021-11-08 14:07
 */
public class Easy_836_RectangleOverlap {

    // 方法：判断重叠区域的面积是否大于0，即判断两个矩形中较小的右上角的横纵坐标均大于较大的左下角的横纵坐标。即重叠区域的宽高都大于0
    //Runtime: 0 ms, faster than 100.00% of Java online submissions for Rectangle Overlap.
    //Memory Usage: 36.4 MB, less than 61.09% of Java online submissions for Rectangle Overlap.
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        return (Math.min(rec1[2],rec2[2]) > Math.max(rec1[0], rec2[0])) && (Math.min(rec1[3],rec2[3]) > Math.max(rec1[1],rec2[1]));
    }

}
