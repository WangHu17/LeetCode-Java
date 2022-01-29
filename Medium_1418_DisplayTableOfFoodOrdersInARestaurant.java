import java.util.*;

/**
 * @author wanghu
 * @discrption： 给你一个数组 orders，表示客户在餐厅中完成的订单，确切地说，
 * orders[i]=[customerNamei,tableNumberi,foodItemi] ，其中 customerNamei 是客户的姓名，
 * tableNumberi 是客户所在餐桌的桌号，而 foodItemi 是客户点的餐品名称。
 * <p>
 * 请你返回该餐厅的 点菜展示表 。在这张表中，表中第一行为标题，其第一列为餐桌桌号 “Table” ，
 * 后面每一列都是按字母顺序排列的餐品名称。接下来每一行中的项则表示每张餐桌订购的相应餐品数量，
 * 第一列应当填对应的桌号，后面依次填写下单的餐品数量。
 * <p>
 * 注意：客户姓名不是点菜展示表的一部分。此外，表中的数据行应该按餐桌桌号升序排列。
 * @create 2022-01-29 15:03
 */
public class Medium_1418_DisplayTableOfFoodOrdersInARestaurant {

    //Runtime: 40 ms, faster than 80.29% of Java online submissions for Display Table of Food Orders in a Restaurant.
    //Memory Usage: 135.5 MB, less than 36.54% of Java online submissions for Display Table of Food Orders in a Restaurant.
    public List<List<String>> displayTable(List<List<String>> orders) {
        //记录菜名、桌号、每桌点的菜及数量
        HashSet<String> nameSet = new HashSet<>();
        HashMap<Integer, Map<String, Integer>> tableFoods = new HashMap<>();
        for (List<String> order : orders) {
            nameSet.add(order.get(2));
            int id = Integer.parseInt(order.get(1));//桌号
            Map<String, Integer> map = tableFoods.getOrDefault(id, new HashMap<>());
            map.put(order.get(2), map.getOrDefault(order.get(2), 0) + 1);
            tableFoods.put(id, map);
        }
        //提取桌号并排序
        ArrayList<Integer> ids = new ArrayList<>();
        for (Integer id : tableFoods.keySet()) ids.add(id);
        Collections.sort(ids);
        //提取菜名并排序
        ArrayList<String> names = new ArrayList<>();
        for (String name : nameSet) names.add(name);
        Collections.sort(names);
        //完成点菜展示表
        ArrayList<List<String>> res = new ArrayList<>();
        //表头
        ArrayList<String> header = new ArrayList<>();
        header.add("Table");
        for (String name : names) header.add(name);
        res.add(header);
        //表体
        int m = ids.size();
        int n = names.size();
        for (int i = 0; i < m; i++) {
            ArrayList<String> list = new ArrayList<>();
            list.add(ids.get(i).toString());
            Map<String, Integer> map = tableFoods.get(ids.get(i));
            for (int j = 0; j < n; j++) {
                list.add(map.getOrDefault(names.get(j), 0).toString());
            }
            res.add(list);
        }
        return res;
    }

}
