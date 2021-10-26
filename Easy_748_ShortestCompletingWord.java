/**
 * @author wanghu
 * @discrption： 给定一个字符串 licensePlate 和一个字符串数组，找到单词中最短的完整单词。
 * 完整词是包含 licensePlate 中所有字母的词。忽略 licensePlate 中的数字和空格，并将字母视为不区分大小写。
 * 如果一个字母在 licensePlate 中出现多次，那么它在单词中出现的次数必须相同或更多。
 * 例如，如果 licensePlate = "aBc 12c"，那么它包含字母 'a'、'b'（忽略大小写）和 'c' 两次。
 * 可能的补全词是“abccdef”、“caaacab”和“cbca”。 返回单词中最短的完成单词。保证存在答案。
 * 如果有多个最短的完成词，则返回出现在词中的第一个。
 * @create 2021-10-26 9:35
 */
public class Easy_748_ShortestCompletingWord {

    // 方法：先将 licensePlate 中的字母全部以小写保存到字符串中，再单独写一个方法验证目标字符串中是否包含 licensePlate 中所有
    //      的字母（验证方法用数组），然后再循环找出最短最先出现的符合的字符串
    //Runtime: 2 ms, faster than 97.56% of Java online submissions for Shortest Completing Word.
    //Memory Usage: 38.6 MB, less than 100.00% of Java online submissions for Shortest Completing Word.
    public String shortestCompletingWord(String licensePlate, String[] words) {
        StringBuilder builder = new StringBuilder();
        for (char c:licensePlate.toCharArray()){
            if (Character.isLetter(c))
            builder.append(Character.toLowerCase(c));
        }
        String license = builder.toString();
        int minLen = Integer.MAX_VALUE, res = 0;
        for (int i=0;i<words.length;i++){
            if (words[i].length() < minLen && match(words[i], license)){
                minLen = words[i].length();
                res = i;
            }
        }
        return words[res];
    }

    public boolean match(String s,String license){
        if (s.length() < license.length())return false;
        int[] mappping = new int[26];
        for (Character c:s.toCharArray()){
            mappping[c-'a']++;
        }
        for (Character c:license.toCharArray()){
            mappping[c-'a']--;
            if (mappping[c-'a'] < 0)return false;
        }
        return true;
    }

}
