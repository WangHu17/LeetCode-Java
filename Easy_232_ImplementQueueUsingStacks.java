import java.util.Stack;

/**
 * @author wanghu
 * @discrption： 用栈实现队列
 * @create 2021-08-19 10:19
 */
public class Easy_232_ImplementQueueUsingStacks {

    //我的方法：
    // 用两个栈，一个主栈用于存数据，一个副栈用于临时放数据。
    // 当前元素在入主栈前将其中所有元素出栈，并依次入副栈；当前元素入主栈后，弹出副栈所有元素并依次入主栈。
    //Runtime: 0 ms, faster than 100.00% of Java online submissions for Implement Queue using Stacks.
    //Memory Usage: 36.8 MB, less than 76.42% of Java online submissions for Implement Queue using Stacks.

    Stack<Integer> stack1;
    Stack<Integer> stack2;

    public Easy_232_ImplementQueueUsingStacks() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void push(int x) {
        if(stack1.isEmpty()){
            stack1.push(x);
        }else {
            while (!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
            stack1.push(x);
            while (!stack2.isEmpty()){
                stack1.push(stack2.pop());
            }
        }
    }

    public int pop() {
        return stack1.pop();
    }

    public int peek() {
        return stack1.peek();
    }

    public boolean empty() {
        return stack1.isEmpty();
    }

}
