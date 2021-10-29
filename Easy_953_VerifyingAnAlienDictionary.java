import java.util.HashMap;

/**
 * @author wanghu
 * @discrption： 令人惊讶的是，在外星语言中，他们也使用英文小写字母，但顺序可能不同。字母表的顺序是一些小写字母的排列。
 * 给定一个用外星语言书写的单词序列和字母表的顺序，当且仅当给定的单词在该外星语言中按字典顺序排序时才返回 true。
 * 即 words数组中的单词要以 order数组中的字母顺序排序
 * @create 2021-10-29 10:38
 */
public class Easy_953_VerifyingAnAlienDictionary {

    // 方法：只需比较相邻的单词顺序是否正确
    //Runtime: 0 ms, faster than 100.00% of Java online submissions for Verifying an Alien Dictionary.
    //Memory Usage: 38.9 MB, less than 62.82% of Java online submissions for Verifying an Alien Dictionary.
    public boolean isAlienSorted(String[] words, String order) {
        int[] orderMap = new int[26];
        for (int i = 0; i < order.length(); i++) {
            orderMap[order.charAt(i) - 'a'] = i;
        }
        for (int i = 0; i < words.length - 1; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                // 当相邻单词为"apple","app"这种情况时，返回false
                if (j >= words[i + 1].length()) return false;
                if (words[i].charAt(j) != words[i + 1].charAt(j)) {
                    int char1 = words[i].charAt(j) - 'a';
                    int char2 = words[i + 1].charAt(j) - 'a';
                    // 当这个位置上的字母前面的单词比后面的单词大时，返回false
                    if (orderMap[char1] > orderMap[char2]) {
                        return false;
                    } else
                        break; // 当这个位置上的字母前面的单词比后面的单词小时，说明它们的顺序正确，不用比较后面的字母了
                }
            }
        }
        return true;
    }

}
