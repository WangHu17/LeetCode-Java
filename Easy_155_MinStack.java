import org.junit.Test;

import java.util.*;

/**
 * @author wanghu
 * @discrption：设计一个支持push、pop、top、在恒定时间内检索最小元素的栈
 * @create 2021-08-06 9:17
 */
public class Easy_155_MinStack {

    //我的方法一：使用数组（太慢，太耗内存，需要手动扩容）
    // Runtime: 70 ms, faster than 8.83% of Java online submissions for Min Stack.
    //Memory Usage: 42.5 MB, less than 17.71% of Java online submissions for Min Stack.
//    private Integer[] stack;
//
//    private int size=0;
//
//    public Easy_155_MinStack() {
//        stack = new Integer[10];
//    }
//
//    public void push(int val) {
//        expandSize(size+1);
//        stack[size++] = val;
//    }
//
//    public void pop() {
//        Integer m = null;
//        if(size>0){
//            m = stack[size-1];
//            stack[size-1]=null;
//            size--;
//        }
//    }
//
//    public int top() {
//        return stack[size-1];
//    }
//
//    public int getMin() {
//        int n = size;
//        int m = stack[n-1];
//        while (n>1){
//            n--;
//            if(m>stack[n-1]){
//                m=stack[n-1];
//            }
//        }
//        return m;
//    }
//
//    private void expandSize(int size){
//        if(size > stack.length){
//            size = size*(3/2)+1;
//            stack = Arrays.copyOf(stack,size);
//        }
//    }

    //我的方法二：使用集合（更慢了）
    //Runtime: 454 ms, faster than 5.02% of Java online submissions for Min Stack.
    //Memory Usage: 40.5 MB, less than 81.19% of Java online submissions for Min Stack.
//    private List<Integer> stack = new ArrayList<>();
//
//    public Easy_155_MinStack() {
//    }
//
//    public void push(int val) {
//        stack.add(val);
//    }
//
//    public void pop() {
//        stack.remove(stack.size()-1);
//    }
//
//    public int top() {
//        return stack.get(stack.size()-1);
//    }
//
//    public int getMin() {
//        return Collections.min(stack);
//    }

    //方法三（柳婼）：好吧，原来可以直接用栈结构。使用两个栈，一个存原始数据，一个存最小值
    //Runtime: 5 ms, faster than 59.20% of Java online submissions for Min Stack.
    //Memory Usage: 40.9 MB, less than 44.16% of Java online submissions for Min Stack.
    private Stack<Integer> stack = new Stack<>();
    private Stack<Integer> min = new Stack<>();

    public Easy_155_MinStack() {
    }

    public void push(int val) {
        stack.push(val);
        if (min.isEmpty() || min.peek() >= val) {
            min.push(val);
        }
    }

    public void pop() {
        if (stack.peek().equals(min.peek())) {
            stack.pop();
            min.pop();
        } else {
            stack.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return min.peek();
    }

    @Test
    public void test(){
        Easy_155_MinStack s = new Easy_155_MinStack();
        s.push(512);
        s.push(-1024);
        s.push(-1024);
        s.push(512);
        s.pop();
        System.out.println("最小："+s.getMin());
        s.pop();
        System.out.println("最小："+s.getMin());
        s.pop();
        System.out.println("最小："+s.getMin());
    }

}
