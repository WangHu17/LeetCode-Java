import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wanghu
 * @discrption：概括数组中值的范围
 * @create 2021-07-21 17:41
 */
public class Easy_228_SummaryRanges {

    //我的方法
    //Runtime: 6 ms, faster than 72.84% of Java online submissions for Summary Ranges.
    //Memory Usage: 37.6 MB, less than 45.81% of Java online submissions for Summary Ranges.
    public List<String> summaryRanges(int[] nums) {
        ArrayList<String> list = new ArrayList<>();
        if(nums.length==0)return list;
        int i,begin=0,end=0,flag=1;
        String range;
        for(i=0; i<nums.length-1; i++){
            if(flag==1){
                begin = nums[i];
                flag=0;
            }
            if((nums[i]+1) != nums[i+1]){
                flag=1;
                end=nums[i];
                if(begin!=end){
                    range=begin+"->"+end;
                }else {
                    range=begin+"";
                }
                list.add(range);
            }else {
                end=nums[i+1];
            }
        }
        if(flag==0){
            range=begin+"->"+end;
        }else {
            range=nums[i]+"";
        }
        list.add(range);
        return list;
    }

    //大佬的方法
    //Runtime: 0 ms, faster than 100.00% of Java online submissions for Summary Ranges.
    //Memory Usage: 37.2 MB, less than 88.08% of Java online submissions for Summary Ranges.
    public List<String> summaryRanges1(int[] nums) {
        ArrayList<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        int i = 0;

        while (i < nums.length) {
            int temp = nums[i];
            sb.append(nums[i++]);

            while (i < nums.length && nums[i] - nums[i-1] == 1) i++;
            if (temp != nums[i-1]) sb.append("->").append(nums[i-1]);

            list.add(sb.toString());
            sb.setLength(0);
        }
        return list;
    }

    @Test
    public void test(){
        int[] nums = {0,2,3,4,6,8,9};
        System.out.println(summaryRanges(nums));
    }

}
