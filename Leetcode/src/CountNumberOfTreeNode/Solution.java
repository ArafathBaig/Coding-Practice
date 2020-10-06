package CountNumberOfTreeNode;

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
    public int countNodes(TreeNode root) {

        if(root == null)
            return 0;

        int left = countLeft(root.left);
        int right = countRight(root.right);

        System.out.println(left+" "+right);

        if(left == right)
            return (1 << left) - 1 ;
        else
            return 1 + countNodes(root.left) + countNodes(root.right);

    }

    private int countLeft(TreeNode root){

        int dep = 1;

        while(root!=null){
            dep++;
            root = root.left;
        }

        return dep;
    }

    private int countRight(TreeNode root){
        int dep = 1;

        while(root!=null){
            dep++;
            root = root.right;
        }

        return dep;
    }
}