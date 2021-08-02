import javafx.util.Pair;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wanghu
 * @discrption：求数组指定区间中元素的和
 * @create 2021-07-23 17:01
 */
public class Easy_303_RangeSumQueryImmutable {


    private int[] array;

    //我的方法：太慢
    //Runtime: 60 ms, faster than 26.35% of Java online submissions for Range Sum Query - Immutable.
    //Memory Usage: 42.1 MB, less than 74.94% of Java online submissions for Range Sum Query - Immutable.
//    public Easy_303_RangeSumQueryImmutable(int[] nums) {
//        array = nums;
//    }
//
//    public int sumRange(int left, int right) {
//        int sum=0;
//        for(int i=left;i<=right;i++){
//            sum+=array[i];
//        }
//        return sum;
//    }

    //官方的方法一：将数组中每个位置及它之前的所有元素的和对应放入新数组中，求和时只需array[j]-array[i-1] (i=0除外)
    //Runtime: 6 ms, faster than 100.00% of Java online submissions for Range Sum Query - Immutable.
    //Memory Usage: 43.9 MB, less than 31.61% of Java online submissions for Range Sum Query - Immutable.
    public Easy_303_RangeSumQueryImmutable(int[] nums) {
        array = new int[nums.length];
        array[0] = nums[0];
        for(int i=1;i<nums.length;i++){
            array[i]=nums[i]+array[i-1];
        }
    }

    public int sumRange(int left, int right) {
        return left==0?array[right]:array[right]-array[left-1];
    }

    //官方的方法二：将每个区间的和放入HashMap中
    private Map<Pair<Integer,Integer>,Integer> map = new HashMap<>();

}
