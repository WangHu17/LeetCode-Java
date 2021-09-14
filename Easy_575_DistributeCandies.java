import java.util.HashSet;

/**
 * @author wanghu
 * @discrption： 求数组的一半中最多有多少种不同的数
 * @create 2021-09-14 9:37
 */
public class Easy_575_DistributeCandies {

    //我的方法：用set
    //Runtime: 57 ms, faster than 16.74% of Java online submissions for Distribute Candies.
    //Memory Usage: 114.3 MB, less than 12.49% of Java online submissions for Distribute Candies.
    public int distributeCandies(int[] candyType) {
        HashSet<Integer> set = new HashSet<>();
        for (int candy : candyType) {
            set.add(candy);
        }
        int len = candyType.length / 2;
        return Math.min(set.size(), len);
    }

}
