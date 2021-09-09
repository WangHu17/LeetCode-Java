import java.util.Arrays;

/**
 * @author wanghu
 * @discrption： 妈妈发饼干，g数组代表孩子们想要的饼干大小，s数组代表饼干们的大小，为尽量满足多的孩子需求，求能满足的孩子数量
 * Example 1:
 * Input: g = [1,2,3], s = [1,1]
 * Output: 1
 *
 * Example 2:
 * Input: g = [1,2], s = [1,2,3]
 * Output: 2
 * @create 2021-09-09 10:28
 */
public class Easy_455_AssignCookies {

    //我的方法
    //Runtime: 6 ms, faster than 98.49% of Java online submissions for Assign Cookies.
    //Memory Usage: 40 MB, less than 29.16% of Java online submissions for Assign Cookies.
    public int findContentChildren(int[] g, int[] s) {
        int i=0 ,j=0, sum=0;
        Arrays.sort(g);
        Arrays.sort(s);
        while (i<g.length && j<s.length){
            if(s[j]>=g[i]){
                sum++;
                i++;
                j++;
            }else {
                j++;
            }
        }
        return sum;
    }

}
