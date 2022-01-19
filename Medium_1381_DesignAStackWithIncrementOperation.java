/**
 * @author wanghu
 * @discrption： 请你设计一个支持下述操作的栈。
 *
 * 实现自定义栈类 CustomStack ：
 * CustomStack(int maxSize)：用 maxSize 初始化对象，maxSize 是栈中最多能容纳的元素数量，
 *      栈在增长到 maxSize 之后则不支持 push 操作。
 * void push(int x)：如果栈还未增长到 maxSize ，就将 x 添加到栈顶。
 * int pop()：弹出栈顶元素，并返回栈顶的值，或栈为空时返回 -1 。
 * void inc(int k, int val)：栈底的 k 个元素的值都增加 val 。如果栈中元素总数小于 k ，
 *      则栈中的所有元素都增加 val 。
 * @create 2022-01-19 15:42
 */
public class Medium_1381_DesignAStackWithIncrementOperation {

    //我的方法
    //Runtime: 5 ms, faster than 81.48% of Java online submissions for Design a Stack With Increment Operation.
    //Memory Usage: 40 MB, less than 64.55% of Java online submissions for Design a Stack With Increment Operation.
    private int[] stack;
    private int index;

    public Medium_1381_DesignAStackWithIncrementOperation(int maxSize) {
        stack = new int[maxSize];
        index = -1;
    }

    public void push(int x) {
        if (index < stack.length - 1)
            stack[++index] = x;
    }

    public int pop() {
        int pop = -1;
        if (index >= 0)
            pop = stack[index--];
        return pop;
    }

    public void increment(int k, int val) {
        k = Math.min(k, index + 1);
        for (int i = 0; i < k; i++)
            stack[i] += val;
    }

}
