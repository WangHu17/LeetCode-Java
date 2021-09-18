/**
 * @author wanghu
 * @discrption： 在不使用任何内置哈希表库的情况下设计 HashSet。
 * @create 2021-09-18 10:08
 */
public class Easy_705_DesignHashSet {

    //Runtime: 9 ms, faster than 100.00% of Java online submissions for Design HashSet.
    //Memory Usage: 47.5 MB, less than 49.59% of Java online submissions for Design HashSet.

    boolean[] arr;

    /** Initialize your data structure here. */
    public Easy_705_DesignHashSet() {
        arr = new boolean[100001];
    }

    public void add(int key) {
        arr[key] = true;
    }

    public void remove(int key) {
        arr[key] = false;
    }

    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        return arr[key];
    }

}
