/**
 * @author wanghu
 * @discrption：
 * 当以下情况之一成立时，我们将单词中的大写用法定义为正确：
 *      这个单词中的所有字母都是大写的，比如“USA”。
 *      这个单词中的所有字母都不是大写的，比如“leetcode”。
 *      这个词只有第一个字母是大写的，比如“Google”。
 * 给定一个字符串单词，如果其中的大写使用正确，则返回 true。
 * @create 2021-10-20 10:44
 */
public class Easy_520_DetectCapital {

    //差不多方法
    public boolean detectCapitalUse(String word) {
        int upperCount = 0;
        for (int i = 0; i < word.length(); i++) {
            if (Character.isUpperCase(word.charAt(i)))
                upperCount++;
        }
        if (upperCount == 0 || upperCount == word.length()) return true;
        return Character.isUpperCase(word.charAt(0)) && upperCount == 1;
    }

    //我的方法
    //Runtime: 2 ms, faster than 50.05% of Java online submissions for Detect Capital.
    //Memory Usage: 39.2 MB, less than 24.28% of Java online submissions for Detect Capital.
    public boolean detectCapitalUse1(String word) {
        char[] words = word.toCharArray();
        if (Character.isUpperCase((words[0]))) {
            int upperCount = 1;
            for (int i = 1; i < words.length; i++) {
                if (Character.isUpperCase(words[i])) upperCount++;
            }
            return upperCount == 1 || upperCount == words.length;
        } else {
            for (int i = 1; i < words.length; i++) {
                if (Character.isUpperCase(words[i])) return false;
            }
        }
        return true;
    }

}
