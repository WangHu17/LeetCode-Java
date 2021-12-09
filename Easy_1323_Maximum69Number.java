import java.util.Stack;

/**
 * @author wanghu
 * @discrption： 给定一个仅由数字 6 和 9 组成的正整数 num。 返回通过更改最多一位数字（6 变为 9，9 变为 6）可以获得的最大数字。
 * @create 2021-12-09 10:48
 */
public class Easy_1323_Maximum69Number {

    //方法二
    //Runtime: 0 ms, faster than 100.00% of Java online submissions for Maximum 69 Number.
    //Memory Usage: 35.8 MB, less than 71.56% of Java online submissions for Maximum 69 Number.
    public int maximum69Number1(int num) {
        char[] nums = String.valueOf(num).toCharArray();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == '6') {
                nums[i] = '9';
                break;
            }
        }
        return Integer.parseInt(String.valueOf(nums));
    }

    //我的方法
    //Runtime: 1 ms, faster than 55.54% of Java online submissions for Maximum 69 Number.
    //Memory Usage: 37.9 MB, less than 12.32% of Java online submissions for Maximum 69 Number.
    public int maximum69Number(int num) {
        Stack<Integer> stack = new Stack<>();
        while (num != 0) {
            stack.push(num % 10);
            num /= 10;
        }
        int flag = 1, res = 0;
        while (!stack.isEmpty()) {
            Integer pop = stack.pop();
            if (flag == 1 && pop == 6) {
                res = res * 10 + 9;
                flag = 0;
            } else
                res = res * 10 + pop;
        }
        return res;
    }

}
