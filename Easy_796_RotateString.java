/**
 * @author wanghu
 * @discrption： 给定两个字符串 s 和目标，当且仅当 s 可以在 s 上进行一定次数的移位后成为目标时才返回 true。
 * s 上的移位包括将 s 最左边的字符移动到最右边的位置。 例如，如果 s = "abcde"，那么一班后就是 "bcdea"。
 * @create 2021-10-26 10:30
 */
public class Easy_796_RotateString {

    // 方法：将对比字符串延长一倍，如果它包含目标字符串，则可旋转得到
    //Runtime: 0 ms, faster than 100.00% of Java online submissions for Rotate String.
    //Memory Usage: 38.7 MB, less than 39.60% of Java online submissions for Rotate String.
    public boolean rotateString(String s, String goal) {
        return s.length() == goal.length() && (s + s).contains(goal);
    }

}
