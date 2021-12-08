import bean.Node;

/**
 * @author wanghu
 * @discrption： 给定一个 n 叉树，找到它的最大深度。 最大深度是沿着从根节点到最远叶节点的最长路径的节点数。
 * @create 2021-12-08 9:42
 */
public class Easy_559_MaximumDepthOfN_aryTree {

    //方法：DFS
    //Runtime: 1 ms, faster than 48.57% of Java online submissions for Maximum Depth of N-ary Tree.
    //Memory Usage: 40.7 MB, less than 28.86% of Java online submissions for Maximum Depth of N-ary Tree.
    private int depth = 0;

    public int maxDepth(Node root) {
        dfs(root,0);
        return depth;
    }

    private void dfs(Node node, int cur) {
        if (node != null) {
            cur++;
            if (cur > depth) depth = cur;
            for (int i = 0; i < node.children.size(); i++)
                dfs(node.children.get(i), cur);
        }
    }

}
