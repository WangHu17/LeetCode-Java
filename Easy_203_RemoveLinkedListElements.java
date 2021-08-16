import bean.ListNode;

/**
 * @author wanghu
 * @discrption： 删除链表指定值的节点
 * @create 2021-08-16 11:14
 */
public class Easy_203_RemoveLinkedListElements {

    //我的方法：两个指针，p在后，q在前
    //Runtime: 0 ms, faster than 100.00% of Java online submissions for Remove Linked List Elements.
    //Memory Usage: 39.5 MB, less than 96.96% of Java online submissions for Remove Linked List Elements.
    public ListNode removeElements(ListNode head, int val) {
        while (head != null && head.val == val) {
            head = head.next;
        }
        if(head == null)return head;
        ListNode q = head;
        ListNode p = head.next;
        while (p != null) {
            if (p.val == val) {
                q.next = p.next;
            }else{
                q = q.next;
            }
            p = p.next;
        }
        return head;
    }

}
