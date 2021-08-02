import bean.ListNode;

/**
 * @author wanghu
 * @discrption：移除一个已排序链表中重复的元素
 * @create 2021-07-29 9:15
 */
public class Easy_83_RemoveDuplicatesFromSortedList {

    //我的方法：用了两个指针
    //Runtime: 0 ms, faster than 100.00% of Java online submissions for Remove Duplicates from Sorted List.
    //Memory Usage: 38.2 MB, less than 85.56% of Java online submissions for Remove Duplicates from Sorted List.
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null || head.next==null)return head;
        ListNode left=head;
        ListNode right=head.next;
        while(right!=null){
            if(left.val!=right.val){
                left=left.next;
                right=right.next;
            }else {
                left.next=right.next;
                right=right.next;
            }
        }
        return head;
    }


    //官方的方法：只用一个指针，不过内存却比我的方法占用多一点
    //Runtime: 0 ms, faster than 100.00% of Java online submissions for Remove Duplicates from Sorted List.
    //Memory Usage: 38.5 MB, less than 49.19% of Java online submissions for Remove Duplicates from Sorted List.
    public ListNode deleteDuplicates1(ListNode head) {
        ListNode current = head;
        while (current != null && current.next != null) {
            if (current.next.val == current.val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return head;
    }

}
