import java.util.ArrayList;
import java.util.List;

/**
 * @author wanghu
 * @discrption： 自除数是一个能被它所包含的每个数字整除的数。
 * 例如，128 是一个自除数，因为 128 % 1 == 0、128 % 2 == 0 和 128 % 8 == 0。
 * 自除数不允许包含数字零。 给定左右两个整数，返回 [left, right] 范围内所有自除数的列表。
 * @create 2021-11-06 16:37
 */
public class Easy_728_SelfDividingNumbers {

    // 时间一样
    public List<Integer> selfDividingNumbers1(int left, int right) {
        List<Integer> list = new ArrayList<>();
        while (left <= right) {
            if (isSelfDividing(left))list.add(left);
            left++;
        }
        return list;
    }

    // 我的方法
    //Runtime: 2 ms, faster than 78.15% of Java online submissions for Self Dividing Numbers.
    //Memory Usage: 37.3 MB, less than 53.50% of Java online submissions for Self Dividing Numbers.
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        if (left < 10) {
            for (int i = left; i < 10; i++) {
                list.add(i);
            }
            left = 11;
        }
        for (int i = left; i <= right; i++) {
            if (isSelfDividing(i)) list.add(i);
        }
        return list;
    }

    public boolean isSelfDividing(Integer n) {
        int t = n;
        while (t != 0) {
            int i = t % 10;
            if (i == 0 || n % i != 0) return false;
            t /= 10;
        }
        return true;
    }

}
