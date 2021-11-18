/**
 * @author wanghu
 * @discrption： 给定一个索引为 0 的字符串 word 和一个字符 ch，反转从索引 0 开始并在第一次出现 ch（含）的索引处结束的 word 段。
 * 如果字符 ch 在 word 中不存在，则什么也不做。
 * 例如，如果 word = "abcdefd" 和 ch = "d"，那么您应该反转从 0 开始到 3（含）结束的段。结果字符串将是“dcbaefd”。
 * 返回结果字符串。
 * @create 2021-11-18 14:09
 */
public class Easy_2000_ReversePrefixOfWord {

    //我的方法
    //Runtime: 0 ms, faster than 100.00% of Java online submissions for Reverse Prefix of Word.
    //Memory Usage: 37.4 MB, less than 58.49% of Java online submissions for Reverse Prefix of Word.
    public String reversePrefix(String word, char ch) {
        char[] chars = word.toCharArray();
        int left = 0, right = 0;
        for (int i = 0; i < word.length(); i++) {
            if (chars[i] == ch) {
                right = i;
                break;
            }
        }
        while (left < right) {
            char t = chars[left];
            chars[left++] = chars[right];
            chars[right--] = t;
        }
        return String.valueOf(chars);
    }

}
