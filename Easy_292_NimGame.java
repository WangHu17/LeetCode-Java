/**
 * @author wanghu
 * @discrption： 您正在和您的朋友玩以下 Nim 游戏：
 * 最初，桌子上有一堆石头。
 * 你和你的朋友轮流轮流，你先走。
 * 每回合，轮到的人会从堆中取出 1 到 3 块石头。
 * 移走最后一块石头的人是赢家。
 * @create 2021-08-26 10:58
 */
public class Easy_292_NimGame {

    //思路：
    //设甲乙一人一次为一轮。进行了很多轮之后，让甲选的时候，如果是1，2，3那就可以通过。
    //如果是4一定不能赢，所以如果是5，6，7可以想办法分别取1，2，3让乙来一定不能赢，所以5，6，7甲是可以赢的。
    //如果是8，则无论甲选任何个数，都能让乙来面临7，6，5这些必赢的选项所以甲一定输。
    //如果是9，10，11，则甲可以通过让乙来面临8来一定输。
    //如果是12，则甲无论选取任何个数，都能让乙面临9，10，11这样的一定可以赢的数字，所以12让甲必定输。
    //以此类推发现规律，在4或者4的倍数的时候，甲无论怎样一定输。

    //Runtime: 0 ms, faster than 100.00% of Java online submissions for Nim Game.
    //Memory Usage: 37.8 MB, less than 5.39% of Java online submissions for Nim Game.
    public boolean canWinNim(int n) {
        return n % 4 == 0;
    }

}
