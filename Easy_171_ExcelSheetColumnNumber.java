import org.junit.Test;

/**
 * @author wanghu
 * @discrption： 26进制转十进制
 * @create 2021-08-09 11:02
 */
public class Easy_171_ExcelSheetColumnNumber {

    //我的方法
    //Runtime: 1 ms, faster than 100.00% of Java online submissions for Excel Sheet Column Number.
    //Memory Usage: 39.2 MB, less than 30.68% of Java online submissions for Excel Sheet Column Number.
    public int titleToNumber(String columnTitle) {
        int len = columnTitle.length();
        int sum = 0;
        for (int i = len - 1; i >= 0; i--) {
            sum += (columnTitle.charAt(i) - 'A' + 1)*Math.pow(26,len-1-i);
        }
        return sum;
    }

    //Runtime: 1 ms, faster than 100.00% of Java online submissions for Excel Sheet Column Number.
    //Memory Usage: 39 MB, less than 46.44% of Java online submissions for Excel Sheet Column Number.
    public int titleToNumber1(String columnTitle) {
        int sum = 0;
        for (int i = 0; i < columnTitle.length(); i++) {
            sum = sum*26 + columnTitle.charAt(i) - 'A' + 1;
        }
        return sum;
    }

    @Test
    public void test(){
        System.out.println(titleToNumber1("AB"));
    }

}
