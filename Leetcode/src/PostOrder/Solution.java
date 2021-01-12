package PostOrder;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

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
    public List<Integer> postorderTraversal(TreeNode root) {



        List<Integer> res = new ArrayList<>();

        if(root == null)
            return res;

        Stack<TreeNode> stack = new Stack<>();

        stack.push(root);
        TreeNode add = root;
        while(!stack.isEmpty()){
            TreeNode next = add.left;

            if(next != null){
                stack.push(next);
                add = add.left;
            }else{

                while(!stack.isEmpty() && stack.peek().right == null){
                    res.add(stack.pop().val);
                }

                if(!stack.isEmpty()){
                    add = stack.peek();
                    stack.push(add.right);
                    add.right = null;
                    add= stack.peek();
                }


            }

        }

        return res;

    }
}