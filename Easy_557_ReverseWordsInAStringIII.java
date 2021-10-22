/**
 * @author wanghu
 * @discrption：
 * @create 2021-10-22 9:58
 */
public class Easy_557_ReverseWordsInAStringIII {

    //改进方法
    //Runtime: 4 ms, faster than 86.14% of Java online submissions for Reverse Words in a String III.
    //Memory Usage: 39.4 MB, less than 91.77% of Java online submissions for Reverse Words in a String III.
    public String reverseWords1(String s) {
        StringBuilder builder = new StringBuilder();
        String[] s1 = s.split(" ");
        for (String s2:s1){
            builder.append(new StringBuffer(s2).reverse().toString()).append(' ');
        }
        return builder.toString().trim();
    }

    //我的方法：先按空格分割字符串，再将每个单词倒序放入StringBuilder中，再加个空格
    //Runtime: 10 ms, faster than 48.71% of Java online submissions for Reverse Words in a String III.
    //Memory Usage: 47.6 MB, less than 30.39% of Java online submissions for Reverse Words in a String III.
    public String reverseWords(String s) {
        StringBuilder builder = new StringBuilder();
        String[] s1 = s.split(" ");
        for (String s2:s1){
            int len = s2.length() - 1;
            while (len >= 0)builder.append(s2.charAt(len--));
            builder.append(' ');
        }
        return builder.toString().trim();
    }

}
