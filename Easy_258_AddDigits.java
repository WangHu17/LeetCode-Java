/**
 * @author wanghu
 * @discrption： 给定一个整数 num，重复将其所有数字相加，直到结果只有一位，并返回它。
 * @create 2021-08-24 11:08
 */
public class Easy_258_AddDigits {

    //我的方法
    //Runtime: 1 ms, faster than 100.00% of Java online submissions for Add Digits.
    //Memory Usage: 35.8 MB, less than 88.38% of Java online submissions for Add Digits.
    public int addDigits(int num) {
        while (num/10!=0){
           int n = 0;
           while (num!=0){
               n+=num%10;
               num/=10;
           }
           num=n;
        }
        return num;
    }

    //牛逼方法
    int addDigits1(int num) {
        return num - (num - 1) / 9 * 9;
    }

}
