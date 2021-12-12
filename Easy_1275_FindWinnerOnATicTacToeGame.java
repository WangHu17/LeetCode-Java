import java.util.Arrays;

/**
 * @author wanghu
 * @discrption： 判断井字格游戏的结果，先走的是A，后走的是B，如果走完了，返回结果（A赢、B赢或平局），
 * 如果没走完，返回 “Pending”
 * @create 2021-12-12 16:48
 */
public class Easy_1275_FindWinnerOnATicTacToeGame {

    //我的方法
    //Runtime: 0 ms, faster than 100.00% of Java online submissions for Find Winner on a Tic Tac Toe Game.
    //Memory Usage: 37 MB, less than 33.13% of Java online submissions for Find Winner on a Tic Tac Toe Game.
    public String tictactoe(int[][] moves) {
        // 将A、B的步骤存入数组中，'X'代表A、'O'代表B、'.'代表空的
        char[][] grid = new char[3][3];
        for (int i = 0; i < 3; i++)
            Arrays.fill(grid[i], '.');
        boolean flag = true;
        for (int i = 0; i < moves.length; i++) {
            if (flag)
                grid[moves[i][0]][moves[i][1]] = 'X';
            else
                grid[moves[i][0]][moves[i][1]] = 'O';
            flag = !flag;
        }
        for (int i = 0; i < 3; i++) {
            // 判断横向是否有胜利的
            if (grid[i][0] != '.' && grid[i][0] == grid[i][1] && grid[i][1] == grid[i][2]) {
                if (grid[i][0] == 'X') return "A";
                else return "B";
            }
            // 判断纵向是否有胜利的
            if (grid[0][i] != '.' && grid[0][i] == grid[1][i] && grid[1][i] == grid[2][i]) {
                if (grid[0][i] == 'X') return "A";
                else return "B";
            }
        }
        // 判断斜线是否有胜利的
        if (grid[0][0] != '.' && grid[0][0] == grid[1][1] && grid[1][1] == grid[2][2]) {
            if (grid[0][0] == 'X') return "A";
            else return "B";
        }
        if (grid[0][2] != '.' && grid[0][2] == grid[1][1] && grid[1][1] == grid[2][0]) {
            if (grid[1][1] == 'X') return "A";
            else return "B";
        }
        return moves.length == 9 ? "Draw" : "Pending";
    }

}
