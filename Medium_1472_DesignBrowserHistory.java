import java.util.ArrayList;

/**
 * @author wanghu
 * @discrption： 你有一个只支持单个标签页的 浏览器，最开始你浏览的网页是homepage，你可以访问其他的网站url，
 * 也可以在浏览历史中后退steps步或前进steps步。
 * <p>
 * 请你实现BrowserHistory 类：
 * <p>
 * BrowserHistory(string homepage)，用homepage初始化浏览器类。
 * void visit(string url)从当前页跳转访问 url 对应的页面。执行此操作会把浏览历史前进的记录全部删除。
 * string back(int steps)在浏览历史中后退steps步。如果你只能在浏览历史中后退至多x 步且steps > x，
 * 那么你只后退x步。请返回后退 至多 steps步以后的url。
 * string forward(int steps)在浏览历史中前进steps步。如果你只能在浏览历史中前进至多x步且steps > x，
 * 那么你只前进 x步。请返回前进至多steps步以后的 url。
 * @create 2022-01-23 14:18
 */
public class Medium_1472_DesignBrowserHistory {

    //Runtime: 45 ms, faster than 92.64% of Java online submissions for Design Browser History.
    //Memory Usage: 47.8 MB, less than 52.08% of Java online submissions for Design Browser History.
    private ArrayList<String> list;
    private int index = 0; //当前标签所在的位置
    private int total = 0; //有效的标签末尾位置

    public Medium_1472_DesignBrowserHistory(String homepage) {
        list = new ArrayList<String>();
        list.add(homepage);
    }

    //不删除前进的标签，而是利用total变量记录有效的标签总数
    public void visit(String url) {
        if (list.size() > index + 1) {
            list.set(index + 1, url);
        } else {
            list.add(url);
        }
        index++;
        total = index;
    }

    public String back(int steps) {
        if (steps > index) {
            index = 0;
        } else
            index -= steps;
        return list.get(index);
    }

    public String forward(int steps) {
        if (steps + index > total) {
            index = total;
        } else
            index += steps;
        return list.get(index);
    }

}
