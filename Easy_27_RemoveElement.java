/**
 * @author wanghu
 * @discrption： 给定一个整数数组 nums 和一个整数 val，就地删除 nums 中所有出现的 val。元素的相对顺序可以改变。
 * 由于在某些语言中无法更改数组的长度，因此您必须将结果放在数组 nums 的第一部分。
 * 更正式地说，如果删除重复项后有 k 个元素，则 nums 的前 k 个元素应保存最终结果。在前 k 个元素之外留下什么并不重要。
 * @create 2021-09-02 9:34
 */
public class Easy_27_RemoveElement {

    //我的方法
    //Runtime: 0 ms, faster than 100.00% of Java online submissions for Remove Element.
    //Memory Usage: 39.1 MB, less than 12.45% of Java online submissions for Remove Element.
    public int removeElement(int[] nums, int val) {
        int k = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] != val) {
                while (k < nums.length && nums[k] != val) k++;
                if (k < i) {
                    nums[k] = nums[i];
                } else {
                    return i + 1;
                }
            }
        }
        return 0;
    }

    //better方法
    //Runtime: 0 ms, faster than 100.00% of Java online submissions for Remove Element.
    //Memory Usage: 39.1 MB, less than 14.65% of Java online submissions for Remove Element.
    public int removeElement1(int[] nums, int val) {
        int i = 0;
        for (int j = 0; i < nums.length; i++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }

}
