import java.util.Arrays;

/**
 * @author wanghu
 * @discrption： 您被分配将一定数量的箱子放在一辆卡车上。给定一个二维数组 boxTypes，
 * 其中 boxTypes[i] = [numberOfBoxesi, numberOfUnitsPerBoxi]： numberOfBoxesi 是类型 i 的盒子的数量。
 * numberOfUnitsPerBoxi 是类型 i 的每个框中的单元数。 您还将获得一个整数 truckSize，这是可以放在卡车上的最大箱子数。
 * 只要箱子的数量不超过卡车尺寸，您可以选择任何箱子放在卡车上。 返回可以放在卡车上的最大单位总数。
 * <p>
 * Example 1:
 * <p>
 * Input: boxTypes = [[1,3],[2,2],[3,1]], truckSize = 4
 * Output: 8
 * Explanation: There are:
 * - 1 box of the first type that contains 3 units.
 * - 2 boxes of the second type that contain 2 units each.
 * - 3 boxes of the third type that contain 1 unit each.
 * You can take all the boxes of the first and second types, and one box of the third type.
 * The total number of units will be = (1 * 3) + (2 * 2) + (1 * 1) = 8.
 * @create 2021-11-25 11:00
 */
public class Easy_1710_MaximumUnitsOnATruck {

    //我的方法
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (a, b) -> {
            return b[1] - a[1];
        });
        int sum = 0, cnt = 0;
        for (int i = 0; i < boxTypes.length; i++) {
            while (boxTypes[i][0] > 0) {
                sum += boxTypes[i][1];
                boxTypes[i][0]--;
                cnt++;
                if (cnt == truckSize) return sum;
            }
        }
        return sum;
    }

}
