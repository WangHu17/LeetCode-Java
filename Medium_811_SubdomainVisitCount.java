import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author wanghu
 * @discrption： 网站域名 "discuss.leetcode.com" 由多个子域名组成。顶级域名为 "com" ，
 * 二级域名为 "leetcode.com" ，最低一级为 "discuss.leetcode.com" 。当访问域名 "discuss.leetcode.com"
 * 时，同时也会隐式访问其父域名 "leetcode.com" 以及 "com" 。
 * <p>
 * 计数配对域名 是遵循 "rep d1.d2.d3" 或 "rep d1.d2" 格式的一个域名表示，其中 rep 表示访问域名的次数，
 * d1.d2.d3 为域名本身。
 * <p>
 * 示例 1：
 * 输入：cpdomains = ["9001 discuss.leetcode.com"]
 * 输出：["9001 leetcode.com","9001 discuss.leetcode.com","9001 com"]
 * 解释：例子中仅包含一个网站域名："discuss.leetcode.com"。
 * 按照前文描述，子域名 "leetcode.com" 和 "com" 都会被访问，所以它们都被访问了 9001 次。
 * @create 2022-01-23 16:23
 */
public class Medium_811_SubdomainVisitCount {

    //我的方法：注意：分割"."符号要写成"\\."
    //Runtime: 26 ms, faster than 55.33% of Java online submissions for Subdomain Visit Count.
    //Memory Usage: 48.9 MB, less than 33.41% of Java online submissions for Subdomain Visit Count.
    public List<String> subdomainVisits(String[] cpdomains) {
        ArrayList<String> res = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();
        for (String domain : cpdomains) {
            String[] split = domain.split(" ");
            Integer num = Integer.parseInt(split[0]);
            map.put(split[1], map.getOrDefault(split[1], 0) + num);//最初域名
            //如果是二级域名
            if (split[1].contains(".")) {
                String[] split1 = split[1].split("\\.", 2);
                map.put(split1[1], map.getOrDefault(split1[1], 0) + num);//二级或顶级域名
                //如果是3级域名
                if (split1[1].contains(".")) {
                    String[] split2 = split1[1].split("\\.");
                    map.put(split2[1], map.getOrDefault(split2[1], 0) + num);//顶级域名
                }
            }
        }
        for (String domain : map.keySet()) {
            Integer num = map.get(domain);
            String ans = num + " " + domain;
            res.add(ans);
        }
        return res;
    }

    @Test
    public void test() {
        String[] cpdomains = {"9001 discuss.leetcode.com"};
        subdomainVisits(cpdomains);
    }

}
