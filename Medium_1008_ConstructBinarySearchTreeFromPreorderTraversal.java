import bean.TreeNode;

/**
 * @author wanghu
 * @discrption： 返回与给定前序遍历preorder 相匹配的二叉搜索树（binary search tree）的根结点。
 *
 * (回想一下，二叉搜索树是二叉树的一种，其每个节点都满足以下规则，对于node.left的任何后代，
 * 值总 < node.val，而 node.right 的任何后代，值总 > node.val。此外，前序遍历首先显示节点node 的值，
 * 然后遍历 node.left，接着遍历 node.right。）
 * @create 2022-01-17 19:12
 */
public class Medium_1008_ConstructBinarySearchTreeFromPreorderTraversal {

    //方法一：数组第一个值是根节点，遍历数组，每个值的插入都要遍历树，大的往右遍历，小的往左遍历，最后插入
    //Runtime: 1 ms, faster than 42.80% of Java online submissions for Construct Binary Search Tree from Preorder Traversal.
    //Memory Usage: 39 MB, less than 24.00% of Java online submissions for Construct Binary Search Tree from Preorder Traversal.
    public TreeNode bstFromPreorder(int[] preorder) {
        TreeNode root = new TreeNode(preorder[0]);
        if (preorder.length == 1)return root;
        for (int i=1;i<preorder.length;i++){
            insertToBST(root,preorder[i]);
        }
        return root;
    }

    private void insertToBST(TreeNode node, int value) {
        if (value < node.val) {
            if (node.left == null)
                node.left = new TreeNode(value);
            else insertToBST(node.left,value);
        }else {
            if (node.right == null)
                node.right = new TreeNode(value);
            else insertToBST(node.right,value);
        }
    }

}
