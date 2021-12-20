/**
 * @author wanghu
 * @discrption： 求补码
 * @create 2021-12-20 9:42
 */
public class Easy_1009_ComplementOfBase10Integer {

    //我的方法
    //Runtime: 0 ms, faster than 100.00% of Java online submissions for Complement of Base 10 Integer.
    //Memory Usage: 35.7 MB, less than 69.98% of Java online submissions for Complement of Base 10 Integer.
    public int bitwiseComplement(int n) {
        if (n == 0)return 1;
        int res = 0, index = 1;
        while (n != 0) {
            int cur = n & 1;
            n = n >> 1;
            res += (cur == 1 ? 0 : 1) * index;
            index *= 2;
        }
        return res;
    }

}
