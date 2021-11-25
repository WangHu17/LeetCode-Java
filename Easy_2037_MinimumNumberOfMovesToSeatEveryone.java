import java.util.Arrays;

/**
 * @author wanghu
 * @discrption： 一个房间有n个座位和n个学生。给定一个长度为 n 的数组座位，其中座位 [i] 是第 i 个座位的位置。
 * 还给出了长度为 n 的数组 student ，其中 Students[j] 是第 j 个学生的位置。 您可以多次执行以下移动：
 * 将第 i 个学生的位置增加或减少 1（即，将第 i 个学生从位置 x 移动到 x + 1 或 x - 1）
 * 返回将每个学生移动到一个座位所需的最小移动次数，以便没有两个学生坐在同一个座位上。
 * 请注意，一开始可能会有多个座位或学生处于同一位置。
 * @create 2021-11-25 14:39
 */
public class Easy_2037_MinimumNumberOfMovesToSeatEveryone {

    //我的方法
    //Runtime: 1 ms, faster than 100.00% of Java online submissions for Minimum Number of Moves to Seat Everyone.
    //Memory Usage: 38.8 MB, less than 62.72% of Java online submissions for Minimum Number of Moves to Seat Everyone.
    public int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);
        int sum = 0;
        for (int i = 0; i < seats.length; i++) {
            sum += Math.abs(seats[i] - students[i]);
        }
        return sum;
    }

}
