/**
 * @author wanghu
 * @discrption： 给定两个二进制字符串 a 和 b，将它们的和作为二进制字符串返回。
 * @create 2021-10-15 11:13
 */
public class Easy_67_AddBinary {

    //改进方法
    //Runtime: 2 ms, faster than 77.30% of Java online submissions for Add Binary.
    //Memory Usage: 39.1 MB, less than 50.05% of Java online submissions for Add Binary.
    public String addBinary(String a, String b) {
        char[] arr1 = a.toCharArray(), arr2 = b.toCharArray();
        StringBuilder builder = new StringBuilder();
        int flag = 0, len1 = a.length() - 1, len2 = b.length() - 1;
        while (len1 >= 0 || len2 >= 0) {
            int sum = (len1 > 0 ? arr1[len1] - '0' : 0) + (len2 > 0 ? arr2[len2] - '0' : 0) + flag;
            builder.append(sum % 2);
            flag = sum / 2;
            if (len1 > 0) len1--;
            if (len2 > 0) len2--;
        }
        if (flag == 1) builder.append(1);
        return builder.reverse().toString();
    }

    //我的方法
    //Runtime: 2 ms, faster than 77.30% of Java online submissions for Add Binary.
    //Memory Usage: 39 MB, less than 67.98% of Java online submissions for Add Binary.
    public String addBinary1(String a, String b) {
        StringBuilder builder = new StringBuilder();
        int len1 = a.length();
        int len2 = b.length();
        char[] arr1, arr2;
        if (len1 >= len2) {
            arr1 = a.toCharArray();
            arr2 = b.toCharArray();
        } else {
            arr1 = b.toCharArray();
            arr2 = a.toCharArray();
            int t = len1;
            len1 = len2;
            len2 = t;
        }
        int flag = 0;
        for (int i = 0; i < len2; i++) {
            int cur = Integer.parseInt(String.valueOf(arr1[len1 - 1 - i])) + Integer.parseInt(String.valueOf(arr2[len2 - 1 - i])) + flag;
            if (cur == 0) {
                builder.append(0);
                flag = 0;
            } else if (cur == 1) {
                builder.append(1);
                flag = 0;
            } else if (cur == 2) {
                builder.append(0);
                flag = 1;
            } else if (cur == 3) {
                builder.append(1);
                flag = 1;
            }
        }
        for (int j = 0; j < len1 - len2; j++) {
            int cur = Integer.parseInt(String.valueOf(arr1[len1 - len2 - 1 - j])) + flag;
            if (cur == 0) {
                builder.append(0);
                flag = 0;
            } else if (cur == 1) {
                builder.append(1);
                flag = 0;
            } else if (cur == 2) {
                builder.append(0);
                flag = 1;
            }
        }
        if (flag == 1) builder.append(1);
        return builder.reverse().toString();
    }

}
