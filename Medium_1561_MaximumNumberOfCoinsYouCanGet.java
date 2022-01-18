import java.util.Arrays;

/**
 * @author wanghu
 * @discrption： 有 3n 堆数目不一的硬币，你和你的朋友们打算按以下方式分硬币：
 *
 * 每一轮中，你将会选出 任意 3 堆硬币（不一定连续）。
 * Alice 将会取走硬币数量最多的那一堆。
 * 你将会取走硬币数量第二多的那一堆。
 * Bob 将会取走最后一堆。
 * 重复这个过程，直到没有更多硬币。
 * 给你一个整数数组 piles ，其中 piles[i] 是第 i 堆中硬币的数目。
 *
 * 返回你可以获得的最大硬币数目。
 * @create 2022-01-18 18:42
 */
public class Medium_1561_MaximumNumberOfCoinsYouCanGet {

    //我的方法：先排序，每次选最小的一个和最大的两个
    //Runtime: 24 ms, faster than 97.89% of Java online submissions for Maximum Number of Coins You Can Get.
    //Memory Usage: 48.3 MB, less than 84.41% of Java online submissions for Maximum Number of Coins You Can Get.
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int i = 0, j = piles.length - 1, sum = 0;
        while (i < j) {
            j--;
            sum += piles[j];
            j--;
            i++;
        }
        return sum;
    }

}
