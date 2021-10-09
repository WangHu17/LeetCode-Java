import java.util.HashSet;

/**
 * @author wanghu
 * @discrption：
 * 您将获得一个具有以下属性的整数数组 nums：
 *      nums.length == 2 * n。
 *      nums 包含 n + 1 个唯一元素。
 *      nums 中的一个元素被重复 n 次。
 * 返回重复 n 次的元素。
 * @create 2021-10-09 9:28
 */
public class Easy_961_NRepeatedElementInSize2NArray {

    //我的方法:用set
    //Runtime: 0 ms, faster than 100.00% of Java online submissions for N-Repeated Element in Size 2N Array.
    //Memory Usage: 39.9 MB, less than 67.60% of Java online submissions for N-Repeated Element in Size 2N Array.
    public int repeatedNTimes(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.add(num)) {
                return num;
            }
        }
        return -1;
    }

}
