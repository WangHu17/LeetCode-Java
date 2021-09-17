import java.util.Collections;
import java.util.HashMap;

/**
 * @author wanghu
 * @discrption： 给定一个由非负整数 nums 组成的非空数组，该数组的度数定义为其任何一个元素的最大频率。
 * 您的任务是找到与 nums 具有相同度数的 nums（连续）子数组的最小可能长度。
 * @create 2021-09-17 11:07
 */
public class Easy_697_DegreeOfAnArray {

    //方法：用3个map，一个left保存元素最左边的位置，一个right保存元素最右边的位置，一个count记录元素的个数，然后找出最多的元素中距离最小的
    //Runtime: 31 ms, faster than 25.32% of Java online submissions for Degree of an Array.
    //Memory Usage: 50 MB, less than 25.66% of Java online submissions for Degree of an Array.
    public int findShortestSubArray(int[] nums) {
        HashMap<Integer, Integer> left = new HashMap<>(), right = new HashMap<>(), count = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (!left.containsKey(num)) left.put(num, i);
            right.put(num, i);
            count.put(num, count.getOrDefault(num, 0) + 1);
        }
        int res = nums.length;
        int max = Collections.max(count.values());
        for (Integer key : count.keySet()) {
            if (count.get(key) == max)
                res = Math.min(res, right.get(key) - left.get(key) + 1);
        }
        return res;
    }

    //我的方法：错误（未考虑多个元素个数一样的情况）
    public int findShortestSubArray1(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int max = 0, maxNum = 0;
        for (Integer key : map.keySet()) {
            if (max < map.get(key)) {
                max = map.get(key);
                maxNum = key;
            }
        }
        int begin = 0, end = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == maxNum) {
                begin = i;
                break;
            }
        }
        for (int j = nums.length - 1; j >= 0; j--) {
            if (nums[j] == maxNum) {
                end = j;
                break;
            }
        }
        return end - begin;
    }

}
