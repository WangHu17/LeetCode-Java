import java.util.Arrays;

/**
 * @author wanghu
 * @discrption： 给定一个整数数组 arr。您必须按二进制表示中 1 的数量按升序对数组中的整数进行排序，
 * 如果两个或多个整数具有相同数量的 1，则必须按升序对它们进行排序。 返回排序后的数组。
 *
 * Example 1:
 * Input: arr = [0,1,2,3,4,5,6,7,8]
 * Output: [0,1,2,4,8,3,5,6,7]
 * Explantion: [0] is the only integer with 0 bits.
 * [1,2,4,8] all have 1 bit.
 * [3,5,6] have 2 bits.
 * [7] has 3 bits.
 * The sorted array by bits is [0,1,2,4,8,3,5,6,7]
 *
 * @create 2021-11-24 9:59
 */
public class Easy_1356_SortIntegersByTheNumberOf1Bits {

    //我的方法：将arr数组中的元素及元素的bit数放入一个二维数组中，然后排序二维数组
    //Runtime: 8 ms, faster than 61.73% of Java online submissions for Sort Integers by The Number of 1 Bits.
    //Memory Usage: 39.2 MB, less than 88.41% of Java online submissions for Sort Integers by The Number of 1 Bits.
    public int[] sortByBits(int[] arr) {
        int len = arr.length;
        int[][] map = new int[len][2];
        for (int i = 0; i < len; i++) {
            int bits = count(arr[i]);
            map[i][0] = bits;
            map[i][1] = arr[i];
        }
        Arrays.sort(map, (a, b) -> {
            if (a[0] != b[0]) return a[0] - b[0];
            else return a[1] - b[1];
        });
        int[] res = new int[len];
        for (int i = 0; i < len; i++) {
            res[i] = map[i][1];
        }
        return res;
    }

    public int count(int n) {
        int sum = 0;
        while (n != 0) {
            if (n % 2 == 1) sum++;
            n /= 2;
        }
        return sum;
    }

}
