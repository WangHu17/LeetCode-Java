import java.util.Stack;

/**
 * @author wanghu
 * @discrption： 求字符串中最多的括号层数
 * @create 2021-11-29 18:43
 */
public class Easy_1614_MaximumNestingDepthOfTheParentheses {

    //我的方法
    //Runtime: 1 ms, faster than 55.18% of Java online submissions for Maximum Nesting Depth of the Parentheses.
    //Memory Usage: 37.5 MB, less than 37.02% of Java online submissions for Maximum Nesting Depth of the Parentheses.
    public int maxDepth(String s) {
        Stack<Character> stack = new Stack<>();
        int max = 0, cur = 0;
        for (Character c : s.toCharArray()) {
            if (c == '(') {
                stack.push('(');
                cur++;
                max = Math.max(max, cur);
            } else if (c == ')') {
                stack.pop();
                cur--;
            }
        }
        return max;
    }

}
