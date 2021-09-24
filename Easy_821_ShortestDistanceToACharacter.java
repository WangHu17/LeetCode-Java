import java.util.ArrayList;

/**
 * @author wanghu
 * @discrption：
 * 给定一个字符串 s 和一个出现在 s 中的字符 c，返回一个整数数组 answer，
 * 其中 answer.length == s.length 和 answer[i] 是从索引 i 到 s 中最近出现的字符 c 的距离。
 * 两个索引 i 和 j 之间的距离是 abs(i - j)，其中 abs 是绝对值函数。
 * @create 2021-09-24 11:01
 */
public class Easy_821_ShortestDistanceToACharacter {

    //我的方法：先将所有目标字符找出来，把他们的位置存起来，然后遍历字符串，存下最近的那个距离
    //Runtime: 5 ms, faster than 20.48% of Java online submissions for Shortest Distance to a Character.
    //Memory Usage: 39.3 MB, less than 45.32% of Java online submissions for Shortest Distance to a Character.
    public int[] shortestToChar(String s, char c) {
        char[] chars = s.toCharArray();
        int len = s.length();
        int[] res = new int[len];
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            if (chars[i] == c) list.add(i);
        }
        for (int i = 0; i < s.length(); i++) {
            int min = len;
            if (chars[i] == c) {
                res[i] = 0;
            } else {
                for (int j : list) {
                    int cur = Math.abs(i-j);
                    if (min > cur){
                        min = cur;
                    }else {
                        break;
                    }
                }
                res[i] = min;
            }
        }
        return res;
    }

}
