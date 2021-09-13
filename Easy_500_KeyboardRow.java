import java.util.ArrayList;
import java.util.Locale;

/**
 * @author wanghu
 * @discrption： 给定一组字符串单词，返回可以在仅一行美式键盘上使用字母输入的单词。
 * @create 2021-09-13 9:35
 */
public class Easy_500_KeyboardRow {

    //Runtime: 0 ms, faster than 100.00% of Java online submissions for Keyboard Row.
    //Memory Usage: 36.7 MB, less than 90.28% of Java online submissions for Keyboard Row.
    public String[] findWords(String[] words) {
        String[] s = {"qwertyuiop", "asdfghjkl", "zxcvbnm"};
        ArrayList<String> list = new ArrayList<>();
        for (String word : words) {
            int index = 0, flag = 1;
            //注意转小写
            String temp = word.toLowerCase();
            if (s[1].indexOf(temp.charAt(0)) != -1) index = 1;
            if (s[2].indexOf(temp.charAt(0)) != -1) index = 2;
            for (char c:temp.toCharArray()) {
                if (s[index].indexOf(c) == -1) {
                    flag = 0;
                    break;
                }
            }
            if (flag == 1) list.add(word);
        }
        String[] res = new String[list.size()];
        return list.toArray(res);
    }

}
