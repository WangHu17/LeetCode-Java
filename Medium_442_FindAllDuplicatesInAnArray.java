import java.util.ArrayList;
import java.util.List;

/**
 * @author wanghu
 * @discrption： 给你一个长度为 n 的整数数组 nums ，其中 nums 的所有整数都在范围 [1, n] 内，
 * 且每个整数出现 一次 或 两次 。请你找出所有出现 两次 的整数，并以数组形式返回。
 * 你必须设计并实现一个时间复杂度为 O(n) 且仅使用常量额外空间的算法解决此问题。
 * @create 2022-01-28 16:07
 */
public class Medium_442_FindAllDuplicatesInAnArray {

    //我的方法：使用数组记录已经遍历过的元素
    //Runtime: 3 ms, faster than 100.00% of Java online submissions for Find All Duplicates in an Array.
    //Memory Usage: 50.5 MB, less than 51.05% of Java online submissions for Find All Duplicates in an Array.
    public List<Integer> findDuplicates(int[] nums) {
        int len = nums.length;
        int[] count = new int[len];
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            if (count[nums[i] - 1] != 0) res.add(nums[i]);
            count[nums[i] - 1] = 1;
        }
        return res;
    }

}
