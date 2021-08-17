import bean.ListNode;

/**
 * @author wanghu
 * @discrption： 反转链表
 * @create 2021-08-17 14:40
 */
public class Easy_206_ReverseLinkedList {

    //方法：用三个变量，分别指向当前节点，前一个节点和后一个节点
    //Runtime: 0 ms, faster than 100.00% of Java online submissions for Reverse Linked List.
    //Memory Usage: 38.5 MB, less than 92.91% of Java online submissions for Reverse Linked List.
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode cur = head;
        ListNode pre = null;
        ListNode next = null;
        while (cur != null) {
            next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }

}
