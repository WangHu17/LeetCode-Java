/**
 * @author wanghu
 * @discrption： 将字符串数组看成二维数组，求有多少列的字符不是按字典顺序排列的
 * @create 2021-10-08 10:37
 */
public class Easy_944_DeleteColumnsToMakeSorted {

    //我的方法
    //Runtime: 6 ms, faster than 94.59% of Java online submissions for Delete Columns to Make Sorted.
    //Memory Usage: 39 MB, less than 80.12% of Java online submissions for Delete Columns to Make Sorted.
    public int minDeletionSize(String[] strs) {
        int num = 0;
        for (int i = 0; i < strs[0].length(); i++) {
            for (int j = 0; j < strs.length - 1; j++) {
                if (strs[j].charAt(i) > strs[j + 1].charAt(i)) {
                    num++;
                    break;
                }
            }
        }
        return num;
    }

}
