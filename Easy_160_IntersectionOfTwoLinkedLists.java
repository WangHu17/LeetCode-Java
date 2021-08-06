import bean.ListNode;

/**
 * @author wanghu
 * @discrption： 给定两个单链表 headA 和 headB 的头部，返回两个链表相交的节点。如果两个链表根本没有交集，则返回 null
 * @create 2021-08-06 14:43
 */
public class Easy_160_IntersectionOfTwoLinkedLists {

    /*
      方法（柳婼）：计算两个链表的长度，用两个节点指向两链表的头部，
      并将指向长的那个链表的头部节点向后移动直到其后面的长度等于短的那个链表的长度。
      然后同时向后移动两个节点直到它们指向相同的那个节点就是结果。
    */
    //Runtime: 1 ms, faster than 97.47% of Java online submissions for Intersection of Two Linked Lists.
    //Memory Usage: 41.7 MB, less than 79.20% of Java online submissions for Intersection of Two Linked Lists.
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;
        ListNode p = headA;
        ListNode q = headB;
        int len1 = 0, len2 = 0;
        while (p != null) {
            len1++;
            p = p.next;
        }
        while (q != null) {
            len2++;
            q = q.next;
        }
        p = headA;
        q = headB;
        if (len1 > len2) {
            int m = len1 - len2;
            while (m-- > 0) {
                p = p.next;
            }
        }
        if (len1 < len2) {
            int m = len2 - len1;
            while (m-- > 0) {
                q = q.next;
            }
        }
        while (p != q && p != null && q != null) {
            p=p.next;
            q=q.next;
        }
        return p;
    }

}
