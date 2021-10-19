import org.junit.Test;

/**
 * @author wanghu
 * @discrption： 给定一个字符串 s，返回字符串中的段数。 段被定义为连续的非空格字符序列。
 * @create 2021-10-19 11:35
 */
public class Easy_434_NumberOfSegmentsInAString {

    //我的方法：先去掉字符串前后空格，再按照正则表达式规则进行分割字符串
    //Runtime: 5 ms, faster than 5.54% of Java online submissions for Number of Segments in a String.
    //Memory Usage: 39 MB, less than 6.16% of Java online submissions for Number of Segments in a String.
    public int countSegments(String s) {
        String regex = "\\s+";
        String s1 = s.trim();
        return s1.equals("")?0:s1.split(regex).length;
    }

    @Test
    public void test(){
        String s = "    foo    bar";
        String regex = "\\s+";
        String s1 = s.trim();
        String[] split = s1.split(regex);
        for (String s2:split){
            System.out.println(s2);
        }
    }

}
