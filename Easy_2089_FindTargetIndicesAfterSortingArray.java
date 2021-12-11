import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author wanghu
 * @discrption： 您将获得一个以 0 为索引的整数数组 nums 和一个目标元素 target。
 * 目标索引是一个索引 i 使得 nums[i] == target。 以非递减顺序对 nums 进行排序后，
 * 返回 nums 的目标索引列表。如果没有目标索引，则返回一个空列表。返回的列表必须按升序排序。
 * @create 2021-12-11 16:25
 */
public class Easy_2089_FindTargetIndicesAfterSortingArray {

    //方法三：不排序，先遍历求出比target小的元素个数count，再遍历当找到与target相等的元素时，向集合放入count++
    //Runtime: 0 ms, faster than 100.00% of Java online submissions for Find Target Indices After Sorting Array.
    //Memory Usage: 39.3 MB, less than 48.11% of Java online submissions for Find Target Indices After Sorting Array.
    public List<Integer> targetIndices2(int[] nums, int target) {
        ArrayList<Integer> list = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < target) count++;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) list.add(count++);
        }
        return list;
    }

    //我的方法：二分查找
    //Runtime: 1 ms, faster than 88.19% of Java online submissions for Find Target Indices After Sorting Array.
    //Memory Usage: 39.5 MB, less than 42.01% of Java online submissions for Find Target Indices After Sorting Array.
    public List<Integer> targetIndices(int[] nums, int target) {
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        int left = 0, right = nums.length - 1, index = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                index = mid;
                break;
            } else if (nums[mid] < target)
                left = mid + 1;
            else right = mid - 1;
        }
        if (index == -1) return list;
        int index1 = index;
        while (index1 >= 0 && nums[index1] == target) index1--;
        while (index < nums.length && nums[index] == target) index++;
        index1++;
        index--;
        while (index1 <= index) list.add(index1++);
        return list;
    }

    //我的方法二：遍历
    //Runtime: 2 ms, faster than 59.68% of Java online submissions for Find Target Indices After Sorting Array.
    //Memory Usage: 38.7 MB, less than 96.30% of Java online submissions for Find Target Indices After Sorting Array.
    public List<Integer> targetIndices1(int[] nums, int target) {
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) list.add(i);
        }
        return list;
    }

    @Test
    public void test() {
        int[] ints = {1, 2, 5, 2, 3};
        System.out.println(targetIndices(ints, 5));
    }

}
