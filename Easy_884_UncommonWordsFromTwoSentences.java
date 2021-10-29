import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author wanghu
 * @discrption： 句子是一串单空格分隔的单词，其中每个单词仅由小写字母组成。
 * 如果一个词在其中一个句子中只出现一次，而在另一个句子中没有出现，则该词是不常见的。
 * 给定两个句子 s1 和 s2，返回所有不常见单词的列表。您可以按任何顺序返回答案。
 * @create 2021-10-29 10:11
 */
public class Easy_884_UncommonWordsFromTwoSentences {

    // 我的方法：用两个map分别记录两个字符串中单词的数量，然后找出各自map中数量为1且对方map中没有的字符串
    //Runtime: 2 ms, faster than 89.85% of Java online submissions for Uncommon Words from Two Sentences.
    //Memory Usage: 39 MB, less than 73.84% of Java online submissions for Uncommon Words from Two Sentences.
    public String[] uncommonFromSentences(String s1, String s2) {
        String[] arr1 = s1.split(" ");
        String[] arr2 = s2.split(" ");
        HashMap<String, Integer> map1 = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();
        for (String s : arr1) {
            map1.put(s, map1.getOrDefault(s, 0) + 1);
        }
        for (String s : arr2) {
            map2.put(s, map2.getOrDefault(s, 0) + 1);
        }
        ArrayList<String> res = new ArrayList<>();
        int i = 0;
        for (String s : map1.keySet()) {
            if (map1.get(s) == 1 && !map2.containsKey(s)) {
                res.add(s);
            }
        }
        for (String s : map2.keySet()) {
            if (map2.get(s) == 1 && !map1.containsKey(s)) {
                res.add(s);
            }
        }
        return res.toArray(new String[0]);
    }

}
