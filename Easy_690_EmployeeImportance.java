import bean.Employee;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author wanghu
 * @discrption：
 * @create 2021-10-28 9:22
 */
public class Easy_690_EmployeeImportance {

    private Map<Integer, Employee> map = new HashMap<>();

    // 方法：DFS
    //Runtime: 3 ms, faster than 100.00% of Java online submissions for Employee Importance.
    //Memory Usage: 41.2 MB, less than 51.67% of Java online submissions for Employee Importance.
    public int getImportance(List<Employee> employees, int id) {
        for (Employee employee : employees)
            map.put(employee.id, employee);
        return dfs(id);
    }

    public int dfs(Integer id) {
        Employee employee = map.get(id);
        int sum = employee.importance;
        for (Integer subId : employee.subordinates) {
            sum += dfs(subId);
        }
        return sum;
    }

}
