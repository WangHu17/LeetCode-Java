/**
 * @author wanghu
 * @discrption： 太简单了，没什么好看的
 * @create 2021-12-15 10:16
 */
public class Easy_1672_RichestCustomerWealth {

    //我的方法
    //Runtime: 0 ms, faster than 100.00% of Java online submissions for Richest Customer Wealth.
    //Memory Usage: 38.6 MB, less than 76.89% of Java online submissions for Richest Customer Wealth.
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        for (int i = 0; i < accounts.length; i++) {
            int cur = 0;
            for (int j = 0; j < accounts[0].length; j++) {
                cur += accounts[i][j];
            }
            max = Math.max(max, cur);
        }
        return max;
    }

}
