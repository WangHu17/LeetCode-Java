import java.util.Arrays;
import java.util.Comparator;

/**
 * @author wanghu
 * @discrption：
 * 您将获得一组日志。每个日志都是一个以空格分隔的单词串，其中第一个单词是标识符。
 * 有两种类型的日志：
 *      字母日志：所有单词（标识符除外）都由小写英文字母组成。
 *      数字日志：所有单词（标识符除外）都由数字组成。
 * 重新排序这些日志，以便：
 *      字母日志出现在所有数字日志之前。
 *      字母日志按其内容按字典顺序排序。
 *      如果它们的内容相同，则按它们的标识符按字典顺序对它们进行排序。
 *      数字日志保持它们的相对顺序。
 *      返回日志的最终顺序。
 * @create 2021-09-30 11:13
 */
public class Easy_937_ReorderDataInLogFiles_$ {

    //方法：使用java自带排序算法，自定义排序规则
    //Runtime: 5 ms, faster than 76.46% of Java online submissions for Reorder Data in Log Files.
    //Memory Usage: 39.3 MB, less than 82.92% of Java online submissions for Reorder Data in Log Files.
    public String[] reorderLogFiles(String[] logs) {
        Comparator<String> myCmp = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                //日志的内容
                String[] split1 = o1.split(" ", 2);
                String[] split2 = o2.split(" ", 2);
                //内容的第一个字符
                boolean digit1 = Character.isDigit(split1[1].charAt(0));
                boolean digit2 = Character.isDigit(split2[1].charAt(0));
                //如果内容都是字母
                if (!digit1 && !digit2) {
                    int i = split1[1].compareTo(split2[1]);
                    if (i != 0) return i;
                    //如果内容一样，按标识符排序
                    return split1[0].compareTo(split2[0]);
                }
                else if (!digit1 && digit2) {
                    return -1;//这里返回-1！！！
                } else if (digit1 && !digit2) {
                    return 1;//这里返回1！！！
                }
                return 0;
            }
        };
        Arrays.sort(logs,myCmp);
        return logs;
    }

}
