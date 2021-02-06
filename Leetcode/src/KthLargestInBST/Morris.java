package KthLargestInBST;

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
class Morris {
    public int kthSmallest(TreeNode root, int k) {

        while(root != null){

            if(root.left == null){
                k--;

                if(k==0)
                    return root.val;

                root = root.right;
            }else{

                TreeNode pre = root.left;

                while(pre.right != null && pre.right != root)
                    pre = pre.right;


                if(pre.right == null){
                    pre.right = root;
                    root=root.left;
                }else{

                    pre.right = null;
                    k--;
                    if(k==0)
                        return root.val;

                    root = root.right;


                }
            }



        }


        return -1;
    }
}