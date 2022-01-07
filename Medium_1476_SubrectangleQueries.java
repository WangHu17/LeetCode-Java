/**
 * @author wanghu
 * @discrption： 太简单了
 * @create 2022-01-07 9:34
 */
public class Medium_1476_SubrectangleQueries {

    //我的方法
    //Runtime: 24 ms, faster than 80.92% of Java online submissions for Subrectangle Queries.
    //Memory Usage: 42.3 MB, less than 98.02% of Java online submissions for Subrectangle Queries.
    private int[][] rectangle1;

    public Medium_1476_SubrectangleQueries(int[][] rectangle) {
        rectangle1 = new int[rectangle.length][rectangle[0].length];
        for (int i = 0; i < rectangle.length; i++) {
            rectangle1[i] = rectangle[i].clone();
        }
    }

    public void updateSubrectangle(int row1, int col1, int row2, int col2, int newValue) {
        for (int i = row1; i <= row2; i++) {
            for (int j = col1; j <= col2; j++) {
                rectangle1[i][j] = newValue;
            }
        }
    }

    public int getValue(int row, int col) {
        return rectangle1[row][col];
    }

}
