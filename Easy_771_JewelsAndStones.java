/**
 * @author wanghu
 * @discrption： 您将获得代表宝石类型的宝石串，以及代表您拥有的宝石的宝石。
 * 石头中的每个角色都是您拥有的一种石头。你想知道你有多少石头也是珠宝。字母区分大小写，因此“a”被认为与“A”不同。
 * @create 2021-10-26 10:16
 */
public class Easy_771_JewelsAndStones {

    // 我的方法：用 indexOf
    //Runtime: 1 ms, faster than 82.16% of Java online submissions for Jewels and Stones.
    //Memory Usage: 38.7 MB, less than 50.64% of Java online submissions for Jewels and Stones.
    public int numJewelsInStones(String jewels, String stones) {
        int sum = 0;
        for (char c : stones.toCharArray()) {
            if (jewels.indexOf(c) != -1)
                sum++;
        }
        return sum;
    }

}
