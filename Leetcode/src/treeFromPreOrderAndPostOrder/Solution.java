package treeFromPreOrderAndPostOrder;

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

    int preInd = 0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {

        preInd = 0;

        return traverse(preorder, inorder, 0,inorder.length-1);

    }

    private TreeNode traverse(int pre[] , int in[], int inInd, int inEnd){



        if(preInd >= pre.length || inInd > inEnd){
            return null;
        }

        int index = pre[preInd];
        int ind = -1;
        for(int i = inInd; i <= inEnd ;i++){
            if(index == in[i]){
                ind = i;
                break;
            }
        }

        if(ind == -1)
            return null;

        TreeNode root = new TreeNode(index);

        preInd++;

        root.left = traverse(pre, in, inInd, ind-1);
        root.right = traverse(pre,in, ind+1, inEnd);

        return root;
    }
}
