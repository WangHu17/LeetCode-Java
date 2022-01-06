import java.util.Arrays;

/**
 * @author wanghu
 * @discrption： 给定一个长度为 n 的整数数组 nums 和一个整数目标，在 nums 中找到三个整数，使之和最接近目标。
 * 返回三个整数的总和。 您可以假设每个输入都只有一个解决方案。
 * @create 2022-01-05 14:12
 */
public class Medium_16_3SumClosest {

    //我的方法
    //Runtime: 3 ms, faster than 98.52% of Java online submissions for 3Sum Closest.
    //Memory Usage: 39.2 MB, less than 28.06% of Java online submissions for 3Sum Closest.
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closet = Integer.MAX_VALUE, res = 0;
        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1, right = nums.length - 1;
            while (left<right){
                int cur = target - nums[i] - nums[left] - nums[right];
                if (cur == 0) {
                    return target;
                } else if (cur > 0) {
                    if (cur < closet){
                        closet = cur;
                        res = nums[i] + nums[left] + nums[right];
                    }
                    left++;
                } else {
                    if (-cur < closet){
                        closet = -cur;
                        res = nums[i] + nums[left] + nums[right];
                    }
                    right--;
                }
            }
        }
        return res;
    }

}
