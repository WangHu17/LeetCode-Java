
import org.junit.Test;

import java.util.Arrays;

/**
 * @author wanghu
 * @discrption：找出数组中只有一个的元素
 * @create 2021-07-19 15:21
 */
public class Easy_136_SingleNumber {

    //我的方法
    //Runtime: 5 ms, faster than 52.56% of Java online submissions for Single Number.
    //Memory Usage: 39.4 MB, less than 49.69% of Java online submissions for Single Number.
    public int singleNum(int[] nums){
        int len = nums.length;
        if(len == 1){
            return nums[0];
        }else {
            Arrays.sort(nums);
            for(int i=0; i<len-1; i=i+2){
                if(nums[i] != nums[i+1]){
                    return nums[i];
                }
            }
            return nums[len-1];
        }
    }

    //大佬的方法：使用异或
    //Runtime: 1 ms, faster than 95.20% of Java online submissions for Single Number.
    //Memory Usage: 39.1 MB, less than 75.31% of Java online submissions for Single Number.
    public int singleNum1(int[] nums){
        int a = 0;
        for (int i : nums) {
            a ^= i;
        }
        return a;
    }

    @Test
    public void test(){
        int[] nums = {4,1,2,1,2};
        System.out.println(singleNum(nums));
    }

}
