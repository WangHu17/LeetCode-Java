/**
 * @author wanghu
 * @discrption： 求数组中的幸运值（值与个数相同的元素），如果有返回最大的幸运值，没有返回-1
 * @create 2021-12-23 10:31
 */
public class Easy_1394_FindLuckyIntegerInAnArray {

    //我的方法
    //Runtime: 1 ms, faster than 99.65% of Java online submissions for Find Lucky Integer in an Array.
    //Memory Usage: 38.7 MB, less than 64.71% of Java online submissions for Find Lucky Integer in an Array.
    public int findLucky(int[] arr) {
        int[] count = new int[501];
        for (int n : arr) count[n]++;
        int res = -1;
        for (int i = 1; i < 501; i++) {
            if (i == count[i]) res = i;
        }
        return res;
    }

}
