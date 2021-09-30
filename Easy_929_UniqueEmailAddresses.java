import org.junit.Test;
import java.util.HashSet;

/**
 * @author wanghu
 * @discrption： 求不同地址的邮箱数，@前面的是本地名，后面的是域名。本地名只看+号前面的，不包含‘.’。域名要包含‘.’
 * Example 1:
 * Input: emails = ["test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"]
 * Output: 2
 * @create 2021-09-30 9:37
 */
public class Easy_929_UniqueEmailAddresses {

    //我的方法
    //Runtime: 26 ms, faster than 28.24% of Java online submissions for Unique Email Addresses.
    //Memory Usage: 38.7 MB, less than 96.31% of Java online submissions for Unique Email Addresses.
    public int numUniqueEmails(String[] emails) {
        HashSet<String> set = new HashSet<>();
        for (String email : emails) {
            String s = "";
            int flag1 = 1, flag2 = 0;
            //"test.email+alex@leetcode.com"
            for (Character c : email.toCharArray()) {
                if (c.equals('+')) flag1 = 0;
                if (c.equals('@')) {
                    flag1 = 0;
                    flag2 = 1;
                }
                if (!c.equals('.') && flag1 == 1) s += c;
                if (flag2 == 1) s += c;
            }
            set.add(s);
        }
//        for (String s:set) System.out.println(s);
        return set.size();
    }

    @Test
    public void test(){
        String[] emails = new String[]{"test.email+alex@leetcode.com", "test.email@leetcode.com"};
        System.out.println(numUniqueEmails(emails));
    }

}
