package MaxpathSum;

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
    int ans = 0;
    public int maxPathSum(TreeNode root) {

        ans = Integer.MIN_VALUE;
        maxPath(root);
        return ans;
    }

    private int maxPath(TreeNode root){

        if(root == null)
            return 0;

        int left = maxPath(root.left);
        int right = maxPath(root.right);

        int  temp = Math.max(left + root.val, right + root.val);
        temp = Math.max(temp,root.val);
        int tempAns = Math.max(temp, left+right+root.val);
        ans = Math.max(ans,tempAns);

        return temp;

    }
}