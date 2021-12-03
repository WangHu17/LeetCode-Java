
/**
 * @author wanghu
 * @discrption： 给定一个字符串 s，根据以下规则反转字符串： 所有不是英文字母的字符都保持在相同的位置。
 * 所有英文字母（小写或大写）应颠倒。 反转后返回 s。
 * @create 2021-11-17 11:14
 */
public class Easy_917_ReverseOnlyLetters {

    // 我的方法：前后双指针，跳过非字母的字符
    //Runtime: 0 ms, faster than 100.00% of Java online submissions for Reverse Only Letters.
    //Memory Usage: 37.5 MB, less than 47.52% of Java online submissions for Reverse Only Letters.
    public String reverseOnlyLetters(String s) {
        char[] s1 = s.toCharArray();
        int i = 0, j = s1.length - 1;
        while (i < j) {
            if (!Character.isLetter(s1[i]) && !Character.isLetter(s1[j])) {
                i++;
                j--;
            } else if (!Character.isLetter(s1[i])) {
                i++;
            } else if (!Character.isLetter(s1[j])) {
                j--;
            } else {
                char t = s1[i];
                s1[i] = s1[j];
                s1[j] = t;
                i++;
                j--;
            }
        }
        return String.valueOf(s1);
    }

}
