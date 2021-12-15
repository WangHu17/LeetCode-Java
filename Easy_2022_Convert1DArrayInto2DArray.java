/**
 * @author wanghu
 * @discrption： 太简单了，没什么好看的
 * @create 2021-12-15 10:58
 */
public class Easy_2022_Convert1DArrayInto2DArray {

    //我的方法
    //Runtime: 3 ms, faster than 99.03% of Java online submissions for Convert 1D Array Into 2D Array.
    //Memory Usage: 49.7 MB, less than 44.23% of Java online submissions for Convert 1D Array Into 2D Array.
    public int[][] construct2DArray(int[] original, int m, int n) {
        if (m * n != original.length) return new int[0][0];
        int[][] res = new int[m][n];
        int k = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                res[i][j] = original[k++];
            }
        }
        return res;
    }

}
