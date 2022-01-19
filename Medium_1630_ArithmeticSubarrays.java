import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author wanghu
 * @discrption： 判断数组的子序列是否可以重组为等差数列
 * @create 2022-01-19 15:13
 */
public class Medium_1630_ArithmeticSubarrays {

    //我的方法
    //Runtime: 14 ms, faster than 93.26% of Java online submissions for Arithmetic Subarrays.
    //Memory Usage: 40.1 MB, less than 42.23% of Java online submissions for Arithmetic Subarrays.
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        ArrayList<Boolean> res = new ArrayList<>();
        for (int i = 0; i < l.length; i++) {
            int[] arr = new int[r[i] - l[i] + 1];
            int m = 0;
            for (int j = l[i]; j <= r[i]; j++) {
                arr[m++] = nums[j];
            }
            res.add(isArithmetic(arr));
        }
        return res;
    }

    private Boolean isArithmetic(int[] arr) {
        Arrays.sort(arr);
        int k = arr[1] - arr[0];
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] - arr[i - 1] != k) return false;
        }
        return true;
    }

}
