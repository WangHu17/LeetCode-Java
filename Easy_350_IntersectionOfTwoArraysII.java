import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 * @author wanghu
 * @discrption： 给定两个整数数组 nums1 和 nums2，返回它们的交集数组。
 * 结果中的每个元素必须出现与它在两个数组中显示的一样多的次数，并且您可以按任何顺序返回结果。
 * @create 2021-08-31 9:34
 */
public class Easy_350_IntersectionOfTwoArraysII {

    //我的方法：先排序后遍历
    //Runtime: 5 ms, faster than 19.42% of Java online submissions for Intersection of Two Arrays II.
    //Memory Usage: 39.8 MB, less than 17.86% of Java online submissions for Intersection of Two Arrays II.
    public int[] intersect(int[] nums1, int[] nums2) {
        //1 1 2 2 3 4 5
        //    2 2     5
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int len1 = nums1.length;
        int len2 = nums2.length;
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0, j = 0;
        while (i < len1 && j < len2) {
            if (nums1[i] == nums2[j]) {
                list.add(nums1[i]);
                i++;
                j++;
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            }
        }
        int[] res = new int[list.size()];
        int m = 0;
        for (int n : list) res[m++] = n;
        return res;
    }

    //better方法一
    //Runtime: 2 ms, faster than 92.93% of Java online submissions for Intersection of Two Arrays II.
    //Memory Usage: 40.8 MB, less than 8.11% of Java online submissions for Intersection of Two Arrays II.
    public int[] intersect1(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<>();
        int[] check = new int[1001];
        for (int k : nums1) {
            check[k]++;
        }
        for (int i : nums2) {
            if (check[i] != 0) {
                list.add(i);
                check[i]--;
            }
        }
        int[] res = new int[list.size()];
        int j = 0;
        for (int n : list) {
            res[j++] = n;
        }
        return res;
    }

    //better方法二：用map，与方法一类似
    //Runtime: 2 ms, faster than 92.93% of Java online submissions for Intersection of Two Arrays II.
    //Memory Usage: 39.3 MB, less than 37.30% of Java online submissions for Intersection of Two Arrays II.
    public int[] intersect2(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : nums1) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for (int j : nums2) {
            if (map.getOrDefault(j, 0) != 0) {
                list.add(j);
                map.put(j, map.get(j) - 1);
            }
        }
        int[] res = new int[list.size()];
        int k = 0;
        for (int n : list) res[k++] = n;
        return res;
    }

}
