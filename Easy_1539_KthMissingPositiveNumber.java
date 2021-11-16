import org.junit.Test;

/**
 * @author wanghu
 * @discrption： 给定一个按严格递增顺序排序的正整数数组 arr 和一个整数 k。 查找此数组中缺少的第 k 个正整数。
 * @create 2021-11-16 10:33
 */
public class Easy_1539_KthMissingPositiveNumber {

    // 我的方法：边遍历边比较
    //Runtime: 0 ms, faster than 100.00% of Java online submissions for Kth Missing Positive Number.
    //Memory Usage: 38.6 MB, less than 67.17% of Java online submissions for Kth Missing Positive Number.
    public int findKthPositive(int[] arr, int k) {
        int i = 0, n = 1, count = 0;
        while (count < k && i < arr.length) {
            if (arr[i] != n) {
                count++;
            } else {
                i++;
            }
            n++;
        }
        if (count < k) n += k - count - 1;
        return n;
    }

    @Test
    public void test(){
        int[] test = {2, 3, 4, 7, 11};
        int k=5;
        System.out.println(findKthPositive(test,k));
    }

}
