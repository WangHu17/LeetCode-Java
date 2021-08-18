import java.util.Arrays;
import java.util.HashSet;

/**
 * @author wanghu
 * @discrption： 判断数组中是否有重复的元素
 * @create 2021-08-18 9:16
 */
public class Easy_217_ContainsDuplicate {

    //我的方法：用set
    //Runtime: 4 ms, faster than 80.33% of Java online submissions for Contains Duplicate.
    //Memory Usage: 43.2 MB, less than 66.82% of Java online submissions for Contains Duplicate.
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (!set.add(nums[i])) {
                return true;
            }
        }
        return false;
    }

    //方法二：先排序，再依次比较相邻的元素是否相等
    //Runtime: 3 ms, faster than 99.76% of Java online submissions for Contains Duplicate.
    //Memory Usage: 41.9 MB, less than 96.47% of Java online submissions for Contains Duplicate.
    public boolean containsDuplicate1(int[] nums) {
        Arrays.sort(nums);
        int i = 0, j = 1;
        while (j < nums.length) {
            if (nums[i] == nums[j]) {
                return true;
            }
            i++;
            j++;
        }
        return false;
    }

}
