/**
 * @author wanghu
 * @discrption： 我们有两个特殊字符： 第一个字符可以用一位 0 表示。 第二个字符可以用两位（10 或 11）表示。
 * 给定一个以 0 结尾的二进制数组位，如果最后一个字符必须是一位字符，则返回 true。
 * @create 2021-09-18 14:10
 */
public class Easy_717_1bitAnd2bitCharacters {

    public boolean isOneBitCharacter(int[] bits) {
        int i = 0;
        while (i < bits.length-1) {
            if (bits[i]==1){
                i+=2;
            }else {
                i++;
            }
        }
        if (i == bits.length-1)return true;
        return false;
    }

}
