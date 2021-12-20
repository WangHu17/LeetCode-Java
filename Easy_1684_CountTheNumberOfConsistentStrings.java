import java.util.HashSet;

/**
 * @author wanghu
 * @discrption：
 * @create 2021-12-20 10:59
 */
public class Easy_1684_CountTheNumberOfConsistentStrings {

    //Runtime: 10 ms, faster than 73.37% of Java online submissions for Count the Number of Consistent Strings.
    //Memory Usage: 39.4 MB, less than 91.80% of Java online submissions for Count the Number of Consistent Strings.
    public int countConsistentStrings(String allowed, String[] words) {
        HashSet<Character> set = new HashSet<>();
        for (Character c : allowed.toCharArray()) set.add(c);
        int count = 0, flag = 1;
        for (String word : words) {
            flag = 1;
            for (Character c : word.toCharArray()) {
                if (!set.contains(c)) {
                    flag = 0;
                    break;
                }
            }
            if (flag == 1) count++;
        }
        return count;
    }

}
