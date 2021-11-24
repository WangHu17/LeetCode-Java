import java.util.Arrays;
import java.util.HashMap;

/**
 * @author wanghu
 * @discrption： 给定数组 nums，对于每个 nums[i] 找出数组中有多少个数字小于它。也就是说，对于每个 nums[i]，
 * 您必须计算有效 j 的数量，使得 j != i 和 nums[j] < nums[i]。 以数组形式返回答案。
 *
 * Example 1:
 * Input: nums = [8,1,2,2,3]
 * Output: [4,0,1,1,3]
 *
 * @create 2021-11-24 10:52
 */
public class Easy_1365_HowManyNumbersAreSmallerThanTheCurrentNumber {

    //我的方法：先复制一个该数组，然后排序，遍历排序的数组，将每个不同的元素及它的位置放入map集合中
    //Runtime: 2 ms, faster than 86.22% of Java online submissions for How Many Numbers Are Smaller Than the Current Number.
    //Memory Usage: 39.2 MB, less than 68.65% of Java online submissions for How Many Numbers Are Smaller Than the Current
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] copy = nums.clone();
        Arrays.sort(nums);
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(nums[0], 0);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                map.put(nums[i + 1], i + 1);
            }
        }
        int j = 0;
        for (int n : copy) {
            nums[j++] = map.get(n);
        }
        return nums;
    }

}
