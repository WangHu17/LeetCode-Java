import java.util.HashMap;

/**
 * @author wanghu
 * @discrption： 给你一个 数字字符串数组 nums和一个 数字字符串 target，请你返回 nums[i] + nums[j]
 * （两个字符串连接）结果等于 target的下标 (i, j)（需满足 i != j）的数目。
 * @create 2022-01-26 15:14
 */
public class Medium_2023_NumberOfPairsOfStringsWithConcatenationEqualToTarget {

    //方法二：HashMap
    //Runtime: 3 ms, faster than 79.97% of Java online submissions for Number of Pairs of Strings With Concatenation Equal to Target.
    //Memory Usage: 40.3 MB, less than 37.11% of Java online submissions for Number of Pairs of Strings With Concatenation Equal to Target.
    public int numOfPairs1(String[] nums, String target) {
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        int sum = 0;
        for (int i = 1; i < target.length(); i++) {
            String prefix = target.substring(0, i);
            String suffix = target.substring(i, target.length());
            if (map.containsKey(prefix) && map.containsKey(suffix)) {
                if (prefix.equals(suffix)) sum += map.get(prefix) * (map.get(prefix) - 1);
                else sum += map.get(prefix) * map.get(suffix);
            }
        }
        return sum;
    }

    //方法一：暴力
    //Runtime: 57 ms, faster than 13.76% of Java online submissions for Number of Pairs of Strings With Concatenation Equal to Target.
    //Memory Usage: 57.7 MB, less than 21.08% of Java online submissions for Number of Pairs of Strings With Concatenation Equal to Target.
    public int numOfPairs(String[] nums, String target) {
        int sum = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if ((nums[i] + nums[j]).equals(target)) sum++;
                if ((nums[j] + nums[i]).equals(target)) sum++;
            }
        }
        return sum;
    }

}
