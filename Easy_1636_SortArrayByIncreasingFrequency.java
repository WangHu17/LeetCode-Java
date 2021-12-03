import java.util.Arrays;

/**
 * @author wanghu
 * @discrption： 给定一个整数数组 nums，根据值的频率按递增顺序对数组进行排序。如果多个值具有相同的频率，则按降序对它们进行排序。
 * 返回排序后的数组。
 * @create 2021-11-25 10:22
 */
public class Easy_1636_SortArrayByIncreasingFrequency {

    //我的方法
    //Runtime: 6 ms, faster than 64.21% of Java online submissions for Sort Array by Increasing Frequency.
    //Memory Usage: 41.2 MB, less than 26.48% of Java online submissions for Sort Array by Increasing Frequency.
    public int[] frequencySort(int[] nums) {
        Arrays.sort(nums);
        int cur = 1, i = 0, j = 0, len = 1;
        for (i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[i + 1]) len++;
        }
        int[][] count = new int[len][2];
        for (i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                cur++;
            } else {
                count[j][0] = nums[i];
                count[j][1] = cur;
                j++;
                cur = 1;
            }
        }
        count[j][0] = nums[i];
        count[j][1] = cur;
        Arrays.sort(count, (a, b) -> {
            if (a[1] != b[1]) return a[1] - b[1];
            else return b[0] - a[0];
        });
        int[] res = new int[nums.length];
        int m = 0;
        for (int k = 0; k <= j; k++) {
            while (count[k][1] > 0) {
                res[m++] = count[k][0];
                count[k][1]--;
            }
        }
        return res;
    }

}
