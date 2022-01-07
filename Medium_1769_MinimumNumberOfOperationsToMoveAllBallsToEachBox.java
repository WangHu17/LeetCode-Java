import java.util.ArrayList;

/**
 * @author wanghu
 * @discrption： 有 n 个盒子。给你一个长度为 n 的二进制字符串 boxes ，其中 boxes[i] 的值为 '0' 表示第 i 个盒子是 空 的，
 * 而 boxes[i] 的值为 '1' 表示盒子里有 一个 小球。
 * 在一步操作中，你可以将 一个 小球从某个盒子移动到一个与之相邻的盒子中。第 i 个盒子和第 j 个盒子相邻需满足 abs(i - j) == 1 。
 * 注意，操作执行后，某些盒子中可能会存在不止一个小球。
 * 返回一个长度为 n 的数组 answer ，其中 answer[i] 是将所有小球移动到第 i 个盒子所需的 最小 操作数。
 * 每个 answer[i] 都需要根据盒子的 初始状态 进行计算。
 * @create 2022-01-07 11:28
 */
public class Medium_1769_MinimumNumberOfOperationsToMoveAllBallsToEachBox {

    //我的方法
    //Runtime: 175 ms, faster than 32.08% of Java online submissions for Minimum Number of Operations to Move All Balls to Each Box.
    //Memory Usage: 39.2 MB, less than 97.73% of Java online submissions for Minimum Number of Operations to Move All Balls to Each Box.
    public int[] minOperations(String boxes) {
        ArrayList<Integer> list = new ArrayList<>();
        int len = boxes.length();
        for (int i = 0; i < len; i++) {
            if (boxes.charAt(i) == '1')
                list.add(i);
        }
        int[] res = new int[len];
        for (int j = 0; j < len; j++) {
            int sum = 0;
            for (int k : list) {
                sum += Math.abs(k - j);
            }
            res[j] = sum;
        }
        return res;
    }

}
