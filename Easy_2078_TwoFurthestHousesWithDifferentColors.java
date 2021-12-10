/**
 * @author wanghu
 * @discrption： 街道上均匀地排列着n栋房屋，每栋房屋都粉刷得很漂亮。给定一个长度为 n 的 0 索引整数数组 colors，
 * 其中 colors[i] 表示第 i 个房子的颜色。 返回两个颜色不同的房子之间的最大距离。 第 i 宫和第 j 宫之间的距离是 abs(i - j)，
 * 其中 abs(x) 是 x 的绝对值。
 * @create 2021-12-10 14:32
 */
public class Easy_2078_TwoFurthestHousesWithDifferentColors {

    //我的方法：遍历两次，一次从后往前遍历找与第一个不同的颜色的位置，第二次从前往后遍历找与最后一个不同的颜色的位置，最后返回距离较远的答案（让我震惊系列）
    //Runtime: 0 ms, faster than 100.00% of Java online submissions for Two Furthest Houses With Different Colors.
    //Memory Usage: 37.1 MB, less than 64.42% of Java online submissions for Two Furthest Houses With Different Colors.
    public int maxDistance(int[] colors) {
        int i = 0, j = colors.length - 1;
        while (i < j) {
            if (colors[i] == colors[j])
                j--;
            else break;
        }
        int i1 = 0, j1 = colors.length - 1;
        while (i1 < j1) {
            if (colors[i1] == colors[j1])
                i1++;
            else break;
        }
        return Math.max(j - i, j1 - i1);
    }

}
