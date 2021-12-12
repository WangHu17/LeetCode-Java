/**
 * @author wanghu
 * @discrption： 图像平滑器是大小为 3 x 3 的过滤器，可以通过舍入单元格和周围八个单元格的平均值（
 * 即蓝色平滑器中九个单元格的平均值）来应用于图像的每个单元格。如果一个单元格的一个或多个周围单元格不存在，
 * 我们不考虑它的平均值（即红色平滑器中四个单元格的平均值）。
 * @create 2021-12-12 15:37
 */
public class Easy_661_ImageSmoother {

    //我的方法：暴力
    //Runtime: 6 ms, faster than 78.99% of Java online submissions for Image Smoother.
    //Memory Usage: 39.8 MB, less than 90.69% of Java online submissions for Image Smoother.
    public int[][] imageSmoother(int[][] img) {
        int row = img.length, col = img[0].length;
        int[][] res = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                int sum = 0, count = 0;
                for (int m = i - 1; m <= i + 1; m++) {
                    for (int n = j - 1; n <= j + 1; n++) {
                        if (m >= 0 && m < row && n >= 0 && n < col){
                            sum += img[m][n];
                            count++;
                        }
                    }
                }
                res[i][j] = sum/count;
            }
        }
        return res;
    }

}
