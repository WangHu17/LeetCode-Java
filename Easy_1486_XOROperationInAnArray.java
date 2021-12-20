/**
 * @author wanghu
 * @discrption： 给定一个整数 n 和一个整数开始。 定义一个数组 nums，其中 nums[i] = start + 2*i（0 索引）和 n == nums.length。
 * 返回 nums 的所有元素的按位异或。
 * @create 2021-12-20 10:20
 */
public class Easy_1486_XOROperationInAnArray {

    //我的方法
    //Runtime: 0 ms, faster than 100.00% of Java online submissions for XOR Operation in an Array.
    //Memory Usage: 35.6 MB, less than 79.82% of Java online submissions for XOR Operation in an Array.
    public int xorOperation(int n, int start) {
        int res = start, i = 1;
        while (n > 1) {
            res = res ^ (start + 2 * i);
            i++;
            n--;
        }
        return res;
    }

}
