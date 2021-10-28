import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/**
 * @author wanghu
 * @discrption：
 * @create 2021-10-28 11:05
 */
public class Easy_819_MostCommonWord {

    //我的方法：用StringBuilder保存单词，如果不是禁词就放入map中，最后遍历map找出最多个数的单词
    //Runtime: 5 ms, faster than 95.44% of Java online submissions for Most Common Word.
    //Memory Usage: 39.3 MB, less than 65.60% of Java online submissions for Most Common Word.
    public String mostCommonWord(String paragraph, String[] banned) {
        HashMap<String, Integer> map = new HashMap<>();
        StringBuilder builder = new StringBuilder();
        List<String> bannedList = Arrays.asList(banned);
        for (char c : paragraph.toCharArray()) {
            if (Character.isLetter(c)) {
                builder.append(c);
            } else if (builder.length() != 0) {
                String s = builder.toString();
                String s1 = s.toLowerCase();
                if (!bannedList.contains(s1)){
                    map.put(s1, map.getOrDefault(s1, 0) + 1);
                }
                builder = new StringBuilder();
            }
        }
        if (builder.length() != 0) {
            String s = builder.toString();
            String s1 = s.toLowerCase();
            if (!bannedList.contains(s1)) {
                map.put(s1, map.getOrDefault(s1, 0) + 1);
            }
        }
        Integer max = Collections.max(map.values());
        for (String s:map.keySet()){
            if (map.get(s).equals(max)){
                return s;
            }
        }
        return null;
    }

}
