/**
 * @author wanghu
 * @discrption： 给定一个二进制数组 nums，返回数组中连续 1 的最大数目。
 * @create 2021-09-10 9:13
 */
public class Easy_485_MaxConsecutiveOnes {

    //我的方法
    //Runtime: 1 ms, faster than 100.00% of Java online submissions for Max Consecutive Ones.
    //Memory Usage: 40.1 MB, less than 89.98% of Java online submissions for Max Consecutive Ones.
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0, cur = 0;
        for (int num:nums) {
            if (num==1){
                cur++;
            }else {
                if (cur > max) {
                    max = cur;
                }
                cur = 0;
            }
        }
        if (cur != 0){
            if (cur > max) {
                max = cur;
            }
        }
        return max;
    }

}
