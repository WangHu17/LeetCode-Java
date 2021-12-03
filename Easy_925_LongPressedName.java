/**
 * @author wanghu
 * @discrption： 你的朋友正在键盘上输入他的名字。有时，在键入字符 c 时，可能会长按该键，并且该字符将被键入 1 次或多次。
 * 您检查键盘的键入字符。如果它可能是您的朋友姓名，则返回 True，其中某些字符（可能没有）被长按。
 * @create 2021-11-17 11:25
 */
public class Easy_925_LongPressedName {

    // 方法：双指针
    //Runtime: 0 ms, faster than 100.00% of Java online submissions for Long Pressed Name.
    //Memory Usage: 37.1 MB, less than 81.37% of Java online submissions for Long Pressed Name.
    public boolean isLongPressedName(String name, String typed) {
        if (name.length() > typed.length()) return false;
        if (name.equals(typed)) return true;
        int p = 0, q = 0;
        char cur = name.charAt(0);
        while (p < name.length() && q < typed.length()) {
            if (name.charAt(p) == typed.charAt(q)) {
                cur = name.charAt(p);
                p++;
                q++;
            } else if (typed.charAt(q) == cur) {
                q++;
            } else
                return false;
        }
        while (q < typed.length() && typed.charAt(q) == cur)
            q++;
        return p == name.length() && q == typed.length();
    }

}
