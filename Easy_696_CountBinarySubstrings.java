import org.junit.Test;

/**
 * @author wanghu
 * @discrption： 给定一个二进制字符串s，返回0和1个数相同的非空子串的个数，这些子串中的所有0和1都连续分组。
 * 多次出现的子串按它们出现的次数计算。
 * Example 1:
 * Input: s = "00110011"
 * Output: 6
 * Explanation: There are 6 substrings that have equal number of consecutive 1's and 0's:
 * "0011", "01", "1100", "10", "0011", and "01".
 * @create 2021-10-25 11:10
 */
public class Easy_696_CountBinarySubstrings {

    // 方法：将二进制字符串的连续0和1的个数放入数组中，然后遍历数组，将两两中小的值加起来就是结果
    //Runtime: 5 ms, faster than 100.00% of Java online submissions for Count Binary Substrings.
    //Memory Usage: 39.7 MB, less than 57.24% of Java online submissions for Count Binary Substrings.
    public int countBinarySubstrings(String s) {
        int[] cnt = new int[s.length()];
        char[] s1 = s.toCharArray();
        int cur = 1, n = 0, res = 0;
        for (int i = 0; i < s1.length - 1; i++) {
            if (s1[i] != s1[i + 1]) {
                cnt[n++] = cur;
                cur = 1;
            } else cur++;
        }
        cnt[n] = cur;
        for (int j = 0; j < n; j++){
            res += Math.min(cnt[j],cnt[j+1]);
        }
        return res;
    }

    @Test
    public void test() {
        System.out.println(countBinarySubstrings("110001111000000"));
    }

}
