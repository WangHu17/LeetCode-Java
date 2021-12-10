/**
 * @author wanghu
 * @discrption： 给定一个由 n 个字符组成的字符串 s，它们要么是“X”，要么是“O”。
 * 一次移动被定义为选择 s 的三个连续字符并将它们转换为 'O'。请注意，如果将移动应用于字符“O”，它将保持不变。
 * 返回使 s 的所有字符都转换为 'O' 所需的最小移动次数
 * @create 2021-12-10 14:23
 */
public class Easy_2027_MinimumMovesToConvertString {

    //我的方法：顺序遍历（让我震惊系列）
    //Runtime: 0 ms, faster than 100.00% of Java online submissions for Minimum Moves to Convert String.
    //Memory Usage: 37.4 MB, less than 50.80% of Java online submissions for Minimum Moves to Convert String.
    public int minimumMoves(String s) {
        char[] chars = s.toCharArray();
        int res = 0, index = 0;
        while (index < chars.length) {
            if (chars[index] == 'X') {
                res++;
                index += 3;
            } else
                index++;
        }
        return res;
    }

}
