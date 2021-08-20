import bean.ListNode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @author wanghu
 * @discrption： 回文链表
 * @create 2021-08-20 9:14
 */
public class Easy_234_PalindromeLinkedList {

    //我的方法一：分别将元素放入栈和队列，然后从栈和队列中弹出元素，比较是否一致
    //Runtime: 18 ms, faster than 12.30% of Java online submissions for Palindrome Linked List.
    //Memory Usage: 53.8 MB, less than 28.10% of Java online submissions for Palindrome Linked List.
    public boolean isPalindrome(ListNode head) {
        Queue<Integer> queue = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();
        ListNode p = head;
        while (p != null){
            queue.offer(p.val);
            stack.push(p.val);
            p = p.next;
        }
        while (!queue.isEmpty()){
            int m = queue.poll();
            int n = stack.pop();
            if (m!=n)return false;
        }
        return true;
    }

    //我的方法二：将元素放入栈中并计算链表长度，然后从链表头开始遍历，与栈弹出的元素比较，知道遍历到链表的一半
    //Runtime: 9 ms, faster than 34.44% of Java online submissions for Palindrome Linked List.
    //Memory Usage: 51.6 MB, less than 44.15% of Java online submissions for Palindrome Linked List.
    public boolean isPalindrome1(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        ListNode p =head;
        int size = 0;
        while (p != null){
            stack.push(p.val);
            size++;
            p = p.next;
        }
        p = head;
        size /= 2;
        while (size-- > 0){
            if(p.val != stack.pop())return false;
            p = p.next;
        }
        return true;
    }

}
