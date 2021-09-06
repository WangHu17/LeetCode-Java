import java.util.ArrayList;
import java.util.List;

/**
 * @author wanghu
 * @discrption： 杨辉三角某一行
 * @create 2021-09-06 14:17
 */
public class Easy_119_PascalsTriangleII {

    //我的方法
    //Runtime: 1 ms, faster than 77.95% of Java online submissions for Pascal's Triangle II.
    //Memory Usage: 36.7 MB, less than 76.97% of Java online submissions for Pascal's Triangle II.
    public List<Integer> getRow(int rowIndex) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        if (rowIndex == 0) return list1;
        list1.add(1);
        if (rowIndex == 1) return list1;
        int i = 3;
        List<Integer> temp = list1;
        List<Integer> list = new ArrayList<>();
        while (i <= rowIndex+1) {
            list = new ArrayList<>();
            list.add(1);
            for (int j = 1; j < i - 1; j++) {
                list.add(temp.get(j - 1) + temp.get(j));
            }
            list.add(1);
            temp = list;
            i++;
        }
        return list;
    }

}
