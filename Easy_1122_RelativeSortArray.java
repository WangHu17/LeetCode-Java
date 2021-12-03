/**
 * @author wanghu
 * @discrption： 给定两个数组 arr1 和 arr2，arr2 的元素是不同的，并且 arr2 中的所有元素也在 arr1 中。
 * 对 arr1 的元素进行排序，使得 arr1 中项目的相对顺序与 arr2 中的相同。没有出现在 arr2 中的元素应按升序放置在 arr1 的末尾。
 * <p>
 * Example 1:
 * Input: arr1 = [2,3,1,3,2,4,6,7,9,2,19], arr2 = [2,1,4,3,9,6]
 * Output: [2,2,2,1,4,3,3,9,6,7,19]
 * @create 2021-11-23 10:51
 */
public class Easy_1122_RelativeSortArray {

    // 我的方法：用count数组保存arr1中的元素个数，然后遍历arr2将count数组中的对应元素添加到目标数组中，
    //          最后遍历count数组将剩余元素添加到目标数组中
    //Runtime: 0 ms, faster than 100.00% of Java online submissions for Relative Sort Array.
    //Memory Usage: 39.4 MB, less than 24.31% of Java online submissions for Relative Sort Array.
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int max = arr1[0];
        for (int i : arr1) {
            max = Math.max(max, i);
        }
        int[] count = new int[max+1];
        int[] res = new int[arr1.length];
        for (int i : arr1) {
            count[i]++;
        }
        int j = 0;
        for (int i : arr2) {
            while (count[i] > 0) {
                res[j++] = i;
                count[i]--;
            }
        }
        for (int i = 0; i < max; i++) {
            while (count[i] > 0) {
                res[j++] = i;
                count[i]--;
            }
        }
        return res;
    }

}
