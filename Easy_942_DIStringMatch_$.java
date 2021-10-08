/**
 * @author wanghu
 * @discrption： 范围 [0, n] 中所有整数的 n + 1 个整数的置换 perm 可以表示为长度为 n 的字符串 s，其中：
 * s[i] == 'I' 如果 perm[i] < perm[i + 1]，并且
 * s[i] == 'D' 如果 perm[i] > perm[i + 1]。
 * 给定一个字符串 s，重建置换 perm 并返回它。如果有多个有效排列 perm，则返回其中任何一个。
 * @create 2021-10-08 9:36
 */
public class Easy_942_DIStringMatch_$ {

    //方法：遇到第一个'I'，给它分配0，遇到第一个'D'，给它分配当前字符串的长度。
    //      之后遇到'I'，从0依次往上递增，遇到'D'，从字符串长度依次往下递减。
    //Runtime: 3 ms, faster than 42.64% of Java online submissions for DI String Match.
    //Memory Usage: 40 MB, less than 88.12% of Java online submissions for DI String Match.
    public int[] diStringMatch(String s) {
        int n = s.length(), o = 0, i = 0;
        int[] res = new int[n + 1];
        for (Character c : s.toCharArray()) {
            if (c.equals('I')) {
                res[i++] = o++;
            } else {
                res[i++] = n--;
            }
        }
        res[i] = o;
        return res;
    }

}
