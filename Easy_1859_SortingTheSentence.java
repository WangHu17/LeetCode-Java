import java.util.Arrays;

/**
 * @author wanghu
 * @discrption： 句子是由单个空格分隔的单词列表，没有前导或尾随空格。每个单词由小写和大写英文字母组成。
 * 通过将索引为 1 的单词位置附加到每个单词，然后重新排列句子中的单词，可以对句子进行打乱。
 * 例如，句子“This is a sentence”可以改组为“sentence4 a3 is2 This1”或“is2 sentence4 This1 a3”。
 * 给定一个包含不超过 9 个单词的混洗句子 s，重构并返回原始句子。
 * @create 2021-11-25 11:22
 */
public class Easy_1859_SortingTheSentence {

    //方法二：不排序
    //Runtime: 1 ms, faster than 84.65% of Java online submissions for Sorting the Sentence.
    //Memory Usage: 39 MB, less than 14.61% of Java online submissions for Sorting the Sentence.
    public String sortSentence1(String s) {
        String[] words = s.split(" ");
        String[] sortedWords = new String[words.length];
        for (String word : words) {
            char c = word.charAt(word.length() - 1);
            int index = c - '0';
            sortedWords[index - 1] = word.substring(0, word.length() - 1);
        }
        StringBuilder res = new StringBuilder();
        for (String word : sortedWords) {
            res.append(word).append(" ");
        }
        return res.toString().trim();
    }

    //我的方法：用StringBuilder比String快
    //Runtime: 1 ms, faster than 84.65% of Java online submissions for Sorting the Sentence.
    //Memory Usage: 37.1 MB, less than 74.24% of Java online submissions for Sorting the Sentence.
    public String sortSentence(String s) {
        String[] words = s.split(" ");
        Arrays.sort(words, (s1, s2) -> {
            char c1 = s1.charAt(s1.length() - 1);
            char c2 = s2.charAt(s2.length() - 1);
            return c1 - c2;
        });
        StringBuilder res = new StringBuilder();
        for (String word : words) {
            res.append(word.substring(0, word.length() - 1)).append(" ");
        }
        return res.toString().trim();
    }

}
