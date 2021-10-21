/**
 * @author wanghu
 * @discrption：
 * 给你一个字符串 s 代表学生的出勤记录，其中每个字符表示该学生当天是缺席、迟到还是出席。
 * 该记录仅包含以下三个字符：
 *      'A'：缺席。
 *      'L'：迟到。
 *      'P'：出席。
 * 如果学生满足以下两个条件，则有资格获得出勤奖：
 *      学生缺席 ('A') 的总天数严格少于 2 天。
 *      学生从未连续 3 天或更长时间迟到 ('L')。
 * 如果学生有资格获得出勤奖励，则返回 true，否则返回 false。
 * @create 2021-10-21 11:10
 */
public class Easy_551_StudentAttendanceRecordI {

    // 我的方法
    //Runtime: 1 ms, faster than 45.98% of Java online submissions for Student Attendance Record I.
    //Memory Usage: 39.4 MB, less than 6.83% of Java online submissions for Student Attendance Record I.
    public boolean checkRecord(String s) {
        int ASum = 0, LSum = 1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'A') {
                ASum++;
                if (ASum > 1) return false;
            }
            if (i < s.length()-1 && s.charAt(i) == 'L' && s.charAt(i + 1) == 'L') {
                LSum++;
                if (LSum == 3) return false;
            } else {
                LSum = 1;
            }
        }
        return true;
    }

}
