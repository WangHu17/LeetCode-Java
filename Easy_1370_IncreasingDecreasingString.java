/**
 * @author wanghu
 * @discrption：
 * @create 2021-12-29 11:39
 */
public class Easy_1370_IncreasingDecreasingString {

    //Runtime: 3 ms, faster than 80.39% of Java online submissions for Increasing Decreasing String.
    //Memory Usage: 38.8 MB, less than 90.20% of Java online submissions for Increasing Decreasing String.
    public String sortString(String s) {
        int[] count = new int[26];
        StringBuilder builder = new StringBuilder();
        for (Character c : s.toCharArray()) {
            count[c - 'a']++;
        }
        int len = s.length();
        while (len > 0) {
            for (int i = 0; i < 26; i++) {
                if (count[i] > 0) {
                    count[i]--;
                    builder.append((char) (i + 'a'));
                    len--;
                }
            }
            for (int i = 25; i >= 0; i--) {
                if (count[i] > 0) {
                    count[i]--;
                    builder.append((char) (i + 'a'));
                    len--;
                }
            }
        }
        return builder.toString();
    }

}
