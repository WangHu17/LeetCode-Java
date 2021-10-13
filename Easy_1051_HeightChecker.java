import java.util.Arrays;

/**
 * @author wanghu
 * @discrption： 一所学校正试图为所有学生拍一张年度照片。
 * 要求学生按身高不降序排成一行。
 * 让这个排序由整数数组 expected 表示，其中 expected[i] 是队列中第 i 个学生的预期高度。
 * 您将获得一个整数数组 heights，表示学生当前站立的顺序。
 * 每个 heights[i] 是一行中第 i 个学生的高度（0 索引）。
 * 返回其中 heights[i] != expected[i] 的索引数。
 * @create 2021-10-13 14:36
 */
public class Easy_1051_HeightChecker {

    //我的方法：拷贝数组，排序后对比
    //Runtime: 1 ms, faster than 86.92% of Java online submissions for Height Checker.
    //Memory Usage: 36.7 MB, less than 65.10% of Java online submissions for Height Checker.
    public int heightChecker(int[] heights) {
        int[] copy = heights.clone();
        Arrays.sort(copy);
        int sum = 0;
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != copy[i]) sum++;
        }
        return sum;
    }

}
