package BalancedTree;

import javax.swing.tree.TreeNode;

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
    public boolean isBalanced(TreeNode root) {

        if(root == null)
            return true;

        int left = bal(root.left);
        int right = bal(root.right);

        return Math.abs(left-right) <= 1 && isBalanced(root.left) && isBalanced(root.right);

    }

    private int bal(TreeNode root){

        if(root == null)
            return 0;

        return Math.max(bal(root.left) , bal(root.right)) + 1;
    }
}
