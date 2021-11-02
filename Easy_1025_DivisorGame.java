/**
 * @author wanghu
 * @discrption： Alice 和 Bob 轮流玩游戏，Alice 先开始。
 * 最初，黑板上有一个数字 n。在每个玩家的回合中，该玩家进行的移动包括：
 *      选择任何具有 0 < x < n 和 n % x == 0 的 x。
 *      用 n - x 替换黑板上的数字 n。
 * 此外，如果玩家不能移动，他们就会输掉比赛。 当且仅当 Alice 赢得游戏时返回 true，假设两个玩家都玩得最佳。
 * @create 2021-11-02 9:25
 */
public class Easy_1025_DivisorGame {

    // 方法：偶数会赢，奇数会输，为什么？使用数学归纳法，首先我们知道
    // N=1 输，N=2 赢，N=3 输，N=4 赢…
    // 如果N是奇数，奇数的约数只能是奇数，奇数减去奇数==偶数，对方拿到偶数-1，
    // 我又拿到奇数，偶数再-1又为奇数，所以拿到奇数必输
    // 如果N是偶数，我每次减1，让对方是奇数，必赢
    // Runtime: 0 ms, faster than 100.00% of Java online submissions for Divisor Game.
    // Memory Usage: 35.5 MB, less than 94.46% of Java online submissions for Divisor Game.
    public boolean divisorGame(int n) {
        return n % 2 == 0;
    }

}
