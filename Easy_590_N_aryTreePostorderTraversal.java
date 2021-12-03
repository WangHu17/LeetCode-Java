import bean.Node;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wanghu
 * @discrption： 给定 n 元树的根，返回其节点值的后序遍历。 Nary-Tree 输入序列化以它们的级别顺序遍历来表示。每组子项由空值分隔（参见示例）
 * @create 2021-11-26 11:02
 */
public class Easy_590_N_aryTreePostorderTraversal {

    //我的方法
    //Runtime: 1 ms, faster than 57.39% of Java online submissions for N-ary Tree Postorder Traversal.
    //Memory Usage: 43.2 MB, less than 16.99% of Java online submissions for N-ary Tree Postorder Traversal.
    List<Integer> list = new ArrayList<>();

    public List<Integer> postorder(Node root) {
        if (root == null) return list;
        for (Node child : root.children) {
            postorder(child);
        }
        list.add(root.val);
        return list;
    }

}
