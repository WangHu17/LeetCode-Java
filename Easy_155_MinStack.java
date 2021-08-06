import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author wanghu
 * @discrption：设计一个支持push、pop、top、在恒定时间内检索最小元素的栈
 * @create 2021-08-06 9:17
 */
public class Easy_155_MinStack {

    //我的方法一：使用数组（太慢，太耗内存，需要手动扩容）
    // Runtime: 70 ms, faster than 8.83% of Java online submissions for Min Stack.
    //Memory Usage: 42.5 MB, less than 17.71% of Java online submissions for Min Stack.
    private Integer[] stack;

    private int size=0;

    public Easy_155_MinStack() {
        stack = new Integer[10];
    }

    public void push(int val) {
        expandSize(size+1);
        stack[size++] = val;
    }

    public void pop() {
        Integer m = null;
        if(size>0){
            m = stack[size-1];
            stack[size-1]=null;
            size--;
        }
    }

    public int top() {
        return stack[size-1];
    }

    public int getMin() {
        int n = size;
        int m = stack[n-1];
        while (n>1){
            n--;
            if(m>stack[n-1]){
                m=stack[n-1];
            }
        }
        return m;
    }

    private void expandSize(int size){
        if(size > stack.length){
            size = size*(3/2)+1;
            stack = Arrays.copyOf(stack,size);
        }
    }

}
