import org.junit.Test;

import java.util.Stack;

/**
 * @author wanghu
 * @discrption： 将数组中的元素减去自身后面的第一个小于等于自身的元素，没有则不减
 * @create 2021-11-29 17:19
 */
public class Easy_1475_FinalPricesWithASpecialDiscountInAShop {

    //Runtime: 2 ms, faster than 66.40% of Java online submissions for Final Prices With a Special Discount in a Shop.
    //Memory Usage: 39.6 MB, less than 35.72% of Java online submissions for Final Prices With a Special Discount in a Shop.
    public int[] finalPrices(int[] prices) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < prices.length; i++) {
            while (!stack.isEmpty() && prices[stack.peek()] >= prices[i]) {
                prices[stack.peek()] = prices[stack.pop()] - prices[i];
            }
            stack.push(i);
        }
        return prices;
    }

    @Test
    public void test() {
        int[] ints = {8, 4, 6, 2, 3};
        System.out.println(finalPrices(ints).toString());
    }

}
