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
    
    public int sumOfLeftLeaves(TreeNode root) {
        
        return traverse(root,false);
 
    }
    
    private int traverse(TreeNode root,boolean left){
        

        if(root == null)
            return 0;

        
                if(left && root.left == null && root.right == null){
            return root.val;
        }
        
        int sum = traverse(root.left, true);
        sum += traverse(root.right, false);
        
        return sum;
    }
}