import java.util.HashSet;

/**
 * @author wanghu
 * @discrption： Alice 和 Bob 的糖果总数不同。
 * 给定两个整数数组 aliceSizes 和 bobSizes，其中 aliceSizes[i] 是 Alice 拥有的第 i 盒糖果的糖果数量，
 * 而 bobSizes[j] 是 Bob 拥有的第 j 盒糖果的糖果数量。
 * 既然是朋友，他们就想各自交换一个糖果盒，这样交换后两人的糖果总量是一样的。
 * 一个人拥有的糖果总量是他们拥有的每个盒子中糖果数量的总和。
 * 返回一个整数数组 answer，其中 answer[0] 是 Alice 必须交换的盒子中的糖果数量，
 * answer[1] 是 Bob 必须交换的盒子中的糖果数量。
 * 如果有多个答案，您可以返回其中任何一个。
 * 保证至少存在一个答案。
 * @create 2021-09-27 11:37
 */
public class Easy_888_FairCandySwap {

    //方法：数学公式：Sa - x + y = Sb - y + x => y = x + (Sb - Sa)/2
    //Runtime: 8 ms, faster than 93.75% of Java online submissions for Fair Candy Swap.
    //Memory Usage: 40.6 MB, less than 70.92% of Java online submissions for Fair Candy Swap.
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int Sa = 0, Sb = 0;
        for (int a : aliceSizes) Sa += a;
        for (int b : bobSizes) Sb += b;
        HashSet<Integer> set = new HashSet<>();
        for (int b : bobSizes) set.add(b);
        for (int a : aliceSizes) {
            if (set.contains(a + (Sb - Sa) / 2)) {
                return new int[]{a, a + (Sb - Sa) / 2};
            }
        }
        return null;
    }

}
