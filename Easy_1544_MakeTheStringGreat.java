import java.util.Stack;

/**
 * @author wanghu
 * @discrption： 删除字符串中相邻的相同但大小写不同的字母
 * @create 2021-11-29 18:21
 */
public class Easy_1544_MakeTheStringGreat {

    //我的方法
    //Runtime: 3 ms, faster than 52.30% of Java online submissions for Make The String Great.
    //Memory Usage: 38.7 MB, less than 75.55% of Java online submissions for Make The String Great.
    public String makeGood(String s) {
        Stack<Character> stack = new Stack<>();
        for (Character c : s.toCharArray()) {
            if (stack.isEmpty()) {
                stack.push(c);
            } else {
                if (Character.isUpperCase(c)) {
                    if (stack.peek() == Character.toLowerCase(c))
                        stack.pop();
                    else stack.push(c);
                } else {
                    if (stack.peek() == Character.toUpperCase(c))
                        stack.pop();
                    else stack.push(c);
                }
            }
        }
        StringBuilder builder = new StringBuilder();
        while (!stack.isEmpty()) {
            builder.append(stack.pop());
        }
        return builder.reverse().toString();
    }

}
