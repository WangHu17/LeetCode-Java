/**
 * @author wanghu
 * @discrption： 有一种特殊的打字机，小写英文字母“a”到“z”用指针排列成一个圆圈。只有当指针指向该字符时，才能键入该字符。指针最初指向字符“a”。
 * 每一秒，您都可以执行以下操作之一： 将指针逆时针或顺时针移动一个字符。 键入指针当前所在的字符。
 * 给定一个字符串 word，返回在 word 中输入字符的最小秒数。
 * @create 2021-12-10 11:09
 */
public class Easy_1974_MinimumTimeToTypeWordUsingSpecialTypewriter {

    //我的方法
    //Runtime: 0 ms, faster than 100.00% of Java online submissions for Minimum Time to Type Word Using Special Typewriter.
    //Memory Usage: 37.2 MB, less than 67.26% of Java online submissions for Minimum Time to Type Word Using Special Typewriter.
    public int minTimeToType(String word) {
        int sum = 0;
        int move = word.charAt(0) - 'a';
        sum += move > 13 ? (26 - move) : move;
        for (int i = 1; i < word.length(); i++) {
            int move1 = Math.abs(word.charAt(i - 1) - word.charAt(i));
            sum += move1 > 13 ? (26 - move1) : move1;
        }
        return sum + word.length();
    }

}
