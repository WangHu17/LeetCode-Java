import java.util.Arrays;

/**
 * @author wanghu
 * @discrption： 给一个数组，每次将数组中n-1个元素加1，用最少的次数使得数组的元素都一样
 * @create 2021-09-09 9:21
 */
public class Easy_453_MinimumMovesToEqualArrayElements {

    //方法（柳婼）：每次将数组中n-1个元素加1，即每次将数组中的一个元素减1，最后要使得元素都一样，
    //             就要以最小的元素为准，每次把其他的一个元素减一，所以需要的次数就为其他元素与最小元素的差之和
    //Runtime: 17 ms, faster than 5.11% of Java online submissions for Minimum Moves to Equal Array Elements.
    //Memory Usage: 52.5 MB, less than 5.98% of Java online submissions for Minimum Moves to Equal Array Elements.
    public int minMoves(int[] nums) {
        Arrays.sort(nums);
        int min = nums[0];
        int sum = 0;
        for (int num:nums) {
            sum += num - min;
        }
        return sum;
    }

    //Runtime: 1 ms, faster than 100.00% of Java online submissions for Minimum Moves to Equal Array Elements.
    //Memory Usage: 39 MB, less than 97.91% of Java online submissions for Minimum Moves to Equal Array Elements.
    public int minMoves1(int[] nums) {
        int n = nums.length;
        if (n < 2) {
            return 0;
        }

        int sum = nums[0];
        int min = nums[0];
        for (int i = 1; i < n; i++) {
            min = Math.min(min, nums[i]);
            sum += nums[i];
        }

        return sum - n * min;
    }

}
