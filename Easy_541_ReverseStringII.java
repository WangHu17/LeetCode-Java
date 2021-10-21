import java.util.Arrays;

/**
 * @author wanghu
 * @discrption： 给定一个字符串 s 和一个整数 k，从字符串的开头开始，每 2k 个字符反转前 k 个字符。
 * 如果剩下的字符少于 k 个，则将它们全部反转。如果小于 2k 但大于或等于 k 个字符，则将前 k 个字符反转，其他保持原样。
 * @create 2021-10-21 10:26
 */
public class Easy_541_ReverseStringII {

    //改进方法
    //Runtime: 1 ms, faster than 83.49% of Java online submissions for Reverse String II.
    //Memory Usage: 38.8 MB, less than 93.51% of Java online submissions for Reverse String II.
    public String reverseStr(String s, int k) {
        char[] s1 = s.toCharArray();
        for (int i = 0; i < s1.length; i += 2 * k) {
            int left = i, right = Math.min(i + k - 1, s1.length - 1);
            while (left <= right) {
                char t = s1[left];
                s1[left++] = s1[right];
                s1[right--] = t;
            }
        }
        return new String(s1);
    }

    // 我的方法
    //Runtime: 69 ms, faster than 5.10% of Java online submissions for Reverse String II.
    //Memory Usage: 52 MB, less than 5.17% of Java online submissions for Reverse String II.
    public String reverseStr1(String s, int k) {
        char[] s1 = s.toCharArray();
        for (int i = 0; i < s1.length; i += 2 * k) {
            int left = i, right;
            if (i + k < s1.length) {
                right = i + k - 1;
            }else {
                right = s1.length - 1;
            }
            while (left <= right) {
                char t = s1[left];
                s1[left] = s1[right];
                s1[right] = t;
                left++;
                right--;
            }
        }
        String regex = "[\\[\\]\\s,]";
        return Arrays.toString(s1).replaceAll(regex,"");
    }

}
