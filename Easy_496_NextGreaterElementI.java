import java.util.HashMap;

/**
 * @author wanghu
 * @discrption： 找数组num1中的元素在数组num2中的位置的后面的第一个比它大的元素，没有记为-1
 * @create 2021-09-10 10:06
 */
public class Easy_496_NextGreaterElementI {

    //我的方法：暴力
    //Runtime: 7 ms, faster than 24.25% of Java online submissions for Next Greater Element I.
    //Memory Usage: 40.5 MB, less than 20.08% of Java online submissions for Next Greater Element I.
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] res = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            int flag = 0, flag2 = 0;
            for (int j = 0; j < nums2.length; j++) {
                if (nums2[j] == nums1[i]) flag = 1;
                if (flag == 1 && nums2[j] > nums1[i]) {
                    res[i] = nums2[j];
                    flag2 = 1;
                    break;
                }
            }
            if (flag2 == 0) res[i] = -1;
        }
        return res;
    }

    //在双层for循环上的改进方法，使用map记录num2中元素的位置，这样就不用每次从头循环num2搜索num1中的元素了
    //Runtime: 3 ms, faster than 86.33% of Java online submissions for Next Greater Element I.
    //Memory Usage: 41.1 MB, less than 13.24% of Java online submissions for Next Greater Element I.
    public int[] nextGreaterElement1(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] res = new int[nums1.length];
        for (int i = 0; i < nums2.length; i++) {
            map.put(nums2[i], i);
        }
        for (int j = 0; j < nums1.length; j++) {
            int k;
            for (k = map.get(nums1[j]); k < nums2.length; k++) {
                if (nums2[k] > nums1[j]) {
                    res[j] = nums2[k];
                    break;
                }
            }
            if (k == nums2.length){
                res[j] = -1;
            }
        }
        return res;
    }

}
