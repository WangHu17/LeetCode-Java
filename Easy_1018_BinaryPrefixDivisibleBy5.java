import java.util.ArrayList;
import java.util.List;

/**
 * @author wanghu
 * @discrption：
 * 您将获得一个二进制数组 nums（0 索引）。
 * 我们将 xi 定义为二进制表示为子数组 nums[0..i]（从最高有效位到最低有效位）的数字。
 * 例如，如果 nums = [1,0,1]，则 x0 = 1、x1 = 2 和 x2 = 5。
 * 返回一个布尔值数组，如果 xi 可被 5 整除，则 answer[i] 为真。
 * @create 2021-10-12 11:42
 */
public class Easy_1018_BinaryPrefixDivisibleBy5 {

    //不明白为什么要取余
    //Runtime: 2 ms, faster than 100.00% of Java online submissions for Binary Prefix Divisible By 5.
    //Memory Usage: 39.2 MB, less than 96.36% of Java online submissions for Binary Prefix Divisible By 5.
    public List<Boolean> prefixesDivBy5(int[] nums) {
        ArrayList<Boolean> res = new ArrayList<>();
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = (sum * 2 + nums[i]) % 5;
            res.add(sum == 0);
        }
        return res;
    }

}
