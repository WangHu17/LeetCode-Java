import java.util.Arrays;

/**
 * @author wanghu
 * @discrption： 如果任意两个连续元素之间的差相同，则称为等差数列。 给定一个数字数组 arr，
 * 如果该数组可以重新排列以形成等差数列，则返回 true。否则，返回false。
 * @create 2021-11-24 14:30
 */
public class Easy_1502_CanMakeArithmeticProgressionFromSequence {

    //我的方法
    //Runtime: 2 ms, faster than 31.14% of Java online submissions for Can Make Arithmetic Progression From Sequence.
    //Memory Usage: 39.2 MB, less than 16.69% of Java online submissions for Can Make Arithmetic Progression From Sequence.
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] - arr[i - 1] != arr[i - 1] - arr[i - 2])
                return false;
        }
        return true;
    }

    public boolean canMakeArithmeticProgression1(int[] arr) {
        Arrays.sort(arr);
        int cha = arr[1] - arr[0];
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] - arr[i - 1] != cha)
                return false;
        }
        return true;
    }

}
