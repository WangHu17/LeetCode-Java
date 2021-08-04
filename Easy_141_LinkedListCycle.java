import bean.ListNode;

import java.util.HashSet;

/**
 * @author wanghu
 * @discrption：判断链表是否有闭环
 * @create 2021-08-04 11:53
 */
public class Easy_141_LinkedListCycle {

    //方法一（柳婼）：为遍历过的节点赋值，如果下一个遍历的节点的值为该值，说明循环了
    //Runtime: 0 ms, faster than 100.00% of Java online submissions for Linked List Cycle.
    //Memory Usage: 39.9 MB, less than 70.37% of Java online submissions for Linked List Cycle.
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) return false;
        ListNode p = head;
        p.val = 999999;
        while (p.next != null) {
            p = p.next;
            if (p.val == 999999) {
                return true;
            } else {
                p.val = 999999;
            }
        }
        return false;
    }

    //方法二（柳婼）：使用set集合存储遍历过的节点，如果循环了则会存储失败(不过太慢)
    //Runtime: 4 ms, faster than 18.38% of Java online submissions for Linked List Cycle.
    //Memory Usage: 39.8 MB, less than 85.63% of Java online submissions for Linked List Cycle.
    public boolean hasCycle1(ListNode head) {
        if (head == null || head.next == null) return false;
        HashSet<ListNode> set = new HashSet<>();
        ListNode p = head;
        int cnt = 0;
        while (p.next != null) {
            set.add(p);
            if (cnt == set.size()) return true;
            cnt = set.size();
            p = p.next;
        }
        return false;
    }

    //方法三（leetcode讨论区）
    //Runtime: 0 ms, faster than 100.00% of Java online submissions for Linked List Cycle.
    //Memory Usage: 40 MB, less than 59.82% of Java online submissions for Linked List Cycle.
    public boolean hasCycle2(ListNode head) {
        if (head == null || head.next == null) return false;
        ListNode l = head;
        ListNode h = head;
        while (h.next != null && h.next.next != null) {//此条件很重要
            l = l.next;
            h = h.next.next;
            if (l == h) return true;
        }
        return false;
    }

}
