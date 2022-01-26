/**
 * @author wanghu
 * @discrption： 给你一个大小为 m x n 的矩阵 board 表示甲板，其中，每个单元格可以是一艘战舰 'X'
 * 或者是一个空位 '.' ，返回在甲板 board 上放置的 战舰 的数量。
 * <p>
 * 战舰 只能水平或者垂直放置在 board 上。换句话说，战舰只能按 1 x k（1 行，k 列）或 k x 1（k 行，1 列）
 * 的形状建造，其中 k 可以是任意大小。两艘战舰之间至少有一个水平或垂直的空位分隔 （即没有相邻的战舰）
 * @create 2022-01-26 15:55
 */
public class Medium_419_BattleshipsInABoard {

    //方法：没找到一艘战舰，就将这艘战舰的'X'全部变为'.'
    //Runtime: 1 ms, faster than 66.21% of Java online submissions for Battleships in a Board.
    //Memory Usage: 41.5 MB, less than 14.95% of Java online submissions for Battleships in a Board.
    public int countBattleships(char[][] board) {
        int sum = 0, row = board.length, col = board[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (board[i][j] == 'X') {
                    sum++;
                    board[i][j] = '.';
                    for (int k = j + 1; k < col && board[i][k] == 'X'; k++) {
                        board[i][k] = '.';
                    }
                    for (int k = i + 1; k < row && board[k][j] == 'X'; k++) {
                        board[k][j] = '.';
                    }
                }
            }
        }
        return sum;
    }

}
