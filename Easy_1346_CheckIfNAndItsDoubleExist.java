import java.util.*;

/**
 * @author wanghu
 * @discrption： 给定一个整数数组 arr，检查是否存在两个整数 N 和 M，使得 N 是 M 的双倍（即 N = 2 * M）。
 * 更正式地检查是否存在两个索引 i 和 j 使得：
 * i!= j
 * 0 <= i, j < arr.length
 * arr[i] == 2 * arr[j]
 * @create 2021-11-15 10:58
 */
public class Easy_1346_CheckIfNAndItsDoubleExist {

    // 方法：使用HashSet，在存入是判断集合中是否存在该数的二分之一或2倍
    //Runtime: 1 ms, faster than 99.06% of Java online submissions for Check If N and Its Double Exist.
    //Memory Usage: 38.6 MB, less than 77.43% of Java online submissions for Check If N and Its Double Exist.
    public boolean checkIfExist(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int i : arr) {
            if ((i % 2 == 0 && set.contains(i / 2)) || set.contains(2 * i)) return true;
            else set.add(i);
        }
        return false;
    }

}
