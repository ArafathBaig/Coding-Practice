package Pathsum;

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
    public boolean hasPathSum(TreeNode root, int targetSum) {

        int sum = 0;

        return traverse(root,sum, targetSum);

    }

    private boolean traverse(TreeNode root, int sum , int target){

        if(root == null)
            return false;

        if(root.left == null && root.right == null && root.val + sum == target)
            return true;

        return traverse(root.left,sum+root.val,target) || traverse(root.right,sum+root.val, target);
    }
}