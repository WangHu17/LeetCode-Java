import java.util.HashMap;

/**
 * @author wanghu
 * @discrption： 给定一个罗马数字，将其转换为整数。
 * @create 2021-10-14 9:34
 */
public class Easy_13_RomanToInteger {

    //我的方法
    //Runtime: 5 ms, faster than 71.51% of Java online submissions for Roman to Integer.
    //Memory Usage: 40 MB, less than 40.12% of Java online submissions for Roman to Integer.
    public int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int sum = 0, i;
        for (i = 0; i < s.length() - 1; i++) {
            if (map.get(s.charAt(i)) >= map.get(s.charAt(i + 1))) {
                sum += map.get(s.charAt(i));
            } else {
                sum -= map.get(s.charAt(i));
            }
        }
        sum += map.get(s.charAt(i));
        return sum;
    }

}
