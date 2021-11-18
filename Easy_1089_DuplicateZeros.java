/**
 * @author wanghu
 * @discrption： 给定一个固定长度的整数数组 arr，复制每个出现的零，将剩余的元素向右移动。
 * 请注意，不会写入超出原始数组长度的元素。对输入数组进行上述修改，不要返回任何内容。
 * @create 2021-11-18 11:33
 */
public class Easy_1089_DuplicateZeros {

    //我的方法
    //Runtime: 12 ms, faster than 48.71% of Java online submissions for Duplicate Zeros.
    //Memory Usage: 39.1 MB, less than 83.59% of Java online submissions for Duplicate Zeros.
    public void duplicateZeros(int[] arr) {
        for (int i = 0; i < arr.length - 1; ) {
            if (arr[i] == 0) {
                move(arr, i + 1);
                arr[i + 1] = 0;
                i += 2;
            } else
                i++;
        }
    }

    public void move(int[] arr, int index) {
        for (int i = arr.length - 1; i > index; i--) {
            arr[i] = arr[i - 1];
        }
    }

    // 方法二：利用额外一个数组
    //Runtime: 0 ms, faster than 100.00% of Java online submissions for Duplicate Zeros.
    //Memory Usage: 39.4 MB, less than 46.80% of Java online submissions for Duplicate Zeros.
    public void duplicateZeros1(int[] arr) {
        int[] copy = arr.clone();
        int i = 0, j = 0;
        while (j < arr.length - 1) {
            if (copy[i] == 0) {
                arr[j++] = copy[i];
                arr[j++] = copy[i++];
            } else {
                arr[j++] = copy[i++];
            }
        }
        if (j == arr.length - 1) arr[j++] = copy[i];
    }

}
