import java.util.PriorityQueue;

/**
 * @author wanghu
 * @discrption： 设计一个类来查找流中第 k 个最大的元素。请注意，它是排序顺序中的第 k 个最大元素，而不是第 k 个不同元素。
 * 实现 KthLargest 类： KthLargest(int k, int[] nums) 用整数 k 和整数流 nums 初始化对象。 int add(int val) 将整数
 * val 附加到流并返回表示流中第 k 个最大元素的元素。
 * @create 2021-12-06 9:59
 */
public class Easy_703_KthLargestElementInAStream {

    //方法：使用PriorityQueue，优先队列。优先队列的作用是能保证每次取出的元素都是队列中权值最小的
    //Runtime: 18 ms, faster than 50.22% of Java online submissions for Kth Largest Element in a Stream.
    //Memory Usage: 44.3 MB, less than 74.10% of Java online submissions for Kth Largest Element in a Stream.
    private int k;
    private PriorityQueue<Integer> queue;

    public Easy_703_KthLargestElementInAStream(int k, int[] nums) {
        this.k = k;
        queue = new PriorityQueue<>();
        for (int n : nums) queue.offer(n);
        while (queue.size() > k) queue.poll();
    }

    public int add(int val) {
        queue.offer(val);
        if (queue.size() > k) queue.poll();
        return queue.peek();
    }

}
