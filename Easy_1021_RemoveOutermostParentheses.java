import java.util.Stack;

/**
 * @author wanghu
 * @discrption： 删除最外面的一层括号
 * @create 2021-11-26 14:08
 */
public class Easy_1021_RemoveOutermostParentheses {

    //Runtime: 4 ms, faster than 70.67% of Java online submissions for Remove Outermost Parentheses.
    //Memory Usage: 39 MB, less than 86.12% of Java online submissions for Remove Outermost Parentheses.
    public String removeOuterParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder builder = new StringBuilder();
        char[] chars = s.toCharArray();
        for (char c : chars) {
            if (c == '(') {
                if (stack.size() > 0) builder.append(c);
                stack.push(c);
            } else {
                stack.pop();
                if (stack.size() > 0) builder.append(c);
            }
        }
        return builder.toString();
    }

}
