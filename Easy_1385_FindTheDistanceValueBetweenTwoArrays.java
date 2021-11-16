import java.util.Arrays;

/**
 * @author wanghu
 * @discrption： 给定两个整数数组 arr1 和 arr2 以及整数 d，返回两个数组之间的距离值。
 * 距离值定义为元素 arr1[i] 的数量，这样就没有任何元素 arr2[j] 其中 |arr1[i]-arr2[j]| <= d。
 * @create 2021-11-16 9:46
 */
public class Easy_1385_FindTheDistanceValueBetweenTwoArrays {

    // 方法：二分搜索，遍历arr1中的值，找出arr2中与这些值差最小的值，如果差大于d则结果加1
    //Runtime: 3 ms, faster than 79.35% of Java online submissions for Find the Distance Value Between Two Arrays.
    //Memory Usage: 38.4 MB, less than 91.09% of Java online submissions for Find the Distance Value Between Two Arrays.
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        Arrays.sort(arr2);
        int count = 0;
        for (int i : arr1) {
            int c = binarySearch(i, arr2);
            if (Math.abs(i - c) > d) count++;
        }
        return count;
    }

    public int binarySearch(int n, int[] arr) {
        int left = 0, right = arr.length - 1, res = Integer.MAX_VALUE;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == n) return arr[mid];
            else if (arr[mid] > n) right = mid - 1;
            else left = mid + 1;
            res = Math.abs(n - arr[mid]) < Math.abs(n - res) ? arr[mid] : res;
        }
        return res;
    }

}
