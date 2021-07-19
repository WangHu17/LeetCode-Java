package com.example.dataset;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * @author wanghu
 * @discrption：
 * @create 2021-07-19 15:21
 */
public class Easy_136_SingleNumber {

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

    @Test
    public void test(){
        int[] nums = {4,1,2,1,2};
        System.out.println(singleNum(nums));
    }

}
