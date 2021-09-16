import java.util.Arrays;

/**
 * @author wanghu
 * @discrption： 您有一组整数 s，它最初包含从 1 到 n 的所有数字。
 * 不幸的是，由于某些错误，s 中的一个数字与集合中的另一个数字重复，导致一个数字重复而另一个数字丢失。
 * 您将获得一个整数数组 nums ，表示该集合在出错后的数据状态。 找出出现两次的数字和缺失的数字，并以数组的形式返回它们。
 * @create 2021-09-16 10:25
 */
public class Easy_645_SetMismatch {

    //我的方法：用排序，但很慢
    //Runtime: 15 ms, faster than 15.06% of Java online submissions for Set Mismatch.
    //Memory Usage: 51.6 MB, less than 27.43% of Java online submissions for Set Mismatch.
    public int[] findErrorNums(int[] nums) {
        Arrays.sort(nums);
        int[] res = new int[2];
        int len = nums.length, sum = nums[len - 1];
        for (int i = 0; i < len - 1; i++) {
            sum += nums[i];
            if (nums[i] == nums[i + 1]) {
                res[0] = nums[i];
                break;
            }
        }
        res[1] = len * (len + 1) / 2 - sum + res[0];
        return res;
    }

    //方法二：用额外的数组
    //Runtime: 2 ms, faster than 88.41% of Java online submissions for Set Mismatch.
    //Memory Usage: 51.9 MB, less than 17.46% of Java online submissions for Set Mismatch.
    public int[] findErrorNums1(int[] nums) {
        int[] check = new int[nums.length+1];
        for (int num : nums) {
            check[num]++;
        }
        int[] res = new int[2];
        for (int i = 1; i < check.length; i++) {
            if (check[i] == 2) res[0] = i;
            if (check[i] == 0) res[1] = i;
        }
        return res;
    }

}
