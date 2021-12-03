import bean.ListNode;

/**
 * @author wanghu
 * @discrption： 给定的 head 是单向链表的引用节点。链表中每个节点的值要么是 0，要么是 1。链表保存数字的二进制表示。
 * 返回链表中数字的十进制值。
 * @create 2021-11-22 11:23
 */
public class Easy_1290_ConvertBinaryNumberInALinkedListToInteger {

    //Runtime: 0 ms, faster than 100.00% of Java online submissions for Convert Binary Number in a Linked List to Integer.
    //Memory Usage: 38.7 MB, less than 8.27% of Java online submissions for Convert Binary Number in a Linked List to Integer.
    public int getDecimalValue(ListNode head) {
        int sum = head.val;
        while (head.next != null) {
            sum = sum * 2 + head.next.val;
            head = head.next;
        }
        return sum;
    }

}
