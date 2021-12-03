import java.util.Arrays;

/**
 * @author wanghu
 * @discrption： 给定一个唯一整数salary数组，其中salary[i]是雇员i的工资。 返回不包括最低和最高工资的员工平均工资。
 * @create 2021-11-24 14:26
 */
public class Easy_1491_AverageSalaryExcludingTheMinimumAndMaximumSalary {

    //我的方法
    //Runtime: 0 ms, faster than 100.00% of Java online submissions for Average Salary Excluding the Minimum and Maximum Salary.
    //Memory Usage: 36.7 MB, less than 73.53% of Java online submissions for Average Salary Excluding the Minimum and Maximum Salary.
    public double average(int[] salary) {
        Arrays.sort(salary);
        int sum = 0;
        double ave = 0.0;
        for (int i = 1; i < salary.length - 1; i++) {
            sum += salary[i];
        }
        return (double) sum / (salary.length - 2);
    }

}
