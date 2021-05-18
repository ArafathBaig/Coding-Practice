/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode() {} TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) { this.val = val; this.left
 * = left; this.right = right; } }
 */
class Solution {

    int max = 0;

    public int diameterOfBinaryTree(TreeNode root) {

        max = 0;
        dia(root);

        return max - 1;
    }

    private int dia(TreeNode root) {

        if (root == null)
            return 0;

        int left = dia(root.left);
        int right = dia(root.right);

        int temp = Math.max(left, right) + 1;
        max = Math.max(max, left + right + 1);

        return temp;

    }
}