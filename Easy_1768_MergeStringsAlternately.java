/**
 * @author wanghu
 * @discrption： 给你两个字符串 word1 和 word2。通过以交替顺序添加字母来合并字符串，从 word1 开始。
 * 如果一个字符串比另一个长，则将额外的字母附加到合并字符串的末尾。 返回合并后的字符串。
 * @create 2021-11-18 13:09
 */
public class Easy_1768_MergeStringsAlternately {

    //同意的方法，但是使用StringBuilder
    //Runtime: 0 ms, faster than 100.00% of Java online submissions for Merge Strings Alternately.
    //Memory Usage: 37.5 MB, less than 55.12% of Java online submissions for Merge Strings Alternately.
    public String mergeAlternately1(String word1, String word2) {
        StringBuilder res = new StringBuilder();
        int i = 0, len1 = word1.length(), len2 = word2.length();
        while (i < len1 && i < len2) {
            res.append(word1.charAt(i));
            res.append(word2.charAt(i));
            i++;
        }
        while (i < len1) {
            res.append(word1.charAt(i++));
        }
        while (i < len2) {
            res.append(word2.charAt(i++));
        }
        return res.toString();
    }

    //我的方法
    //Runtime: 6 ms, faster than 22.35% of Java online submissions for Merge Strings Alternately.
    //Memory Usage: 39 MB, less than 27.83% of Java online submissions for Merge Strings Alternately.
    public String mergeAlternately(String word1, String word2) {
        String res = "";
        int i = 0, len1 = word1.length(), len2 = word2.length();
        while (i < len1 && i < len2) {
            res += word1.charAt(i);
            res += word2.charAt(i);
            i++;
        }
        while (i < len1) {
            res += word1.charAt(i++);
        }
        while (i < len2) {
            res += word2.charAt(i++);
        }
        return res;
    }

}
