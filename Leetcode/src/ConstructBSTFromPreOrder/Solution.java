package ConstructBSTFromPreOrder;

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
    public TreeNode bstFromPreorder(int[] preorder) {

        return constructTree(preorder,0,preorder.length-1);
    }

    private TreeNode constructTree(int pre[], int si, int ei){

        if(si> ei)
            return null;

        int next = ei+1;

        for(int i = si+1; i <= ei ;i++){

            if(pre[si] < pre[i]){
                next = i;
                break;
            }
        }

        TreeNode root = new TreeNode(pre[si]);
        root.left = constructTree(pre,si+1, next-1);
        root.right = constructTree(pre,next,ei);

        return root;
    }
}