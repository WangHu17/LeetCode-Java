/**
 * @author wanghu
 * @discrption：
 * 给你一个由小写英文字母组成的字符串 s 和一个数组宽度，表示每个小写英文字母有多少像素宽。
 * 具体来说，widths[0] 是 'a' 的宽度，widths[1] 是 'b' 的宽度，依此类推。
 * 您正在尝试跨多行写入 s，其中每行不超过 100 个像素。
 * 从 s 的开头开始，在第一行写尽可能多的字母，使总宽度不超过 100 像素。
 * 然后，从你停在 s 的地方，继续在第二行写尽可能多的字母。
 * 继续这个过程，直到你写完所有的 s。
 * 返回长度为 2 的数组结果，其中： result[0] 是总行数。 result[1] 是最后一行的宽度（以像素为单位）。
 * @create 2021-09-24 9:53
 */
public class Easy_806_NumberOfLinesToWriteString {

    //我的方法
    //Runtime: 0 ms, faster than 100.00% of Java online submissions for Number of Lines To Write String.
    //Memory Usage: 37.2 MB, less than 81.61% of Java online submissions for Number of Lines To Write String.
    public int[] numberOfLines(int[] widths, String s) {
        char[] chars = s.toCharArray();
        int row = 0, width = 0;
        for (char aChar : chars) {
            if (width + widths[aChar - 'a'] > 100) {
                row++;
                width = widths[aChar - 'a'];
            } else {
                width += widths[aChar - 'a'];
            }
        }
        return new int[]{row + 1, width};
    }

}
