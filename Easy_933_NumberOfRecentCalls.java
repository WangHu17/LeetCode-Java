import java.util.LinkedList;
import java.util.Queue;

/**
 * @author wanghu
 * @discrption：
 * @create 2021-11-30 14:45
 */
public class Easy_933_NumberOfRecentCalls {

    //Runtime: 18 ms, faster than 86.85% of Java online submissions for Number of Recent Calls.
    //Memory Usage: 47.3 MB, less than 91.16% of Java online submissions for Number of Recent Calls.
    private Queue<Integer> queue;

    public Easy_933_NumberOfRecentCalls() {
        queue = new LinkedList<>();
    }

    public int ping(int t) {
        queue.offer(t);
        while(queue.peek() < t - 3000)queue.poll();
        return queue.size();
    }

}
