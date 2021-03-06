package Inorder;

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
    public List<Integer> inorderTraversal(TreeNode root) {

        if(root == null)
            return new ArrayList<>();

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        List<Integer> list = new ArrayList<>();
        while(!stack.isEmpty()){

            while(root !=  null && root.left!= null){
                root = root.left;
                stack.push(root);
            }

            root = stack.pop();

            if(root.right != null){
                stack.push(root.right);
            }

            list.add(root.val);
            root = root.right;
        }

        return list;
    }
}