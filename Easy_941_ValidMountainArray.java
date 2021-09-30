/**
 * @author wanghu
 * @discrption：
 * 给定一个整数数组 arr，当且仅当它是一个有效的山数组时才返回 true。
 * arr 是一个山数组，当且仅当：
 *      arr.length >= 3
 *      arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
 *      arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
 * @create 2021-09-30 11:36
 */
public class Easy_941_ValidMountainArray {

    //我的方法：计算递增的个数和递减的个数，如果都是递增或递减，返回false；如果递增+递减=总长度-1，返回true
    //Runtime: 1 ms, faster than 100.00% of Java online submissions for Valid Mountain Array.
    //Memory Usage: 39.9 MB, less than 82.19% of Java online submissions for Valid Mountain Array.
    public boolean validMountainArray(int[] arr) {
        int len1 = 0, len2 = 0, i;
        for (i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) len1++;
            else break;
        }
        for (int j = i; j < arr.length - 1; j++) {
            if (arr[j] > arr[j + 1]) len2++;
        }
        if (len1 == 0 || len2 == 0)return false;
        return len1 + len2 == arr.length - 1;
    }

}
