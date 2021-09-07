import java.util.HashMap;

/**
 * @author wanghu
 * @discrption： 找出数组中两个数之和等于target的元素位置，数组已排序
 * @create 2021-09-07 10:04
 */
public class Easy_167_TwoSumII_InputArrayIsSorted {

    //我的方法：用map
    //Runtime: 1 ms, faster than 53.34% of Java online submissions for Two Sum II - Input array is sorted.
    //Memory Usage: 39.1 MB, less than 77.77% of Java online submissions for Two Sum II - Input array is sorted.
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            if (map.containsKey(target - numbers[i])) {
                return new int[]{map.get(target - numbers[i]) + 1, i + 1};
            } else {
                map.put(numbers[i], i);
            }
        }
        return null;
    }

    //巧妙解法
    //Runtime: 0 ms, faster than 100.00% of Java online submissions for Two Sum II - Input array is sorted.
    //Memory Usage: 38.8 MB, less than 93.26% of Java online submissions for Two Sum II - Input array is sorted.
    public int[] twoSum2(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        while (left < right) {
            if (numbers[left] + numbers[right] == target) {
                return new int[]{left + 1, right + 1};
            } else if (numbers[left] + numbers[right] < target) {
                left++;
            } else {
                right--;
            }
        }
        return null;
    }

    //暴力：超级慢
    public int[] twoSum1(int[] numbers, int target) {
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target) {
                    return new int[]{i + 1, j + 1};
                }
            }
        }
        return null;
    }

}
