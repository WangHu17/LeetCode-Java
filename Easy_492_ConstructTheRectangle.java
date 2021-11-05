/**
 * @author wanghu
 * @discrption： Web 开发人员需要知道如何设计网页的大小。所以，给定一个特定的矩形网页区域，
 * 你现在的工作是设计一个矩形网页，其长度 L 和宽度 W 满足以下要求：
 * 您设计的矩形网页的面积必须等于给定的目标面积。
 * 宽度W不应大于长度L，即L>=W。
 * 长度 L 和宽度 W 之间的差异应尽可能小。
 * 返回一个数组 [L, W]，其中 L 和 W 是您按顺序设计的网页的长度和宽度。
 * @create 2021-11-05 10:15
 */
public class Easy_492_ConstructTheRectangle {

    // 我的方法：从给定面积的平方根开始往下遍历，最先可以除尽面积的就是宽
    //Runtime: 0 ms, faster than 100.00% of Java online submissions for Construct the Rectangle.
    //Memory Usage: 36.4 MB, less than 78.09% of Java online submissions for Construct the Rectangle.
    public int[] constructRectangle(int area) {
        for (int i = (int)Math.sqrt(area); i > 0; i--) {
            if (area % i == 0) return new int[]{area / i, i};
        }
        return null;
    }

}
