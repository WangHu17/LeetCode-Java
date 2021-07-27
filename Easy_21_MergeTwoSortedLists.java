import bean.ListNode;

/**
 * @author wanghu
 * @discrption：
 * @create 2021-07-27 11:31
 */
public class Easy_21_MergeTwoSortedLists {

    //我的方法
    //Runtime: 0 ms, faster than 100.00% of Java online submissions for Merge Two Sorted Lists.
    //Memory Usage: 38.2 MB, less than 75.68% of Java online submissions for Merge Two Sorted Lists.
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null)return l2;
        if(l2==null)return l1;
        ListNode head,temp;
        if(l1.val < l2.val){
            head = l1;
            temp = l1;
            l1 = l1.next;
        }else {
            head = l2;
            temp = l2;
            l2 = l2.next;
        }
        while(l1!=null && l2!=null){
            if(l1.val < l2.val){
                temp.next = l1;
                temp = temp.next;
                l1 = l1.next;
            }else {
                temp.next = l2;
                temp = temp.next;
                l2 = l2.next;
            }
        }
        if(l1==null){
            temp.next = l2;
        }else {
            temp.next = l1;
        }
        return head;
    }

}
