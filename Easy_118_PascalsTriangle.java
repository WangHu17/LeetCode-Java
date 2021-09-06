import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wanghu
 * @discrption： 杨辉三角
 * @create 2021-09-06 11:11
 */
public class Easy_118_PascalsTriangle {

    //我的方法
    //Runtime: 0 ms, faster than 100.00% of Java online submissions for Pascal's Triangle.
    //Memory Usage: 37.1 MB, less than 46.72% of Java online submissions for Pascal's Triangle.
    public List<List<Integer>> generate(int numRows) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        list1.add(1);
        list2.add(1);
        list2.add(1);
        res.add(list1);
        if(numRows==1)return res;
        res.add(list2);
        if(numRows==2)return res;
        int i = 3;
        List<Integer> temp = list2;
        while (i <= numRows) {
            List<Integer> list = new ArrayList<>();
            list.add(1);
            for (int j = 1; j < i - 1; j++) {
                list.add(temp.get(j - 1) + temp.get(j));
            }
            list.add(1);
            res.add(list);
            temp = list;
            i++;
        }
        return res;
    }

    @Test
    public void test() {
        System.out.println(generate(5));
    }
}
