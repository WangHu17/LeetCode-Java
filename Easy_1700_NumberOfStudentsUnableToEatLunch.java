import java.util.LinkedList;
import java.util.Queue;

/**
 * @author wanghu
 * @discrption： 学校食堂在午休时间提供圆形和方形三明治，分别用数字 0 和 1 表示。所有学生都排成一排。
 * 每个学生要么喜欢方形三明治，要么喜欢圆形三明治。 食堂的三明治数量与学生人数相等。三明治被放在一叠。
 * 在每一步： 如果队列前面的学生更喜欢堆栈顶部的三明治，他们将拿走它并离开队列。 否则，他们将离开它并走到队列的末尾。
 * 这种情况一直持续到排队的学生都不想吃最上层的三明治并因此无法进食。 给你两个整数数组students和sandwiches，
 * 其中sandwiches[i]是栈中第i个三明治的类型（i = 0是栈顶），student[j]是首选项初始队列中的第 j 个学生（j = 0 是队列的最前面）。
 * 返回无法进食的学生人数。
 * @create 2021-11-29 18:54
 */
public class Easy_1700_NumberOfStudentsUnableToEatLunch {

    //Runtime: 1 ms, faster than 68.34% of Java online submissions for Number of Students Unable to Eat Lunch.
    //Memory Usage: 37.3 MB, less than 47.64% of Java online submissions for Number of Students Unable to Eat Lunch.
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < students.length; i++) {
            queue.offer(students[i]);
        }
        int sum = 0, i = 0;
        while (!queue.isEmpty() && sum < queue.size()) {
            if (queue.peek() == sandwiches[i]) {
                queue.poll();
                i++;
                sum = 0;
            } else {
                queue.offer(queue.poll());
                sum++;
            }
        }
        return sum;
    }

}
