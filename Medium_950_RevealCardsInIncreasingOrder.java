import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author wanghu
 * @discrption： 牌组中的每张卡牌都对应有一个唯一的整数。你可以按你想要的顺序对这套卡片进行排序。
 *
 * 最初，这些卡牌在牌组里是正面朝下的（即，未显示状态）。
 *
 * 现在，重复执行以下步骤，直到显示所有卡牌为止：
 *
 * 从牌组顶部抽一张牌，显示它，然后将其从牌组中移出。
 * 如果牌组中仍有牌，则将下一张处于牌组顶部的牌放在牌组的底部。
 * 如果仍有未显示的牌，那么返回步骤 1。否则，停止行动。
 * 返回能以递增顺序显示卡牌的牌组顺序。
 *
 * 答案中的第一张牌被认为处于牌堆顶部。
 * @create 2022-01-19 16:55
 */
public class Medium_950_RevealCardsInIncreasingOrder {

    //执行用时：3 ms, 在所有 Java 提交中击败了92.27%的用户
    //内存消耗：38.7 MB, 在所有 Java 提交中击败了22.73%的用户
    public int[] deckRevealedIncreasing(int[] deck) {
        int len = deck.length;
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < len; i++) {
            queue.offer(i);
        }
        int[] res = new int[len];
        Arrays.sort(deck);
        for (int k : deck) {
            res[queue.poll()] = k;
            if (!queue.isEmpty())
                queue.add(queue.poll());
        }
        return res;
    }

}
