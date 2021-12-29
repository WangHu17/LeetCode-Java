/**
 * @author wanghu
 * @discrption： 给你一个字符串数组（0 索引）。 在一个操作中，选择两个不同的索引 i 和 j，其中 words[i] 是一个非空字符串，
 * 并将 words[i] 中的任何字符移动到 words[j] 中的任何位置。 如果您可以使用任意数量的操作使单词中的每个字符串相等，则返回 true，
 * 否则返回 false。
 * @create 2021-12-29 11:29
 */
public class Easy_1897_RedistributeCharactersToMakeAllStringsEqual {

    //方法：计算所有单词中的字母个数总和，判断是否每个字母数量都是数组长度的整数倍
    //Runtime: 3 ms, faster than 75.11% of Java online submissions for Redistribute Characters to Make All Strings Equal.
    //Memory Usage: 38.4 MB, less than 89.03% of Java online submissions for Redistribute Characters to Make All Strings Equal.
    public boolean makeEqual(String[] words) {
        int[] count = new int[26];
        for (String s : words) {
            for (Character c : s.toCharArray()) {
                count[c - 'a']++;
            }
        }
        int len = words.length;
        for (int i : count) {
            if (i % len != 0) return false;
        }
        return true;
    }

}
