import org.junit.Test;

import java.util.ArrayList;

/**
 * @author wanghu
 * @discrption： n个人围成圈，按1到n编号，从第1号开始数，数到第k个人淘汰，直到还剩一个人，返回剩下的一个人编号
 * @create 2022-01-21 14:18
 */
public class Medium_1823_FindTheWinnerOfTheCircularGame {

    //Runtime: 3 ms, faster than 56.35% of Java online submissions for Find the Winner of the Circular Game.
    //Memory Usage: 38.2 MB, less than 32.61% of Java online submissions for Find the Winner of the Circular Game.
    public int findTheWinner1(int n, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            list.add(i);
        }
        int i = 0;
        while (list.size() > 1) {
            i = (i + k - 1) % list.size();
            list.remove(i);
        }
        return list.get(0);
    }

    //我的方法：有问题找不出
    public int findTheWinner(int n, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            list.add(i);
        }
        int i = 0;
        while (list.size() > 1) {
            int m = 1;
            while (m < k) {
                m++;
                i++;
                if (i >= list.size()) i = 0;
                if (m == k)
                    list.remove(i);
            }
        }
        return list.get(0);
    }

    @Test
    public void test() {
        System.out.println(findTheWinner(6, 5));
    }

}
