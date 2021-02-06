package FlattenBinaryTree;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public void flatten(TreeNode root) {
        traverse(root);
    }

    private TreeNode traverse(TreeNode root){

        if(root == null)
            return null;

        TreeNode left = traverse(root.left);
        TreeNode right = traverse(root.right);

        TreeNode pre = left;
        while(pre != null && pre.right != null){
            pre = pre.right;
        }

        if(pre != null){
            pre.right = root.right;
            root.right = left;
            root.left = null;
        }


        return root;
    }
}