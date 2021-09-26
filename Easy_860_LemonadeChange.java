import java.util.HashMap;

/**
 * @author wanghu
 * @discrption： 在柠檬水摊上，每个柠檬水售价 5 美元。客户排着长队向您购买，并一次订购一个（按照账单指定的顺序）。
 * 每个顾客只能购买一个柠檬水，并用 5 美元、10 美元或 20 美元的钞票付款。您
 * 必须向每位客户提供正确的零钱，以便净交易是客户支付 5 美元。
 * 请注意，您一开始手头没有任何零钱。 给定一个整数数组 bills，其中 bills[i] 是第 i 个客户支付的账单，
 * 如果您可以为每个客户提供正确的零钱，则返回 true，否则返回 false。
 * @create 2021-09-26 10:04
 */
public class Easy_860_LemonadeChange {

    //改进方法：根本不需要用map，我愚蠢了，用两个变量保存5元和10元的个数，过程和我的方法一样
    //Runtime: 2 ms, faster than 72.14% of Java online submissions for Lemonade Change.
    //Memory Usage: 98.1 MB, less than 22.53% of Java online submissions for Lemonade Change.
    public boolean lemonadeChange1(int[] bills) {
        int five = 0, ten = 0;
        for (int bill : bills) {
            if (bill == 5) {
                five++;
            } else if (bill == 10) {
                if (five != 0) {
                    five--;
                    ten++;
                } else {
                    return false;
                }
            } else {
                if (five != 0 && ten != 0) {
                    five--;
                    ten--;
                } else if (five >= 3) {
                    five -= 3;
                } else {
                    return false;
                }
            }
        }
        return true;
    }

    //我的方法：用map保存下5元和10元的个数，后面找钱再减去对应的个数
    //Runtime: 11 ms, faster than 8.60% of Java online submissions for Lemonade Change.
    //Memory Usage: 48.4 MB, less than 97.42% of Java online submissions for Lemonade Change.
    public boolean lemonadeChange(int[] bills) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int bill : bills) {
            if (bill == 5) {
                map.put(5, map.getOrDefault(5, 0) + 1);
            } else if (bill == 10) {
                if (map.getOrDefault(5, 0) != 0) {
                    map.put(5, map.getOrDefault(5, 0) - 1);
                    map.put(10, map.getOrDefault(10, 0) + 1);
                } else {
                    return false;
                }
            } else {
                if (map.getOrDefault(5, 0) != 0 && map.getOrDefault(10, 0) != 0) {
                    map.put(5, map.getOrDefault(5, 0) - 1);
                    map.put(10, map.getOrDefault(10, 0) - 1);
                } else if (map.getOrDefault(5, 0) >= 3) {
                    map.put(5, map.getOrDefault(5, 0) - 3);
                } else {
                    return false;
                }
            }
        }
        return true;
    }

}
