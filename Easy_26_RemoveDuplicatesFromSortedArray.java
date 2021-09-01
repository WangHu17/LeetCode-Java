/**
 * @author wanghu
 * @discrption： 给定一个按非递减顺序排序的整数数组 nums ，就地删除重复项，以便每个唯一元素只出现一次。元素的相对顺序应该保持不变。
 * 由于在某些语言中无法更改数组的长度，因此您必须将结果放在数组 nums 的第一部分。更正式地，如果删除重复项后有 k 个元素，
 * 则 nums 的前 k 个元素应该保存最终结果。除了前 k 个元素之外，您留下什么并不重要。
 * @create 2021-09-01 11:17
 */
public class Easy_26_RemoveDuplicatesFromSortedArray {

    //Runtime: 1 ms, faster than 80.60% of Java online submissions for Remove Duplicates from Sorted Array.
    //Memory Usage: 40.5 MB, less than 50.01% of Java online submissions for Remove Duplicates from Sorted Array.
    public int removeDuplicates(int[] nums) {
        int df = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[df]){
                df++;
                nums[df] = nums[i];
            }
        }
        return df;
    }

}
