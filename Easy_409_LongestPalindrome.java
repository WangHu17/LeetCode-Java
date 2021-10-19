import java.util.HashMap;

/**
 * @author wanghu
 * @discrption： 给定一个由小写或大写字母组成的字符串 s，返回可以用这些字母构建的最长回文的长度。
 * 字母区分大小写，例如，“Aa”在此处不被视为回文。
 * @create 2021-10-19 10:30
 */
public class Easy_409_LongestPalindrome {

    //官方方法：用数组记录字母个数，比map快很多
    //Runtime: 1 ms, faster than 100.00% of Java online submissions for Longest Palindrome.
    //Memory Usage: 37.3 MB, less than 85.90% of Java online submissions for Longest Palindrome.
    public int longestPalindrome(String s) {
        int[] count = new int[123];
        for (char c : s.toCharArray()) {
            count[c]++;
        }
        int sum = 0;
        for (int n : count) {
            sum += n / 2 * 2;
            if (sum % 2 == 0 && n % 2 == 1) sum++;
        }
        return sum;
    }

    //我的方法：用map记录字母的个数，遍历map，加上所有的偶数个数，加一个奇数个数，再加上剩下的奇数个数-1
    //Runtime: 4 ms, faster than 56.66% of Java online submissions for Longest Palindrome.
    //Memory Usage: 37.7 MB, less than 58.63% of Java online submissions for Longest Palindrome.
    public int longestPalindrome1(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        int sum = 0, flag = 1;
        for (Character key : map.keySet()) {
            Integer value = map.get(key);
            if (value % 2 == 0) sum += value;
            else {
                if (flag == 1) {
                    sum += value;
                    flag = 0;
                } else
                    sum += value - 1;
            }
        }
        return sum;
    }

}
