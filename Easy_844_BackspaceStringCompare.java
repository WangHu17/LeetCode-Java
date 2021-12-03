import java.util.Stack;

/**
 * @author wanghu
 * @discrption： 给定两个字符串 s 和 t，如果它们在空文本编辑器中输入时相等，则返回 true。 '#' 表示退格字符。
 * 请注意，在退格空文本后，文本将继续为空。
 * @create 2021-11-17 10:18
 */
public class Easy_844_BackspaceStringCompare {

    // 我的方法：使用栈
    //Runtime: 1 ms, faster than 71.57% of Java online submissions for Backspace String Compare.
    //Memory Usage: 37 MB, less than 89.51% of Java online submissions for Backspace String Compare.
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> stack = new Stack<>();
        Stack<Character> stack1 = new Stack<>();
        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();
        for (char c : s1) {
            if (c == '#' && !stack.isEmpty()) stack.pop();
            else if (c != '#') stack.push(c);
        }
        for (char c : t1) {
            if (c == '#' && !stack1.isEmpty()) stack1.pop();
            else if (c != '#') stack1.push(c);
        }
        if (stack.size() != stack1.size()) return false;
        while (!stack.isEmpty()) {
            if (stack.pop() != stack1.pop()) return false;
        }
        return true;
    }

}
