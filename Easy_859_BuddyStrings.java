/**
 * @author wanghu
 * @discrption： 给定两个字符串 s 和目标，如果可以交换 s 中的两个字母使结果等于目标，则返回 true，否则返回 false。
 * @create 2021-10-29 9:37
 */
public class Easy_859_BuddyStrings {

    //Runtime: 1 ms, faster than 99.69% of Java online submissions for Buddy Strings.
    //Memory Usage: 39 MB, less than 70.50% of Java online submissions for Buddy Strings.
    public boolean buddyStrings(String s, String goal) {
        if (s.length() != goal.length()) return false;
        // 如果字符串相同，判断是否有两个或以上的字母相同
        if (s.equals(goal)) {
            int[] count = new int[26];
            for (char c : s.toCharArray()) {
                count[c - 'a']++;
            }
            for (int i = 0; i < 26; i++) {
                if (count[i] > 1) return true;
            }
            return false;
        }
        // 如果字符串不同，判断是否有且仅有两个字母不同，但交叉相同
        else {
            // 用两个变量记录两个不同的字母位置
            int first = -1, second = -1;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) != goal.charAt(i)) {
                    if (first == -1) {
                        first = i;
                    } else if (second == -1) {
                        second = i;
                    } else {
                        // 如果有第三个字母不同，则返回false
                        return false;
                    }
                }
            }
            return second != -1 && s.charAt(first) == goal.charAt(second) && s.charAt(second) == goal.charAt(first);
        }
    }

}
