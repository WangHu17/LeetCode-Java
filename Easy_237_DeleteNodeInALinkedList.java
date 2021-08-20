import bean.ListNode;

/**
 * @author wanghu
 * @discrption： 删除链表节点
 * @create 2021-08-20 14:21
 */
public class Easy_237_DeleteNodeInALinkedList {

    //我的方法：因为无法删除所给节点本身，所以只能让所给节点代替它的下一个节点，删除它的下一个节点
    //Runtime: 0 ms, faster than 100.00% of Java online submissions for Delete Node in a Linked List.
    //Memory Usage: 38.5 MB, less than 33.32% of Java online submissions for Delete Node in a Linked List.
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }

}
