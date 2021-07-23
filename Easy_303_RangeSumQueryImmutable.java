import org.junit.Test;

/**
 * @author wanghu
 * @discrption：
 * @create 2021-07-23 17:01
 */
public class Easy_303_RangeSumQueryImmutable {
    //Runtime: 60 ms, faster than 26.35% of Java online submissions for Range Sum Query - Immutable.
    //Memory Usage: 42.1 MB, less than 74.94% of Java online submissions for Range Sum Query - Immutable.

    private int[] array;

    public Easy_303_RangeSumQueryImmutable(int[] nums) {
        array = nums;
    }

    public int sumRange(int left, int right) {
        int sum=0;
        for(int i=left;i<=right;i++){
            sum+=array[i];
        }
        return sum;
    }

}
