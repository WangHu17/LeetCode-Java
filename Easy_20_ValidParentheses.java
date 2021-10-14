import java.util.Stack;

/**
 * @author wanghu
 * @discrption：
 * 给定一个仅包含字符 '(', ')', '{', '}', '[' 和 ']' 的字符串 s，确定输入字符串是否有效。
 * 输入字符串在以下情况下有效：
 *      开括号必须由相同类型的括号封闭。
 *      左括号必须以正确的顺序关闭。
 * @create 2021-10-14 14:20
 */
public class Easy_20_ValidParentheses {

    //我的方法：用栈
    //Runtime: 3 ms, faster than 33.70% of Java online submissions for Valid Parentheses.
    //Memory Usage: 38.7 MB, less than 26.90% of Java online submissions for Valid Parentheses.
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (Character c:s.toCharArray()){
            if (c == '(' || c == '[' || c == '{'){
                stack.push(c);
            }else {
                if (stack.isEmpty())return false;
                Character pop = stack.pop();
                if (c == ')' && pop == '('){
                }else if (c == ']' && pop == '['){
                }else if (c == '}' && pop == '{'){
                }else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

}
