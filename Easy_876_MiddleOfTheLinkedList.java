import bean.ListNode;

/**
 * @author wanghu
 * @discrption： 给定单链表的头部，返回链表的中间节点。 如果有两个中间节点，则返回第二个中间节点。
 * @create 2021-11-17 11:01
 */
public class Easy_876_MiddleOfTheLinkedList {

    // 我的方法：双指针，一个每次向后移动一个节点，一个每次向后移动两个节点，直到快指针不为null且快指针的下一个节点也不为null
    //Runtime: 0 ms, faster than 100.00% of Java online submissions for Middle of the Linked List.
    //Memory Usage: 36.4 MB, less than 80.12% of Java online submissions for Middle of the Linked List.
    public ListNode middleNode(ListNode head) {
        ListNode p1 = head, p2 = head;
        while (p2 != null && p2.next !=null) {
            p1 = p1.next;
            p2 = p2.next.next;
        }
        return p1;
    }

}
