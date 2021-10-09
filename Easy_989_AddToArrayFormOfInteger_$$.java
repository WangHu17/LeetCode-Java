import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

/**
 * @author wanghu
 * @discrption：
 * @create 2021-10-09 11:16
 */
public class Easy_989_AddToArrayFormOfInteger_$$ {

    //我的方法：错误，int越界
    public List<Integer> addToArrayForm(int[] num, int k) {
        int sum = 0;
        for (int j : num) {
            sum = sum * 10 + j;
        }
        sum += k;
        System.out.println(sum);
        Stack<Integer> stack = new Stack<>();
        while (sum != 0) {
            int cur = sum % 10;
            sum /= 10;
            System.out.println(cur);
            stack.push(cur);
        }
        ArrayList<Integer> res = new ArrayList<>();
        while (!stack.isEmpty()) {
            res.add(stack.pop());
        }
        return res;
    }

    //官方方法
    //Runtime: 3 ms, faster than 94.70% of Java online submissions for Add to Array-Form of Integer.
    //Memory Usage: 40.2 MB, less than 78.82% of Java online submissions for Add to Array-Form of Integer.
    public List<Integer> addToArrayForm1(int[] num, int k) {
        int i = num.length - 1;
        ArrayList<Integer> list = new ArrayList<>();
        while (i-- > 0 || k > 0) {
            if (i >= 0) {
                k += num[i];
            }
            list.add(k % 10);
            k /= 10;
        }
        Collections.reverse(list);
        return list;
    }

}

