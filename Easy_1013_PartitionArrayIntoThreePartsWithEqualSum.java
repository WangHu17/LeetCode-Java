/**
 * @author wanghu
 * @discrption：
 * 给定一个整数数组 arr，如果我们可以将数组分成三个具有相等和的非空部分，则返回 true。
 * @create 2021-10-12 11:08
 */
public class Easy_1013_PartitionArrayIntoThreePartsWithEqualSum {

    //我的方法：先计算总和，判断是否能被3整除，如果能，再依次求片段和等于1/3总和的片段个数，>=3则满足
    //Runtime: 1 ms, faster than 100.00% of Java online submissions for Partition Array Into Three Parts With Equal Sum.
    //Memory Usage: 46.4 MB, less than 89.64% of Java online submissions for Partition Array Into Three Parts With Equal Sum.
    public boolean canThreePartsEqualSum(int[] arr) {
        int sum = 0;
        for (int n : arr) {
            sum += n;
        }
        int part = sum / 3;
        if (part * 3 != sum) return false;
        int cur = 0, cnt = 0;
        for (int n : arr) {
            cur += n;
            if (cur == part) {
                cur = 0;
                cnt++;
            }
        }
        return cnt >= 3;
    }

}
