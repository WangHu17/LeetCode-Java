/**
 * @author wanghu
 * @discrption：
 * 给定一个字符串 s ，它由一些由一定数量的空格分隔的单词组成，返回字符串中最后一个单词的长度。 单词是仅由非空格字符组成的最大子串。
 * @create 2021-10-15 11:07
 */
public class Easy_58_LengthOfLastWord {

    //我的方法：先去掉字符串后面的空格，再从后往前计算长度直到遇到空格
    //Runtime: 0 ms, faster than 100.00% of Java online submissions for Length of Last Word.
    //Memory Usage: 38.9 MB, less than 29.12% of Java online submissions for Length of Last Word.
    public int lengthOfLastWord(String s) {
        String s1 = s.trim();
        int i = s1.length() - 1;
        int len = 0;
        while (i >= 0) {
            if (!(s1.charAt(i) == ' ')) {
                len++;
                i--;
            } else
                break;
        }
        return len;
    }

}
