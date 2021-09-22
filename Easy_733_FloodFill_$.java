/**
 * @author wanghu
 * @discrption：
 * @create 2021-09-22 11:26
 */
public class Easy_733_FloodFill_$ {
    //Runtime: 0 ms, faster than 100.00% of Java online submissions for Flood Fill.
    //Memory Usage: 39.5 MB, less than 98.16% of Java online submissions for Flood Fill.
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int color = image[sr][sc];
        if (color != newColor) dfs(image, sr, sc, color, newColor);
        return image;
    }

    public void dfs(int[][] image, int sr, int sc, int color, int newColor) {
        if (image[sr][sc] == color) {
            image[sr][sc] = newColor;
            if (sr >= 1) dfs(image, sr - 1, sc, color, newColor);
            if (sc >= 1) dfs(image, sr, sc - 1, color, newColor);
            if (sr + 1 < image.length) dfs(image, sr + 1, sc, color, newColor);
            if (sc + 1 < image[0].length) dfs(image, sr, sc + 1, color, newColor);
        }
    }

}
