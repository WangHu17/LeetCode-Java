/**
 * @author wanghu
 * @discrption：
 * 有一个机器人从位置 (0, 0)（原点）开始，位于 2D 平面上。给定它的一系列动作，判断这个机器人在完成它的动作后是否在 (0, 0) 处结束。
 * 给定一个字符串 move 表示机器人的移动序列，其中 move[i] 表示它的第 i 个移动。
 * 有效的移动是“R”（右）、“L”（左）、“U”（向上）和“D”（向下）。
 * 如果机器人在完成所有移动后返回原点，则返回 true，否则返回 false。
 * 注意：机器人“面对”的方式无关紧要。 'R' 将始终使机器人向右移动一次，'L' 将始终使其向左移动，等等。
 * 此外，假设机器人每次移动的移动幅度都相同。
 * @create 2021-10-22 10:28
 */
public class Easy_657_RobotReturnToOrigin {

    //我的方法
    //Runtime: 4 ms, faster than 87.12% of Java online submissions for Robot Return to Origin.
    //Memory Usage: 39 MB, less than 77.74% of Java online submissions for Robot Return to Origin.
    public boolean judgeCircle(String moves) {
        int row = 0, col = 0;
        for (char c : moves.toCharArray()) {
            if (c == 'L') row--;
            if (c == 'R') row++;
            if (c == 'U') col++;
            if (c == 'D') col--;
        }
        return row == 0 && col == 0;
    }

}
