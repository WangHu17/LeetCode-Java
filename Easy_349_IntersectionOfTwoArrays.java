import java.util.HashSet;

/**
 * @author wanghu
 * @discrption： 给定两个整数数组 nums1 和 nums2，返回它们的交集数组。结果中的每个元素都必须是唯一的，您可以按任何顺序返回结果。
 * @create 2021-08-30 10:59
 */
public class Easy_349_IntersectionOfTwoArrays {

    //Runtime: 4 ms, faster than 30.85% of Java online submissions for Intersection of Two Arrays.
    //Memory Usage: 40.8 MB, less than 6.16% of Java online submissions for Intersection of Two Arrays.
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        for (int n : nums1) set1.add(n);
        HashSet<Integer> set2 = new HashSet<>();
        for (int n : nums2) set2.add(n);
        set1.retainAll(set2);//取交集
        int[] is = new int[set1.size()];
        int i = 0;
        for (int n : set1) is[i++] = n;
        return is;
    }

}
