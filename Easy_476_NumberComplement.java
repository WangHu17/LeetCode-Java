/**
 * @author wanghu
 * @discrption： 整数的补码是将其二进制表示中的所有 0 翻转为 1 并将所有 1 翻转为 0 时得到的整数。
 * 例如，整数 5 是二进制的“101”，其补码是“010”，即整数 2。 给定一个整数 num，返回它的补码。
 * @create 2021-12-17 10:53
 */
public class Easy_476_NumberComplement {

    //我的方法
    //Runtime: 0 ms, faster than 100.00% of Java online submissions for Number Complement.
    //Memory Usage: 35.9 MB, less than 63.71% of Java online submissions for Number Complement.
    public int findComplement(int num) {
        int res = 0, index = 1;
        while (num != 0) {
            int n = num & 1;
            num = num >> 1;
            res += (n == 1 ? 0 : 1) * index;
            index *= 2;
        }
        return res;
    }

}
