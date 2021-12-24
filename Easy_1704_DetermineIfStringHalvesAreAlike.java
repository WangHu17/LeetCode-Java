/**
 * @author wanghu
 * @discrption： 给定一个偶数长度的字符串 s。把这个字符串分成等长的两半，让 a 是前半部分，b 是后半部分。
 * 如果两个字符串具有相同数量的元音（'a'、'e'、'i'、'o'、'u'、'A'、'E'、'I'、'O'、' U'）。请注意，s 包含大写和小写字母。
 * 如果 a 和 b 相似，则返回 true。否则，返回false。
 * @create 2021-12-24 9:42
 */
public class Easy_1704_DetermineIfStringHalvesAreAlike {

    //Runtime: 3 ms, faster than 72.47% of Java online submissions for Determine if String Halves Are Alike.
    //Memory Usage: 38.9 MB, less than 26.01% of Java online submissions for Determine if String Halves Are Alike.
    public boolean halvesAreAlike(String s) {
        int count = 0;
        for (int i = 0; i < s.length() / 2; i++) {
            if (isVowel(s.charAt(i))) count++;
            if (isVowel(s.charAt(s.length() - i - 1))) count--;
        }
        return count == 0;
    }

    private boolean isVowel(char c) {
        char[] vowel = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        for (char ch : vowel) {
            if (c == ch) return true;
        }
        return false;
    }

}
