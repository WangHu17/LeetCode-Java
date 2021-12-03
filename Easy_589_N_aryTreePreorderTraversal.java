import bean.Node;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wanghu
 * @discrption： 给定 n 元树的根，返回其节点值的前序遍历。 Nary-Tree 输入序列化以它们的级别顺序遍历来表示。每组子项由空值分隔（参见示例）
 * @create 2021-11-26 10:53
 */
public class Easy_589_N_aryTreePreorderTraversal {

    //我的方法
    //Runtime: 1 ms, faster than 58.78% of Java online submissions for N-ary Tree Preorder Traversal.
    //Memory Usage: 42.9 MB, less than 23.73% of Java online submissions for N-ary Tree Preorder Traversal.
    List<Integer> list = new ArrayList<>();

    public List<Integer> preorder(Node root) {
        if (root == null) return list;
        list.add(root.val);
        for (Node child : root.children) {
            preorder(child);
        }
        return list;
    }

}
