import org.junit.Test;

import java.util.*;

/**
 * @author wanghu
 * @discrption： 给定一个包含 n 个整数的数组 nums，其中 nums[i] 在范围 [1, n] 内，
 * 返回一个包含范围 [1, n] 内所有未出现在 nums 中的整数的数组。
 * @create 2021-09-08 11:23
 */
public class Easy_448_FindAllNumbersDisappearedInAnArray {

    //Runtime: 3 ms, faster than 100.00% of Java online submissions for Find All Numbers Disappeared in an Array.
    //Memory Usage: 48.4 MB, less than 36.34% of Java online submissions for Find All Numbers Disappeared in an Array.
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        int[] ints = new int[nums.length];
        for (int num : nums) {
            ints[num-1]++;
        }
        for (int i = 0; i < nums.length; i++) {
            if (ints[i] == 0) list.add(i+1);
        }
        return list;
    }

}
