/**
 * @author wanghu
 * @discrption： 合并两个排好序的数组到数组一
 * @create 2021-09-06 9:40
 */
public class Easy_88_MergeSortedArray {

    //方法（柳婼）：两个数组从后往前遍历，依次比较两数组的元素，谁大就把它赋值到后面为0的对应位置上
    //Runtime: 0 ms, faster than 100.00% of Java online submissions for Merge Sorted Array.
    //Memory Usage: 39.1 MB, less than 52.48% of Java online submissions for Merge Sorted Array.
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int index = m + n - 1;
        int index1 = m - 1;
        int index2 = n - 1;
        while (index1 >= 0 && index2 >= 0) {
            if (nums1[index1] > nums2[index2]) {
                nums1[index--] = nums1[index1--];
            } else {
                nums1[index--] = nums2[index2--];
            }
        }
        while (index2 >= 0) {
            nums1[index--] = nums2[index2--];
        }
    }

}
