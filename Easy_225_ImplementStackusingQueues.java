import java.util.LinkedList;
import java.util.Queue;

/**
 * @author wanghu
 * @discrption： 用队列实现栈
 * @create 2021-08-18 11:22
 */
public class Easy_225_ImplementStackusingQueues {

    //方法：每入队一个元素，就将它前面的所有元素依次出队再入队
    //Runtime: 0 ms, faster than 100.00% of Java online submissions for Implement Stack using Queues.
    //Memory Usage: 36.9 MB, less than 55.63% of Java online submissions for Implement Stack using Queues.
    private Queue<Integer> queue;

    public Easy_225_ImplementStackusingQueues() {
        queue = new LinkedList<>();
    }

    public void push(int x) {
        queue.offer(x);
        int size = queue.size();
        while (size-- > 1){
            queue.offer(queue.poll());
        }
    }

    public int pop() {
        return queue.poll();
    }

    public int top() {
        return queue.peek();
    }

    public boolean empty() {
        return queue.isEmpty();
    }

}
