/**
 * @author wanghu
 * @discrption：
 * 实现 strStr()。 返回 haystack 中第一次出现针的索引，如果针不是 haystack 的一部分，则返回 -1。
 * @create 2021-10-15 9:19
 */
public class Easy_28_Implement_strStr {

    //改进滑动窗口
    //Runtime: 4 ms, faster than 96.25% of Java online submissions for Implement strStr().
    //Memory Usage: 40.6 MB, less than 13.06% of Java online submissions for Implement strStr().
    public int strStr(String haystack, String needle) {
        int len2 = needle.length();
        if (len2 == 0) return 0;
        int len1 = haystack.length();
        if (len1 == 0 || len1 < len2) return -1;
        char[] arr1 = haystack.toCharArray();
        char[] arr2 = needle.toCharArray();
        for (int i = 0; i <= len1 - len2; i++) {
            int j = 0;
            //如果首字符和尾字符相同
            if (arr1[i] == arr2[j] && arr1[i + len2 - 1] == arr2[len2 - 1]) {
                while (j < len2 && arr1[i + j] == arr2[j])
                    j++;
                if (j == len2) return i;
            }
        }
        return -1;
    }

    //我的方法：滑动窗口
    //Runtime: 1603 ms, faster than 16.31% of Java online submissions for Implement strStr().
    //Memory Usage: 39.4 MB, less than 47.06% of Java online submissions for Implement strStr().
    public int strStr2(String haystack, String needle) {
        if (needle.equals("")) return 0;
        if (needle.length() > haystack.length()) return -1;
        int i = 0;
        while (i < haystack.length() - needle.length()) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                int j;
                for (j = 1; j < needle.length(); j++) {
                    if (haystack.charAt(i + j) != needle.charAt(j)) {
                        i++;
                        break;
                    }
                }
                if (j == needle.length()) return i;
            } else {
                i++;
            }
        }
        return -1;
    }

    //投机取巧
    public int strStr1(String haystack, String needle) {
        return haystack.indexOf(needle);
    }

}
