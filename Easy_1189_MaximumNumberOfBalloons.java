import java.util.Arrays;

/**
 * @author wanghu
 * @discrption： 求字符串中的字母能构成多少个“balloon”单词
 * @create 2021-12-23 10:08
 */
public class Easy_1189_MaximumNumberOfBalloons {

    //我的方法
    //Runtime: 5 ms, faster than 37.10% of Java online submissions for Maximum Number of Balloons.
    //Memory Usage: 38.6 MB, less than 54.11% of Java online submissions for Maximum Number of Balloons.
    public int maxNumberOfBalloons(String text) {
        int[] count = new int[15];
        Arrays.fill(count, 0);
        for (Character c : text.toCharArray()) {
            if (c == 'b' || c == 'a' || c == 'l' || c == 'o' || c == 'n') {
                count[c - 'a']++;
            }
        }
        int min1 = 10000, min2 = 10000, res = 0;
        min1 = Math.min(min1, count['b' - 'a']);
        min1 = Math.min(min1, count['a' - 'a']);
        min1 = Math.min(min1, count['n' - 'a']);
        min2 = Math.min(min2, count['l' - 'a']);
        min2 = Math.min(min2, count['o' - 'a']);
        return res = Math.min(min1, min2 / 2);
    }

}
