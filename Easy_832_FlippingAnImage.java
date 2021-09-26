/**
 * @author wanghu
 * @discrption： 给定一个 n x n 二进制矩阵图像，水平翻转图像，然后反转它，并返回结果图像。
 * 水平翻转图像意味着图像的每一行都反转。 例如，水平翻转 [1,1,0] 会得到 [0,1,1]。
 * 反转图像意味着每个 0 被 1 替换，每个 1 被 0 替换。 例如，反转 [0,1,1] 会得到 [1,0,0]。
 * @create 2021-09-26 9:29
 */
public class Easy_832_FlippingAnImage {

    //我的方法：一边翻转一边反转
    //Runtime: 0 ms, faster than 100.00% of Java online submissions for Flipping an Image.
    //Memory Usage: 39.1 MB, less than 81.31% of Java online submissions for Flipping an Image.
    public int[][] flipAndInvertImage(int[][] image) {
        int len = image[0].length;
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < (len + 1) / 2; j++) {
                int temp = image[i][j] == 1 ? 0 : 1;
                image[i][j] = image[i][len - j - 1] == 1 ? 0 : 1;
                image[i][len - j - 1] = temp;
            }
        }
        return image;
    }

    //改进的方法：用异或
    //Runtime: 0 ms, faster than 100.00% of Java online submissions for Flipping an Image.
    //Memory Usage: 41.4 MB, less than 31.23% of Java online submissions for Flipping an Image.
    public int[][] flipAndInvertImage1(int[][] image) {
        int C = image[0].length;
        for (int[] row: image)
            for (int i = 0; i < (C + 1) / 2; ++i) {
                int tmp = row[i] ^ 1;
                row[i] = row[C - 1 - i] ^ 1;
                row[C - 1 - i] = tmp;
            }

        return image;
    }

}
