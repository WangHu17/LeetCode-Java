import bean.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author wanghu
 * @discrption： 给定一棵二叉树的根，以数组的形式返回每一层节点的平均值。将接受实际答案的 10-5 以内的答案。
 * @create 2021-12-04 14:17
 */
public class Easy_637_AverageOfLevelsInBinaryTree {

    //方法：BFS
    //Runtime: 2 ms, faster than 84.56% of Java online submissions for Average of Levels in Binary Tree.
    //Memory Usage: 40.6 MB, less than 95.58% of Java online submissions for Average of Levels in Binary Tree.
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            long sum = 0, count = 0;
            Queue<TreeNode> temp = new LinkedList<>();
            while (!queue.isEmpty()) {
                TreeNode node = queue.poll();
                sum += node.val;
                count++;
                if (node.left != null) temp.offer(node.left);
                if (node.right != null) temp.offer(node.right);
            }
            queue = temp;
            res.add(sum * 1.0 / count);
        }
        return res;
    }

}
