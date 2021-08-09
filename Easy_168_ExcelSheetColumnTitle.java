import org.junit.Test;

/**
 * @author wanghu
 * @discrption： 十进制转26进制
 * @create 2021-08-09 9:29
 */
public class Easy_168_ExcelSheetColumnTitle {

    //我的方法
    //Runtime: 0 ms, faster than 100.00% of Java online submissions for Excel Sheet Column Title.
    //Memory Usage: 36.5 MB, less than 38.37% of Java online submissions for Excel Sheet Column Title.
    public String convertToTitle(int columnNumber) {
        StringBuilder stringBuilder = new StringBuilder(8);
        char[] s = {'Z','A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y'};
        while (columnNumber != 0) {
            int n = columnNumber%26;
            if(n==0){
                columnNumber--;
            }
            stringBuilder.append(s[n]);
            columnNumber = columnNumber/26;
        }
        return stringBuilder.reverse().toString();
    }

    @Test
    public void test(){
        System.out.println(convertToTitle(701));
    }


}
