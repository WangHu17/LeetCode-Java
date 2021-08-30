import java.util.Arrays;

/**
 * @author wanghu
 * @discrption： 给定一个字符串 s，只反转字符串中的所有元音并返回它。
 * @create 2021-08-30 9:31
 */
public class Easy_345_ReverseVowelsOfAString {

    //我的方法
    //Runtime: 8 ms, faster than 29.97% of Java online submissions for Reverse Vowels of a String.
    //Memory Usage: 41.6 MB, less than 13.97% of Java online submissions for Reverse Vowels of a String.
    public String reverseVowels(String s) {
        char[] c = s.toCharArray();
        int i=0,j=s.length()-1;
        while (i<j){
            if("AEIOUaeiou".indexOf(c[i])==-1){
                i++;
            }
            if("AEIOUaeiou".indexOf(c[j])==-1){
                j--;
            }
            if(("AEIOUaeiou".indexOf(c[i])!=-1)&&("AEIOUaeiou".indexOf(c[j])!=-1)){
                char temp = c[i];
                c[i] = c[j];
                c[j] = temp;
                i++;
                j--;
            }
        }
        return String.valueOf(c);
    }

}
