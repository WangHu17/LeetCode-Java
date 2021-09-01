import java.util.HashMap;

/**
 * @author wanghu
 * @discrption： 给定一个整数数组 nums 和一个整数目标，返回两个数字的索引，使它们相加为目标。
 * @create 2021-09-01 9:41
 */
public class Easy_1_TwoSum {

    //方法一：暴力
    //Runtime: 98 ms, faster than 7.72% of Java online submissions for Two Sum.
    //Memory Usage: 42.1 MB, less than 9.44% of Java online submissions for Two Sum.
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    res[0] = i;
                    res[1] = j;
                    return res;
                }
            }
        }
        return res;
    }

    //方法二：使用map，key保存值，value保存索引
    //Runtime: 1 ms, faster than 99.62% of Java online submissions for Two Sum.
    //Memory Usage: 39.1 MB, less than 64.88% of Java online submissions for Two Sum.
    public int[] twoSum1(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{i, map.get(target - nums[i])};
            }
            map.put(nums[i], i);
        }
        return null;
    }

}
