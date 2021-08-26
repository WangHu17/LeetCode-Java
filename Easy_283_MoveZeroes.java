import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @author wanghu
 * @discrption： 给定一个整数数组 nums，将所有 0 移到它的末尾，同时保持非零元素的相对顺序。
 * 请注意，您必须就地执行此操作，而不能复制数组。
 * @create 2021-08-26 9:25
 */
public class Easy_283_MoveZeroes {

    //我的方法：用队列保存数组中不为零的数，然后依次赋值给数组，后面的全赋为0
    //Runtime: 1 ms, faster than 18.41% of Java online submissions for Move Zeroes.
    //Memory Usage: 38.8 MB, less than 97.80% of Java online submissions for Move Zeroes.
    public void moveZeroes(int[] nums) {
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                queue.offer(nums[i]);
            }
        }
        int j = 0;
        while (!queue.isEmpty()) {
            nums[j++] = queue.poll();
        }
        while (j < nums.length) {
            nums[j++] = 0;
        }
    }

    //官方方法：依次给数组赋值不为零的数
    //Runtime: 0 ms, faster than 100.00% of Java online submissions for Move Zeroes.
    //Memory Usage: 39.3 MB, less than 40.99% of Java online submissions for Move Zeroes.
    public void moveZeroes1(int[] nums) {
        int currentNonZero = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[currentNonZero++] = nums[i];
            }
        }
        while (currentNonZero < nums.length) nums[currentNonZero++] = 0;
    }

}
