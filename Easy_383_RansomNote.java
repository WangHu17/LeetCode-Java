import java.util.Arrays;

/**
 * @author wanghu
 * @discrption： 给定两个字符串 ransomNote 和杂志，如果 ransomNote 可以从杂志中构造出来，则返回 true，否则返回 false。
 * 杂志中的每个字母在 ransomNote 中只能使用一次。
 * @create 2021-10-18 11:29
 */
public class Easy_383_RansomNote {

    //我的方法：使用数组
    //Runtime: 2 ms, faster than 98.64% of Java online submissions for Ransom Note.
    //Memory Usage: 39.7 MB, less than 51.65% of Java online submissions for Ransom Note.
    public boolean canConstruct1(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()) return false;
        int[] mapping = new int[26];
        Arrays.fill(mapping, 0);
        for (char c:magazine.toCharArray()) {
            mapping[c-'a'] += 1;
        }
        for (char c:ransomNote.toCharArray()) {
            if (mapping[c - 'a'] == 0) return false;
            else mapping[c - 'a'] -= 1;
        }
        return true;
    }
    //Runtime: 3 ms, faster than 86.65% of Java online submissions for Ransom Note.
    //Memory Usage: 39.3 MB, less than 71.06% of Java online submissions for Ransom Note.
    public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()) return false;
        int[] mapping = new int[123];
        Arrays.fill(mapping, 0);
        for (int i = 0; i < magazine.length(); i++) {
            char c = magazine.charAt(i);
            mapping[c] += 1;
        }
        for (int j = 0; j < ransomNote.length(); j++) {
            char c = ransomNote.charAt(j);
            if (mapping[c] == 0) return false;
            else mapping[c] -= 1;
        }
        return true;
    }

}
