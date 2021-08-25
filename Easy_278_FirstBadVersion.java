/**
 * @author wanghu
 * @discrption： 找出第一个坏的版本，坏的版本后面都是坏的
 * @create 2021-08-25 10:59
 */
public class Easy_278_FirstBadVersion {

    //二分查找
    //Runtime: 12 ms, faster than 98.23% of Java online submissions for First Bad Version.
    //Memory Usage: 35.3 MB, less than 95.24% of Java online submissions for First Bad Version.
    public int firstBadVersion(int n) {
        int begin=1, end=n;
        int mid = 0;
        while(begin <= end){
            mid = begin + (end - begin)/2;
            if(isBadVersion(mid)){
                end = mid - 1;
            }else{
                begin = mid + 1;
            }
        }
        return begin;
    }

    //此方法为leetcode提供的方法，此处仅用于防止报错
    public boolean isBadVersion(int n){
        return true;
    }

}
