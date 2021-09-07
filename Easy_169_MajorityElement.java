import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author wanghu
 * @discrption： 找出数组中相同个数最多的元素(超过总数的一半)
 * @create 2021-09-07 10:45
 */
public class Easy_169_MajorityElement {

    //我的方法：用map
    //Runtime: 14 ms, faster than 13.17% of Java online submissions for Majority Element.
    //Memory Usage: 53.5 MB, less than 23.83% of Java online submissions for Majority Element.
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }
        int max = 0, res = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                res = entry.getKey();
            }
        }
        return res;
    }

    //方法二：先排序，中间的数就是结果
    //Runtime: 3 ms, faster than 50.79% of Java online submissions for Majority Element.
    //Memory Usage: 54.5 MB, less than 7.65% of Java online submissions for Majority Element.
    public int majorityElement1(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }

}
