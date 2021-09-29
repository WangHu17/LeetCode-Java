import java.util.HashMap;

/**
 * @author wanghu
 * @discrption： 在一副牌中，每张牌上都写有一个整数。
 * 当且仅当您可以选择 X >= 2 以便可以将整个牌组分成 1 组或多组卡片时才返回 true，
 * 其中： 每组正好有 X 张卡片。 每组中的所有牌都具有相同的整数。
 * @create 2021-09-29 9:42
 */
public class Easy_914_XOfAKindInADeckOfCards {

    //方法：最大公约数
    //Runtime: 2 ms, faster than 98.87% of Java online submissions for X of a Kind in a Deck of Cards.
    //Memory Usage: 39.1 MB, less than 73.52% of Java online submissions for X of a Kind in a Deck of Cards.
    public boolean hasGroupsSizeX(int[] deck) {
        int[] count = new int[10000];
        for (int c : deck) {
            count[c]++;
        }
        int g = -1;
        for (int n : count) {
            if (n > 0) {
                if (g == -1)
                    g = n;
                else
                    g = gcd(g, n);
            }
        }
        return g >= 2;
    }

    private int gcd(int g, int n) {
        return g == 0 ? n : gcd(n % g, g);
    }

}
