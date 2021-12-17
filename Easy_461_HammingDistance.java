import org.junit.Test;

/**
 * @author wanghu
 * @discrption： 两个整数之间的汉明距离是对应位不同的位置数。 给定两个整数 x 和 y，返回它们之间的汉明距离。
 * @create 2021-12-17 9:45
 */
public class Easy_461_HammingDistance {

    // 方法二：使用异或
    //Runtime: 0 ms, faster than 100.00% of Java online submissions for Hamming Distance.
    //Memory Usage: 37.7 MB, less than 6.05% of Java online submissions for Hamming Distance.
    public int hammingDistance1(int x, int y){
        // 异或：不同为1，相同为0
        int dif = x^y;
        // bitCount方法计算数中1的数量
        return Integer.bitCount(dif);
    }

    //我的方法
    //Runtime: 0 ms, faster than 100.00% of Java online submissions for Hamming Distance.
    //Memory Usage: 37.7 MB, less than 6.05% of Java online submissions for Hamming Distance.
    public int hammingDistance(int x, int y) {
        int sum = 0;
        while (x != 0 && y != 0) {
            int x1 = x & 1;
            int y1 = y & 1;
            if (x1 != y1) sum++;
            x = x >> 1;
            y = y >> 1;
        }
        while (x != 0) {
            int x1 = x & 1;
            x = x >> 1;
            if (x1 == 1) sum++;
        }
        while (y != 0) {
            int y1 = y & 1;
            y = y >> 1;
            if (y1 == 1) sum++;
        }
        return sum;
    }

    @Test
    public void test(){
        System.out.println(hammingDistance(3,1));
    }

}
