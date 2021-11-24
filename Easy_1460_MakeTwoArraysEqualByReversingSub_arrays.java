import java.util.Arrays;

/**
 * @author wanghu
 * @discrption： 给定两个等长的整数数组 target 和 arr。 一步，您可以选择arr的任何非空子数组并将其反转。
 * 您可以进行任意数量的步骤。 如果可以使 arr 等于目标，则返回 True，否则返回 False。
 *
 * Example 1:
 * Input: target = [1,2,3,4], arr = [2,4,1,3]
 * Output: true
 * @create 2021-11-24 11:43
 */
public class Easy_1460_MakeTwoArraysEqualByReversingSub_arrays {

    //我的方法：排序两个数组，然后遍历判断它们的元素是否全部相同
    //Runtime: 2 ms, faster than 87.33% of Java online submissions for Make Two Arrays Equal by Reversing Sub-arrays.
    //Memory Usage: 39.3 MB, less than 38.65% of Java online submissions for Make Two Arrays Equal by Reversing Sub-arrays.
    public boolean canBeEqual(int[] target, int[] arr) {
        Arrays.sort(target);
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (target[i] != arr[i]) return false;
        }
        return true;
    }

}
