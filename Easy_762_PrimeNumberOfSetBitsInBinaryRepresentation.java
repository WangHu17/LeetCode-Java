/**
 * @author wanghu
 * @discrption： 给定左右两个整数，返回包含范围 [left, right] 中在其二进制表示中具有质数设置位的数字的计数。
 * 回想一下，整数所具有的设置位数是二进制写入时存在的 1 的数量。
 * 例如，用二进制写成的 21 是 10101，它有 3 个设置位。
 * @create 2021-11-06 17:05
 */
public class Easy_762_PrimeNumberOfSetBitsInBinaryRepresentation {

    // 改进方法：由于二进制的1的个数有限，所以先将质数用数组表示出来，不用单独计算
    //Runtime: 2 ms, faster than 100.00% of Java online submissions for Prime Number of Set Bits in Binary Representation.
    //Memory Usage: 36.2 MB, less than 49.19% of Java online submissions for Prime Number of Set Bits in Binary Representation.
    public int countPrimeSetBits1(int left, int right) {
        // 0-19，是质数的用1表示
        int[] prime_sequence = {0, 0, 1, 1, 0, 1, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 1, 0, 1};
        int ans=0;
        for(int i=left;i<=right;i++){
            // Integer.bitCount(i) 方法，用于获取一个int中二进制位为1的个数
            int num = Integer.bitCount(i);
            if(prime_sequence[num]==1)
                ans++;
        }
        return ans;
    }

    // 我的方法
    //Runtime: 117 ms, faster than 13.63% of Java online submissions for Prime Number of Set Bits in Binary Representation.
    //Memory Usage: 35.7 MB, less than 88.68% of Java online submissions for Prime Number of Set Bits in Binary Representation.
    public int countPrimeSetBits(int left, int right) {
        int res = 0;
        while (left <= right) {
            if (isPrime(countSetBits(left))) res++;
            left++;
        }
        return res;
    }

    public int countSetBits(int n) {
        int sum = 0;
        while (n != 0) {
            if (n % 2 == 1) sum++;
            n /= 2;
        }
        return sum;
    }

    public boolean isPrime(int n) {
        if (n == 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

}
