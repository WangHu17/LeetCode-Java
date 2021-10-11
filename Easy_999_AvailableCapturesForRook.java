/**
 * @author wanghu
 * @discrption：
 * 在一个 8 x 8 的棋盘上，正好有一个白车“R”和一些白象“B”、黑棋子“p”和空方“.”。
 * 当车移动时，它选择四个基本方向（北、东、南或西）之一，然后向该方向移动，直到它选择停止、到达棋盘边缘、捕获一个黑色棋子或被一位白人主教。
 * 如果车可以在车的回合中捕获棋子，则该车被视为攻击棋子。
 * 白车的可用捕获数是白车正在攻击的棋子数。
 * 返回白车的可用捕获数。
 * @create 2021-10-11 11:30
 */
public class Easy_999_AvailableCapturesForRook {

    //我的方法：先找出车的位置，再从上下左右依次找p，遇到B break
    //Runtime: 0 ms, faster than 100.00% of Java online submissions for Available Captures for Rook.
    //Memory Usage: 38.1 MB, less than 33.09% of Java online submissions for Available Captures for Rook.
    public int numRookCaptures(char[][] board) {
        int sum = 0, i = 0, j = 0, flag = 1;
        for (i = 0; i < 8; i++) {
            for (j = 0; j < 8; j++) {
                if (board[i][j] == 'R') {
                    flag = 0;
                    break;
                }
            }
            if (flag == 0) break;
        }
        int row = i, col = j;
        while (col >= 0) {
            if (board[row][col] == 'p') {
                sum++;
                break;
            } else if (board[row][col] == 'B') {
                break;
            }
            col--;
        }
        col = j;
        while (col < 8) {
            if (board[row][col] == 'p') {
                sum++;
                break;
            } else if (board[row][col] == 'B') {
                break;
            }
            col++;
        }
        col = j;
        while (row >= 0) {
            if (board[row][col] == 'p') {
                sum++;
                break;
            } else if (board[row][col] == 'B') {
                break;
            }
            row--;
        }
        row = i;
        while (row < 8) {
            if (board[row][col] == 'p') {
                sum++;
                break;
            } else if (board[row][col] == 'B') {
                break;
            }
            row++;
        }
        return sum;
    }

}
