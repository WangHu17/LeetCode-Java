/**
 * @author wanghu
 * @discrption： 给定一个长度为 n 的整数数组高度。绘制了n条垂直线，使得第i条线的两个端点是（i，0）和（i，height[i]）。
 * 找出与 x 轴一起形成一个容器的两条线，使得该容器包含最多的水。 返回容器可以存储的最大水量。
 * @create 2021-12-30 11:14
 */
public class Medium_11_ContainerWithMostWater {

    //Runtime: 2 ms, faster than 98.29% of Java online submissions for Container With Most Water.
    //Memory Usage: 52.4 MB, less than 91.46% of Java online submissions for Container With Most Water.
    public int maxArea(int[] height) {
        int left = 0, right = height.length - 1, max = 0, width;
        while (left < right) {
            width = right - left;
            if (height[left] > height[right]) {
                max = Math.max(max, width * height[right]);
                right--;
            } else {
                max = Math.max(max, width * height[left]);
                left++;
            }
        }
        return max;
    }

}
