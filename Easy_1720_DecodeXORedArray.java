/**
 * @author wanghu
 * @discrption： 有一个由 n 个非负整数组成的隐藏整数数组 arr。 它被编码到另一个长度为 n - 1 的整数数组中，
 * 编码为 [i] = arr[i] XOR arr[i + 1]。例如，如果 arr = [1,0,2,1]，则编码 = [1,2,3]。 您将获得编码数组。
 * 您还首先获得一个整数，即 arr 的第一个元素，即 arr[0]。 返回原始数组 arr。可以证明该答案存在且唯一。
 * @create 2021-12-21 10:47
 */
public class Easy_1720_DecodeXORedArray {

    //Runtime: 1 ms, faster than 100.00% of Java online submissions for Decode XORed Array.
    //Memory Usage: 39.6 MB, less than 94.76% of Java online submissions for Decode XORed Array.
    public int[] decode(int[] encoded, int first) {
        int[] res = new int[encoded.length + 1];
        res[0] = first;
        for (int i = 1; i < res.length; i++) {
            res[i] = encoded[i - 1] ^ res[i - 1];
        }
        return res;
    }

}
