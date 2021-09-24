import java.util.HashSet;

/**
 * @author wanghu
 * @discrption： 求字符串数组中的字符串转换成摩斯电码一共有几种
 * @create 2021-09-24 9:24
 */
public class Easy_804_UniqueMorseCodeWords {

    //我的方法
    //Runtime: 2 ms, faster than 64.92% of Java online submissions for Unique Morse Code Words.
    //Memory Usage: 38.5 MB, less than 38.84% of Java online submissions for Unique Morse Code Words.
    public int uniqueMorseRepresentations(String[] words) {
        String[] code = new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        HashSet<String> set = new HashSet<>();
        for (String word:words){
            char[] characters = word.toCharArray();
            String morseCode = "";
            for (char character:characters){
                morseCode += code[character-'a'];
            }
            set.add(morseCode);
        }
        return set.size();
    }

}
