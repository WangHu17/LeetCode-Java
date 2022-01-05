import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author wanghu
 * @discrption： 给定一个整数数组 nums，返回所有的三元组 [nums[i], nums[j], nums[k]] 使得
 * i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0。 请注意，解决方案集不得包含重复的三元组。
 * @create 2021-12-30 15:28
 */
public class Medium_15_3Sum {

    //Runtime: 19 ms, faster than 79.09% of Java online submissions for 3Sum.
    //Memory Usage: 42.4 MB, less than 96.00% of Java online submissions for 3Sum.
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums.length < 3) return res;
        Arrays.sort(nums);
        if (nums[0] > 0) return res;
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int left = i + 1, right = nums.length - 1, target = -nums[i];
            while (left < right) {
                if (nums[left] + nums[right] == target) {
                    res.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    while (left < right && nums[left] == nums[left + 1]) left++;
                    while (left < right && nums[right] == nums[right - 1]) right--;
                    left++;
                    right--;
                } else if (nums[left] + nums[right] > target)
                    right--;
                else left++;
            }
        }
        return res;
    }

}
