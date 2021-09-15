import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author wanghu
 * @discrption： 假设 Andy 和 Doris 想选择一家餐厅吃饭，并且他们都有一个由字符串表示的最喜欢的餐厅列表。
 * 你需要帮助他们用最少的列表索引总和找出他们的共同兴趣。如果答案之间存在选择关系，则输出所有答案，没有顺序要求。你可以假设总是存在一个答案。
 * @create 2021-09-15 9:34
 */
public class Easy_599_MinimumIndexSumOfTwoLists {

    //我的垃圾方法
    //Runtime: 13 ms, faster than 35.32% of Java online submissions for Minimum Index Sum of Two Lists.
    //Memory Usage: 39.4 MB, less than 86.77% of Java online submissions for Minimum Index Sum of Two Lists.
    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String, Integer> map1 = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();
        for (int i = 0; i < list1.length; i++) {
            map1.put(list1[i], i);
        }
        for (int j = 0; j < list2.length; j++) {
            map2.put(list2[j], j);
        }
        int min = Integer.MAX_VALUE;
        for (String key : map1.keySet()) {
            if (map2.containsKey(key)) {
                min = Math.min(min, (map1.get(key) + map2.get(key)));
                map1.put(key, map1.get(key) + map2.get(key));
            } else {
                map1.put(key, Integer.MAX_VALUE);
            }
        }
        ArrayList<String> list = new ArrayList<>();
        for (String key : map1.keySet()) {
            if (map1.get(key) == min) list.add(key);
        }
        return list.toArray(new String[0]);
    }

    //better方法
    //Runtime: 5 ms, faster than 99.50% of Java online submissions for Minimum Index Sum of Two Lists.
    //Memory Usage: 39.2 MB, less than 98.77% of Java online submissions for Minimum Index Sum of Two Lists.
    public String[] findRestaurant1(String[] list1, String[] list2) {
        if (list1.length > list2.length) return findRestaurant(list2, list1);
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < list1.length; i++) {
            map.put(list1[i], i);
        }
        ArrayList<String> res = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        for (int j = 0; j < list2.length; j++) {
            if (map.containsKey(list2[j])) {
                int cur = map.get(list2[j]) + j;
                if (min > cur) {
                    min = cur;
                    res = new ArrayList<>();
                }
                if (min == cur) {
                    res.add(list2[j]);
                }
            }
        }
        return res.toArray(new String[0]);
    }

}
