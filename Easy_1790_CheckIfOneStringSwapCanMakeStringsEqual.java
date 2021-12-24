/**
 * @author wanghu
 * @discrption： 给定两个长度相等的字符串 s1 和 s2。字符串交换是一种操作，您可以在其中选择字符串中的两个索引（不一定不同）
 * 并交换这些索引处的字符。 如果可以通过对恰好一个字符串执行最多一次字符串交换来使两个字符串相等，则返回 true。否则，返回false。
 * @create 2021-12-24 11:30
 */
public class Easy_1790_CheckIfOneStringSwapCanMakeStringsEqual {

    //Runtime: 0 ms, faster than 100.00% of Java online submissions for Check if One String Swap Can Make Strings Equal.
    //Memory Usage: 37.1 MB, less than 82.69% of Java online submissions for Check if One String Swap Can Make Strings Equal.
    public boolean areAlmostEqual(String s1, String s2) {
        int count = 0;
        Character p1 = null, p2 = null;
        for (int i = 0; i < s1.length(); i++) {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);
            if (c1 != c2 && count == 2)
                return false;
            else if (c1 != c2 && p1 == null) {
                p1 = c1;
                p2 = c2;
                count++;
            } else if (c1 != c2 && p1 != null) {
                if (p1 != c2 || p2 != c1) return false;
                count++;
            }
        }
        return count == 0 || count == 2;
    }

}
