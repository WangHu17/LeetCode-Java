import java.util.Stack;

/**
 * @author wanghu
 * @discrption： 给定一个由小写英文字母组成的字符串 s。重复删除包括选择两个相邻且相等的字母并将其删除。
 * 我们反复对 s 进行重复删除，直到我们不再可以。 在完成所有此类重复删除后，返回最终字符串。可以证明答案是唯一的。
 * @create 2021-11-26 14:29
 */
public class Easy_1047_RemoveAllAdjacentDuplicatesInString {

    //我的方法
    //Runtime: 24 ms, faster than 47.61% of Java online submissions for Remove All Adjacent Duplicates In String.
    //Memory Usage: 39.6 MB, less than 70.89% of Java online submissions for Remove All Adjacent Duplicates In String.
    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder builder = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (stack.isEmpty()) {
                stack.push(c);
            } else {
                if (stack.peek() == c) {
                    stack.pop();
                } else {
                    stack.push(c);
                }
            }
        }
        while (!stack.isEmpty()) {
            builder.append(stack.pop());
        }
        return builder.reverse().toString();
    }

}
