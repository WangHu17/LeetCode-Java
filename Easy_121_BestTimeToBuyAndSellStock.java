/**
 * @author wanghu
 * @discrption： 找到股票的最佳的购买和抛售时间，求出最大利益
 * @create 2021-09-07 8:57
 */
public class Easy_121_BestTimeToBuyAndSellStock {

    //方法：依次找最小值，如果比最小值小，则赋给最小值，否则减最小值得到结果与最大利益比较
    //Runtime: 1 ms, faster than 100.00% of Java online submissions for Best Time to Buy and Sell Stock.
    //Memory Usage: 51.9 MB, less than 88.07% of Java online submissions for Best Time to Buy and Sell Stock.
    public int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else if (prices[i] - minPrice > maxProfit) {
                maxProfit = prices[i] - minPrice;
            }
        }
        return maxProfit;
    }

}
