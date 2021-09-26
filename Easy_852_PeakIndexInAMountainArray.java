/**
 * @author wanghu
 * @discrption： 找数组峰值
 * @create 2021-09-26 9:58
 */
public class Easy_852_PeakIndexInAMountainArray {

    //Runtime: 0 ms, faster than 100.00% of Java online submissions for Peak Index in a Mountain Array.
    //Memory Usage: 43.5 MB, less than 15.54% of Java online submissions for Peak Index in a Mountain Array.
    public int peakIndexInMountainArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[i + 1]) return i;
        }
        return -1;
    }

}
