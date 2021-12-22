/**
 * @author wanghu
 * @discrption： 如果没有重复字符，则字符串是好的。 给定一个字符串s ，返回s中长度为3的好子串的个数 请注意，
 * 如果同一子字符串多次出现，则应计算每次出现的次数。 子字符串是字符串中连续的字符序列。
 * @create 2021-12-22 11:28
 */
public class Easy_1876_SubstringsOfSizeThreeWithDistinctCharacters {

    //我的方法
    //Runtime: 0 ms, faster than 100.00% of Java online submissions for Substrings of Size Three with Distinct Characters.
    //Memory Usage: 37.2 MB, less than 77.48% of Java online submissions for Substrings of Size Three with Distinct Characters.
    public int countGoodSubstrings(String s) {
        char[] chars = s.toCharArray();
        int sum = 0;
        for (int i = 0; i < chars.length - 2; i++) {
            if (chars[i] != chars[i + 1] && chars[i + 1] != chars[i + 2] && chars[i] != chars[i + 2]) sum++;
        }
        return sum;
    }

}
