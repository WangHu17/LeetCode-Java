import org.junit.Test;

/**
 * @author wanghu
 * @discrption： 你有一个很长的花坛，其中一些地块种了，一些没有。但是，不能在相邻的地块中种植花卉。
 * 给定一个包含 0 和 1 的整数数组花坛，其中 0 表示空，1 表示不空，以及一个整数 n，
 * 如果可以在不违反无相邻花规则的情况下在花坛中种植 n 朵新花，则返回true。
 * @create 2021-09-15 11:41
 */
public class Easy_605_CanPlaceFlowers {

    //Runtime: 1 ms, faster than 89.89% of Java online submissions for Can Place Flowers.
    //Memory Usage: 40.6 MB, less than 58.45% of Java online submissions for Can Place Flowers.
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int sum = 0;
        if (n == 0) return true;
        int len = flowerbed.length;
        if (len == 1 && n == 1) {
            return flowerbed[0] == 0;
        }
        if (flowerbed[0] == 0 && flowerbed[1] == 0) {
            sum++;
            flowerbed[0] = 1;
        }
        for (int i = 1; i < len - 1; i++) {
            if (flowerbed[i - 1] == 0 && flowerbed[i] == 0 && flowerbed[i + 1] == 0) {
                sum++;
                flowerbed[i] = 1;
            }
        }
        if (flowerbed[len - 2] == 0 && flowerbed[len - 1] == 0) sum++;
        return sum >= n;
    }

    @Test
    public void test() {
        int[] ints = {1, 0, 0, 0, 0, 1};
        System.out.println(canPlaceFlowers(ints, 2));
    }

}
