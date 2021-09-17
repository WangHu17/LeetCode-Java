import java.util.Stack;

/**
 * @author wanghu
 * @discrption： 你正在为一场规则奇怪的棒球比赛记分。
 * 游戏由几个回合组成，过去回合的分数可能会影响未来回合的分数。
 * 在游戏开始时，您从一个空记录开始。您将获得一个字符串 ops 列表，其中 ops[i] 是您必须应用于该记录的第 i 个操作，并且是以下操作之一：
 * 整数 x - 记录 x 的新分数。
 * "+" - 记录一个新的分数，它是前两个分数的总和。保证总会有两个以前的分数。
 * “D” - 记录一个新的分数，该分数是先前分数的两倍。保证总会有以前的分数。
 * "C" - 使之前的分数无效，将其从记录中删除。保证总会有以前的分数。
 * 返回记录上所有分数的总和。
 * @create 2021-09-17 9:53
 */
public class Easy_682_BaseballGame {

    //方法：用栈
    //Runtime: 2 ms, faster than 90.39% of Java online submissions for Baseball Game.
    //Memory Usage: 38 MB, less than 94.11% of Java online submissions for Baseball Game.
    public int calPoints(String[] ops) {
        Stack<Integer> stack = new Stack();
        int sum = 0;
        for (String op : ops) {
            if (op.equals("C")) {
                sum += stack.pop();
            } else if (op.equals("D")) {
                stack.push(stack.peek() * 2);
                sum += stack.peek() * 2;
            } else if (op.equals("+")) {
                int pre_top = stack.pop();
                int new_top = pre_top + stack.peek();
                stack.push(pre_top);
                stack.push(new_top);
                sum += new_top;
            } else {
                stack.push(Integer.parseInt(op));
                sum += Integer.parseInt(op);
            }
        }
        return sum;
    }

}
