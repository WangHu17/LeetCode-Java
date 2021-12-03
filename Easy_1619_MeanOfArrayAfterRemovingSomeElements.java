import java.util.Arrays;

/**
 * @author wanghu
 * @discrption： 给定一个整数数组 arr，在去除最小的 5% 和最大的 5% 元素后返回剩余整数的平均值。 实际答案的 10-5 以内的答案将被视为已接受。
 * @create 2021-11-25 9:52
 */
public class Easy_1619_MeanOfArrayAfterRemovingSomeElements {

    //我的方法
    //Runtime: 2 ms, faster than 99.39% of Java online submissions for Mean of Array After Removing Some Elements.
    //Memory Usage: 38.8 MB, less than 95.35% of Java online submissions for Mean of Array After Removing Some Elements.
    public double trimMean(int[] arr) {
        int len = arr.length * 5 / 100, sum = 0;
        double mean = 0.0;
        Arrays.sort(arr);
        for (int i = len; i < arr.length - len; i++) {
            sum += arr[i];
        }
        return (double) sum / (arr.length - 2 * len);
    }

}
