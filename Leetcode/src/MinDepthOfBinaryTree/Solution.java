package MinDepthOfBinaryTree;

import javax.swing.tree.TreeNode;

class Solution {
    public int minDepth(TreeNode root) {

        if(root == null) return 0;



        int left = 1, right = 1;

        left = left + minDepth(root.left);
        right = right + minDepth(root.right);

        if(left == 1 && right > 1){
            return right;
        }

        if(left > 1 && right == 1){
            return left;
        }
        return Math.min(left,right);
    }

//     private int depth(TreeNode root){

//         if(root == null) return 0;

//         int left = 0 , right = 0;

//         left = left + depth(root.left);
//         right = right + depth(root.right);

//         return Math.max(left,right) + 1;
//     }
}