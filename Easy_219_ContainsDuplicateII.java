import java.util.HashMap;
import java.util.Queue;

/**
 * @author wanghu
 * @discrption： 判断数组中是否有两个相等元素的距离小于等于k
 * @create 2021-08-18 9:38
 */
public class Easy_219_ContainsDuplicateII {

    //我的方法：用map存下遍历到的元素及它的位置，当下次遍历到相同元素时，计算两元素的距离并与k比较，
    // 如果<=k，返回true，否则更新该元素位置，继续遍历，遍历完之后返回false
    //Runtime: 18 ms, faster than 53.02% of Java online submissions for Contains Duplicate II.
    //Memory Usage: 47.7 MB, less than 84.57% of Java online submissions for Contains Duplicate II.
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], i);
            } else {
                if (i - map.get(nums[i]) <= k) {
                    return true;
                } else {
                    map.replace(nums[i], i);
                }
            }
        }
        return false;
    }

}
