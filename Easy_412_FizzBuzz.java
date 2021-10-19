import java.util.ArrayList;
import java.util.List;

/**
 * @author wanghu
 * @discrption： 给定一个整数 n，返回一个字符串数组答案（1-indexed），其中：
 * answer[i] == "FizzBu​​zz" 如果 i 可以被 3 和 5 整除。
 * answer[i] == "Fizz" 如果 i 能被 3 整除。
 * answer[i] == "Buzz" 如果 i 能被 5 整除。
 * answer[i] == i 如果以上条件都不成立。
 * @create 2021-10-19 10:59
 */
public class Easy_412_FizzBuzz {

    //我的方法
    //Runtime: 1 ms, faster than 99.67% of Java online submissions for Fizz Buzz.
    //Memory Usage: 45.1 MB, less than 35.39% of Java online submissions for Fizz Buzz.
    public List<String> fizzBuzz(int n) {
        ArrayList<String> res = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                res.add("FizzBuzz");
            } else if (i % 3 == 0) {
                res.add("Fizz");
            } else if (i % 5 == 0) {
                res.add("Buzz");
            } else {
                res.add(Integer.toString(i));//用Integer.toString(i) 、String.valueOf(i) 、i+"" 时间居然相差很大
            }
        }
        return res;
    }

}
