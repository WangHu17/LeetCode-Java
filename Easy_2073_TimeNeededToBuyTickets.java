/**
 * @author wanghu
 * @discrption：
 * @create 2021-11-30 14:49
 */
public class Easy_2073_TimeNeededToBuyTickets {

    //我的方法
    //Runtime: 1 ms, faster than 60.40% of Java online submissions for Time Needed to Buy Tickets.
    //Memory Usage: 36.5 MB, less than 80.86% of Java online submissions for Time Needed to Buy Tickets.
    public int timeRequiredToBuy(int[] tickets, int k) {
        int sum = 0;
        while (tickets[k] > 0) {
            for (int i = 0; i < tickets.length; i++) {
                if (tickets[i] > 0) {
                    tickets[i]--;
                    sum++;
                    if (tickets[k]==0)return sum;
                }
            }
        }
        return sum;
    }

}
