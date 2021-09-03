/**
 * @author wanghu
 * @discrption：
 * Example 1:
 * Input: digits = [1,2,3]
 * Output: [1,2,4]
 * Explanation: The array represents the integer 123.
 * Incrementing by one gives 123 + 1 = 124.
 * Thus, the result should be [1,2,4].
 * @create 2021-09-03 14:23
 */
public class Easy_66_PlusOne {

    //方法：从后向前遍历，如果是9就变成0，一旦不是9就加一，原数组全是9才需要重建一个数组并且首位是1
    //Runtime: 0 ms, faster than 100.00% of Java online submissions for Plus One.
    //Memory Usage: 39.1 MB, less than 11.00% of Java online submissions for Plus One.
    public int[] plusOne(int[] digits) {
        int i = digits.length - 1;
        //从后向前遍历，如果是9就变成0
        while (i>=0 && digits[i]==9) {
            digits[i] = 0;
            i--;
        }
        //原数组全是9才需要重建一个数组并且首位是1
        if (i==-1) {
            int[] res = new int[digits.length + 1];
            res[0] = 1;
            return res;
        }
        //一旦不是9就加一
        digits[i]++;
        return digits;
    }

}
