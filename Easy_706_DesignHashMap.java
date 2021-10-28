import java.util.Arrays;

/**
 * @author wanghu
 * @discrption： 在不使用任何内置哈希表库的情况下设计 HashMap。
 * @create 2021-10-28 10:20
 */
public class Easy_706_DesignHashMap {

    //我的方法：使用数组
    //Runtime: 34 ms, faster than 47.37% of Java online submissions for Design HashMap.
    //Memory Usage: 47.3 MB, less than 54.63% of Java online submissions for Design HashMap.

    private int[] map;

    /** Initialize your data structure here. */
    public Easy_706_DesignHashMap() {
        map = new int[1000001];
        Arrays.fill(map,-1);
    }

    /** value will always be non-negative. */
    public void put(int key, int value) {
        map[key] = value;
    }

    /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
    public int get(int key) {
        return map[key];
    }

    /** Removes the mapping of the specified value key if this map contains a mapping for the key */
    public void remove(int key) {
        map[key] = -1;
    }

}
