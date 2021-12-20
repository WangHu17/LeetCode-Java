/**
 * @author wanghu
 * @discrption： 太简单了
 * @create 2021-12-20 9:51
 */
public class Easy_1342_NumberOfStepsToReduceANumberToZero {

    //我的方法
    //Runtime: 0 ms, faster than 100.00% of Java online submissions for Number of Steps to Reduce a Number to Zero.
    //Memory Usage: 35.7 MB, less than 84.57% of Java online submissions for Number of Steps to Reduce a Number to Zero.
    public int numberOfSteps(int num) {
        int sum = 0;
        while (num != 0){
            if (num % 2 == 1)
                num--;
            else
                num /= 2;
            sum++;
        }
        return sum;
    }

}
