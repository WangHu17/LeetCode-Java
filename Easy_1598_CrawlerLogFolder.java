/**
 * @author wanghu
 * @discrption： 每次用户执行更改文件夹操作时，Leetcode 文件系统都会保留一个日志。
 * 操作说明如下：
 *      "../" : 移动到当前文件夹的父文件夹。 （如果您已经在主文件夹中，请留在同一个文件夹中）。
 *      "./" : 留在同一个文件夹中。
 *      "x/" ：移动到名为 x 的子文件夹（该文件夹保证一直存在）。
 * 您将获得一个字符串日志列表，其中 logs[i] 是用户在第 i 步执行的操作。 文
 * 件系统从主文件夹开始，然后执行日志中的操作。
 * 返回更改文件夹操作后返回主文件夹所需的最少操作次数。
 * @create 2021-11-29 18:34
 */
public class Easy_1598_CrawlerLogFolder {

    //我的方法
    //Runtime: 0 ms, faster than 100.00% of Java online submissions for Crawler Log Folder.
    //Memory Usage: 38.9 MB, less than 40.13% of Java online submissions for Crawler Log Folder.
    public int minOperations(String[] logs) {
        int sum=0;
        for (String s:logs){
            if (s.equals("../")){
                if (sum>0)
                    sum--;
            }else if (s.equals("./")){

            }else {
                sum++;
            }
        }
        return Math.max(sum, 0);
    }

}
