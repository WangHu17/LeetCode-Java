/**
 * @author wanghu
 * @discrption： 给定一个整数 n。长度为 n + 1 的 0 索引整数数组 nums 以下列方式生成：
 * nums[0] = 0
 * nums[1] = 1
 * nums[2 * i] = nums[i] 当 2 <= 2 * i <= n
 * nums[2 * i + 1] = nums[i] + nums[i + 1] 当 2 <= 2 * i + 1 <= n
 * 返回数组 nums 中的最大整数 。
 * @create 2021-11-02 11:16
 */
public class Easy_1646_GetMaximumInGeneratedArray {

    // 我的方法
    //Runtime: 0 ms, faster than 100.00% of Java online submissions for Get Maximum in Generated Array.
    //Memory Usage: 35.8 MB, less than 66.95% of Java online submissions for Get Maximum in Generated Array.
    public int getMaximumGenerated(int n) {
        if (n == 0)return 0;
        if (n == 1)return 1;
        int[] nums = new int[n + 1];
        nums[0] = 0;
        nums[1] = 1;
        int max = 1;
        for (int i = 2; i <= n; i++) {
            if (i % 2 == 0) {
                nums[i] = nums[i / 2];
            } else {
                nums[i] = nums[i / 2] + nums[i / 2 + 1];
            }
            max = Math.max(max, nums[i]);
        }
        return max;
    }

}
