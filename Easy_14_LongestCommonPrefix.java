/**
 * @author wanghu
 * @discrption： 编写一个函数来查找字符串数组中最长的公共前缀字符串。 如果没有公共前缀，则返回空字符串“”。
 * @create 2021-10-14 10:25
 */
public class Easy_14_LongestCommonPrefix {

    //方法：双层循环遍历，以第一个字符串为参照，如果后面某个字符串到末位了，或者字符不一样了，就返回首字符串的前i个字符。
    //Runtime: 2 ms, faster than 41.82% of Java online submissions for Longest Common Prefix.
    //Memory Usage: 39.1 MB, less than 19.60% of Java online submissions for Longest Common Prefix.
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        for (int i = 0; i < strs[0].length(); i++) {
            for (int j = 1; j < strs.length; j++) {
                if (i == strs[j].length() || strs[j].charAt(i) != strs[0].charAt(i))
                    return strs[0].substring(0, i);
            }
        }
        return strs[0];
    }

}
