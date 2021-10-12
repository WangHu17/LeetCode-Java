import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wanghu
 * @discrption：
 * @create 2021-10-11 14:28
 */
public class Easy_1002_FindCommonCharacters_$ {

    //我的方法：暴力
    //Runtime: 39 ms, faster than 6.44% of Java online submissions for Find Common Characters.
    //Memory Usage: 51.9 MB, less than 5.05% of Java online submissions for Find Common Characters.
    public List<String> commonChars(String[] words) {
        String[] first = words[0].split("");
        ArrayList<String> res = new ArrayList<>();
        for (String s : first) {
            int flag = 1;
            for (int i = 1; i < words.length; i++) {
                int index = words[i].indexOf(s);
                if (index != -1) {
                    String t;
                    t = words[i].substring(0, index);
                    t = t.concat(words[i].substring(index + 1));
                    words[i] = t;
                } else {
                    flag = 0;
                }
            }
            if (flag == 1) res.add(s);
        }
        return res;
    }

    @Test
    public void test() {
        String[] s = {"cool","lock","cook"};
        System.out.println(commonChars(s));
    }

}
