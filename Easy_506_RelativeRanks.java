import java.util.Arrays;
import java.util.HashMap;

/**
 * @author wanghu
 * @discrption：
 * @create 2021-09-13 11:09
 */
public class Easy_506_RelativeRanks {

    //我的方法
    //Runtime: 12 ms, faster than 55.63% of Java online submissions for Relative Ranks.
    //Memory Usage: 40.1 MB, less than 70.64% of Java online submissions for Relative Ranks.
    public String[] findRelativeRanks(int[] score) {
        int[] sorted_score = Arrays.copyOf(score,score.length);
        Arrays.sort(sorted_score);
        HashMap<Integer, String> map = new HashMap<>();
        String[] res = new String[score.length];
        for (int i = 0; i < sorted_score.length; i++) {
            map.put(sorted_score[i], sorted_score.length - i + "");
        }
        for (int i = 0; i < score.length; i++) {
            String s = map.get(score[i]);
            if (s.equals("1")) {
                s = "Gold Medal";
            }
            if (s.equals("2")) {
                s = "Silver Medal";
            }
            if (s.equals("3")) {
                s = "Bronze Medal";
            }
            res[i] = s;
        }
        return res;
    }

}
